$(function(){
	initAlarm();
	initImgCenter();
	initClock();
	
	$(window).resize(function(){
		$("body").find("div.select-content").hide();
	});
	
	function initAlarm() {
		$.ajax({  
			url:'warn/getAlarmList',  
			type:'post',      
			data: {}, 
			dataType:'json',  
			success:function(data){  
				if (data.code == 200) {
					let alarmName = data.data.list[0].alarmName;
					$("#safeChartTopical").html(alarmName);
					$("#illegalChartTopical").html(alarmName);
					$("#dangerChartTopical").html(alarmName);
					let optionHtml = "";
					for (var i = 0; i < data.data.list.length; i++) {
						optionHtml += "<option value='" + data.data.list[i].alarmId + "'>" + data.data.list[i].alarmName + "</option>";
					}
					$(".alarm-select").html(optionHtml);
					layui.use('form',function () { 
						var form = layui.form //获取form模块
						form.render('select');
						form.on('select(alarm)', function(data){
			                let alarmId = data.value;
			                let alarmName = data.elem[data.elem.selectedIndex].text;
			                let parentId = $(data.elem).parents(".select-body").parent().attr("id");
			                if (parentId == "safeChartBody") {
			                	$("#safeChartTopical").html(alarmName);
			                	safeChartConfig.initSafeChart();
							} else if (parentId == "illegalChartBody") {
								$("#illegalChartTopical").html(alarmName);
								illegalChartConfig.initIllegalChart();
							} else if (parentId == "dangerChartBody") {
								$("#dangerChartTopical").html(alarmName);
								dangerChartConfig.initDangerChart();
							}
			                setAlarmIds2TotalChart();////设置选中的算法集合
			                totalChartConfig.initComplexChart();
						});
					});
					
					safeChartConfig.initSafeChart();
					illegalChartConfig.initIllegalChart();
					dangerChartConfig.initDangerChart();
					
					setAlarmIds2TotalChart();//设置选中的算法集合
					
					totalChartConfig.initComplexChart();
				}
			}  
		}); 
	}
	/**
	 * 设置选中的算法集合
	 */
	function setAlarmIds2TotalChart() {
		let safeAlarmId = $("#safeChartBody").find("select.alarm-select").val();
		let illegalAlarmId = $("#illegalChartBody").find("select.alarm-select").val();
		let dangerAlarmId = $("#dangerChartBody").find("select.alarm-select").val();
		let alarmids = safeAlarmId + "," + illegalAlarmId +"," + dangerAlarmId;
		$("#totalChartContent").attr("alarmids", alarmids);
	}
	/**
	 * 初始化图片
	 */
	function initImgCenter() {
		$.ajax({  
			url:'user/getImgCenter',  
			type:'post',      
			data: {}, 
			dataType:'json',  
			success:function(data){  
				if (data.code == 200 && data.data.imgPath != null) {
					$("#imgCenter").attr("src",data.data.imgPath);
				}
			}  
		});  
	}
	
	function initClock() {
		var newTime = '';
		getLangDate();
	}

	function getLangDate(){
		var dateObj = new Date(); //表示当前系统时间的Date对象
		var year = dateObj.getFullYear(); //当前系统时间的完整年份值
		var month = dateObj.getMonth()+1; //当前系统时间的月份值
		var date = dateObj.getDate(); //当前系统时间的月份中的日
		var day = dateObj.getDay(); //当前系统时间中的星期值
		var weeks = ["星期日","星期一","星期二","星期三","星期四","星期五","星期六"];
		var week = weeks[day]; //根据星期值，从数组中获取对应的星期字符串
		var hour = dateObj.getHours(); //当前系统时间的小时值
		var minute = dateObj.getMinutes(); //当前系统时间的分钟值
		var second = dateObj.getSeconds(); //当前系统时间的秒钟值
		var timeValue = "" +((hour >= 12) ? "PM" : "AM" ); //当前时间属于上午、晚上还是下午
		newTime = dateFilter(hour) + ":" + dateFilter(minute) + ":" + dateFilter(second);
		newDate = dateFilter(year) + "-" +dateFilter(month) + "-" + dateFilter(date) + " ";
		document.getElementById("nowTime").innerHTML = newTime;
		document.getElementById("nowDate").innerHTML = newDate + " " + week + " " + timeValue;
		setTimeout(getLangDate,1000);
	}

	function dateFilter(date){ //值小于10时，在前面补0
		if(date < 10){
			return "0" + date;
		}
		return date;
	}
	
	/**
	 * 选择算法
	 */
	//文件上传
	$("#upload-file").on("change",function(){
		let file = $(this).val();
		var formData = new FormData();
		formData.append("file",$("#upload-file")[0].files[0]);
		$.ajax({
	           type:"POST",
	           url: "user/uploadImg",
	           data:formData,
	           dataType:"json",
	           mimeType:"multipart/form-data",
	           cache:false,
	           processData:false,
	           contentType:false,
	           success:function(data){
					if (data.code == 200 && data.data.imgPath != null) {
						$("#imgCenter").attr("src",data.data.imgPath);
					}
		       }
		});
	});
	
});