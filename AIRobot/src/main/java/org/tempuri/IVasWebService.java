package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.3
 * 2019-08-26T20:36:20.402+08:00
 * Generated source version: 3.3.3
 *
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "IVasWebService")
@XmlSeeAlso({com.microsoft.schemas._2003._10.serialization.ObjectFactory.class, ObjectFactory.class, com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory.class})
public interface IVasWebService {

    @WebMethod(operationName = "DoWork", action = "http://tempuri.org/IVasWebService/DoWork")
    @Action(input = "http://tempuri.org/IVasWebService/DoWork", output = "http://tempuri.org/IVasWebService/DoWorkResponse")
    @RequestWrapper(localName = "DoWork", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DoWork")
    @ResponseWrapper(localName = "DoWorkResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DoWorkResponse")
    public void doWork()
;

    @WebMethod(operationName = "GetChannelHost_Rtsp", action = "http://tempuri.org/IVasWebService/GetChannelHost_Rtsp")
    @Action(input = "http://tempuri.org/IVasWebService/GetChannelHost_Rtsp", output = "http://tempuri.org/IVasWebService/GetChannelHost_RtspResponse")
    @RequestWrapper(localName = "GetChannelHost_Rtsp", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetChannelHostRtsp")
    @ResponseWrapper(localName = "GetChannelHost_RtspResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetChannelHostRtspResponse")
    @WebResult(name = "GetChannelHost_RtspResult", targetNamespace = "http://tempuri.org/")
    public java.lang.String getChannelHostRtsp(

        @WebParam(name = "hostId", targetNamespace = "http://tempuri.org/")
        java.lang.Integer hostId
    );

    @WebMethod(operationName = "AlarmInfo_GetRecordCount", action = "http://tempuri.org/IVasWebService/AlarmInfo_GetRecordCount")
    @Action(input = "http://tempuri.org/IVasWebService/AlarmInfo_GetRecordCount", output = "http://tempuri.org/IVasWebService/AlarmInfo_GetRecordCountResponse")
    @RequestWrapper(localName = "AlarmInfo_GetRecordCount", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AlarmInfoGetRecordCount")
    @ResponseWrapper(localName = "AlarmInfo_GetRecordCountResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AlarmInfoGetRecordCountResponse")
    @WebResult(name = "AlarmInfo_GetRecordCountResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Integer alarmInfoGetRecordCount(

        @WebParam(name = "year", targetNamespace = "http://tempuri.org/")
        java.lang.Integer year,
        @WebParam(name = "month", targetNamespace = "http://tempuri.org/")
        java.lang.Integer month,
        @WebParam(name = "day", targetNamespace = "http://tempuri.org/")
        java.lang.Integer day,
        @WebParam(name = "strWhere", targetNamespace = "http://tempuri.org/")
        java.lang.String strWhere
    );

    @WebMethod(operationName = "Counter_GetYear12MonthFlowCounterDataByEventType", action = "http://tempuri.org/IVasWebService/Counter_GetYear12MonthFlowCounterDataByEventType")
    @Action(input = "http://tempuri.org/IVasWebService/Counter_GetYear12MonthFlowCounterDataByEventType", output = "http://tempuri.org/IVasWebService/Counter_GetYear12MonthFlowCounterDataByEventTypeResponse")
    @RequestWrapper(localName = "Counter_GetYear12MonthFlowCounterDataByEventType", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CounterGetYear12MonthFlowCounterDataByEventType")
    @ResponseWrapper(localName = "Counter_GetYear12MonthFlowCounterDataByEventTypeResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CounterGetYear12MonthFlowCounterDataByEventTypeResponse")
    @WebResult(name = "Counter_GetYear12MonthFlowCounterDataByEventTypeResult", targetNamespace = "http://tempuri.org/")
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble counterGetYear12MonthFlowCounterDataByEventType(

        @WebParam(name = "hostId", targetNamespace = "http://tempuri.org/")
        java.lang.Integer hostId,
        @WebParam(name = "year", targetNamespace = "http://tempuri.org/")
        java.lang.Integer year,
        @WebParam(name = "alarmEventType", targetNamespace = "http://tempuri.org/")
        java.lang.String alarmEventType
    );

    @WebMethod(operationName = "ReStartupApp", action = "http://tempuri.org/IVasWebService/ReStartupApp")
    @Action(input = "http://tempuri.org/IVasWebService/ReStartupApp", output = "http://tempuri.org/IVasWebService/ReStartupAppResponse")
    @RequestWrapper(localName = "ReStartupApp", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ReStartupApp")
    @ResponseWrapper(localName = "ReStartupAppResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ReStartupAppResponse")
    public void reStartupApp()
;

    @WebMethod(operationName = "GetChannelHostInfo", action = "http://tempuri.org/IVasWebService/GetChannelHostInfo")
    @Action(input = "http://tempuri.org/IVasWebService/GetChannelHostInfo", output = "http://tempuri.org/IVasWebService/GetChannelHostInfoResponse")
    @RequestWrapper(localName = "GetChannelHostInfo", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetChannelHostInfo")
    @ResponseWrapper(localName = "GetChannelHostInfoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetChannelHostInfoResponse")
    @WebResult(name = "GetChannelHostInfoResult", targetNamespace = "http://tempuri.org/")
    public java.lang.String getChannelHostInfo(

        @WebParam(name = "hostId", targetNamespace = "http://tempuri.org/")
        java.lang.Integer hostId
    );

    @WebMethod(operationName = "GetChannelDetectObjs", action = "http://tempuri.org/IVasWebService/GetChannelDetectObjs")
    @Action(input = "http://tempuri.org/IVasWebService/GetChannelDetectObjs", output = "http://tempuri.org/IVasWebService/GetChannelDetectObjsResponse")
    @RequestWrapper(localName = "GetChannelDetectObjs", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetChannelDetectObjs")
    @ResponseWrapper(localName = "GetChannelDetectObjsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetChannelDetectObjsResponse")
    @WebResult(name = "GetChannelDetectObjsResult", targetNamespace = "http://tempuri.org/")
    public java.lang.String getChannelDetectObjs(

        @WebParam(name = "hostId", targetNamespace = "http://tempuri.org/")
        java.lang.Integer hostId,
        @WebParam(name = "ruleIndex", targetNamespace = "http://tempuri.org/")
        java.lang.Integer ruleIndex
    );

    @WebMethod(operationName = "Counter_GetRecordCount", action = "http://tempuri.org/IVasWebService/Counter_GetRecordCount")
    @Action(input = "http://tempuri.org/IVasWebService/Counter_GetRecordCount", output = "http://tempuri.org/IVasWebService/Counter_GetRecordCountResponse")
    @RequestWrapper(localName = "Counter_GetRecordCount", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CounterGetRecordCount")
    @ResponseWrapper(localName = "Counter_GetRecordCountResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CounterGetRecordCountResponse")
    @WebResult(name = "Counter_GetRecordCountResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Integer counterGetRecordCount(

        @WebParam(name = "strWhere", targetNamespace = "http://tempuri.org/")
        java.lang.String strWhere
    );

    @WebMethod(operationName = "GetFileBytesForBase64", action = "http://tempuri.org/IVasWebService/GetFileBytesForBase64")
    @Action(input = "http://tempuri.org/IVasWebService/GetFileBytesForBase64", output = "http://tempuri.org/IVasWebService/GetFileBytesForBase64Response")
    @RequestWrapper(localName = "GetFileBytesForBase64", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetFileBytesForBase64")
    @ResponseWrapper(localName = "GetFileBytesForBase64Response", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetFileBytesForBase64Response")
    @WebResult(name = "GetFileBytesForBase64Result", targetNamespace = "http://tempuri.org/")
    public java.lang.String getFileBytesForBase64(

        @WebParam(name = "filePath", targetNamespace = "http://tempuri.org/")
        java.lang.String filePath
    );

    @WebMethod(operationName = "Counter_GetYear12MonthFlowCounterData", action = "http://tempuri.org/IVasWebService/Counter_GetYear12MonthFlowCounterData")
    @Action(input = "http://tempuri.org/IVasWebService/Counter_GetYear12MonthFlowCounterData", output = "http://tempuri.org/IVasWebService/Counter_GetYear12MonthFlowCounterDataResponse")
    @RequestWrapper(localName = "Counter_GetYear12MonthFlowCounterData", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CounterGetYear12MonthFlowCounterData")
    @ResponseWrapper(localName = "Counter_GetYear12MonthFlowCounterDataResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CounterGetYear12MonthFlowCounterDataResponse")
    @WebResult(name = "Counter_GetYear12MonthFlowCounterDataResult", targetNamespace = "http://tempuri.org/")
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble counterGetYear12MonthFlowCounterData(

        @WebParam(name = "year", targetNamespace = "http://tempuri.org/")
        java.lang.Integer year
    );

    @WebMethod(operationName = "ChannelInfo_GetHostList", action = "http://tempuri.org/IVasWebService/ChannelInfo_GetHostList")
    @Action(input = "http://tempuri.org/IVasWebService/ChannelInfo_GetHostList", output = "http://tempuri.org/IVasWebService/ChannelInfo_GetHostListResponse")
    @RequestWrapper(localName = "ChannelInfo_GetHostList", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ChannelInfoGetHostList")
    @ResponseWrapper(localName = "ChannelInfo_GetHostListResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ChannelInfoGetHostListResponse")
    @WebResult(name = "ChannelInfo_GetHostListResult", targetNamespace = "http://tempuri.org/")
    public java.lang.String channelInfoGetHostList()
;

    @WebMethod(operationName = "AlarmInfo_GetRecordList", action = "http://tempuri.org/IVasWebService/AlarmInfo_GetRecordList")
    @Action(input = "http://tempuri.org/IVasWebService/AlarmInfo_GetRecordList", output = "http://tempuri.org/IVasWebService/AlarmInfo_GetRecordListResponse")
    @RequestWrapper(localName = "AlarmInfo_GetRecordList", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AlarmInfoGetRecordList")
    @ResponseWrapper(localName = "AlarmInfo_GetRecordListResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AlarmInfoGetRecordListResponse")
    @WebResult(name = "AlarmInfo_GetRecordListResult", targetNamespace = "http://tempuri.org/")
    public java.lang.String alarmInfoGetRecordList(

        @WebParam(name = "year", targetNamespace = "http://tempuri.org/")
        java.lang.Integer year,
        @WebParam(name = "month", targetNamespace = "http://tempuri.org/")
        java.lang.Integer month,
        @WebParam(name = "day", targetNamespace = "http://tempuri.org/")
        java.lang.Integer day,
        @WebParam(name = "strWhere", targetNamespace = "http://tempuri.org/")
        java.lang.String strWhere
    );

    @WebMethod(operationName = "AlarmInfo_GetLastListTopNum", action = "http://tempuri.org/IVasWebService/AlarmInfo_GetLastListTopNum")
    @Action(input = "http://tempuri.org/IVasWebService/AlarmInfo_GetLastListTopNum", output = "http://tempuri.org/IVasWebService/AlarmInfo_GetLastListTopNumResponse")
    @RequestWrapper(localName = "AlarmInfo_GetLastListTopNum", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AlarmInfoGetLastListTopNum")
    @ResponseWrapper(localName = "AlarmInfo_GetLastListTopNumResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AlarmInfoGetLastListTopNumResponse")
    @WebResult(name = "AlarmInfo_GetLastListTopNumResult", targetNamespace = "http://tempuri.org/")
    public java.lang.String alarmInfoGetLastListTopNum(

        @WebParam(name = "year", targetNamespace = "http://tempuri.org/")
        java.lang.Integer year,
        @WebParam(name = "month", targetNamespace = "http://tempuri.org/")
        java.lang.Integer month,
        @WebParam(name = "day", targetNamespace = "http://tempuri.org/")
        java.lang.Integer day,
        @WebParam(name = "topNum", targetNamespace = "http://tempuri.org/")
        java.lang.Integer topNum
    );

    @WebMethod(operationName = "AlarmInfo_GetModel", action = "http://tempuri.org/IVasWebService/AlarmInfo_GetModel")
    @Action(input = "http://tempuri.org/IVasWebService/AlarmInfo_GetModel", output = "http://tempuri.org/IVasWebService/AlarmInfo_GetModelResponse")
    @RequestWrapper(localName = "AlarmInfo_GetModel", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AlarmInfoGetModel")
    @ResponseWrapper(localName = "AlarmInfo_GetModelResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AlarmInfoGetModelResponse")
    @WebResult(name = "AlarmInfo_GetModelResult", targetNamespace = "http://tempuri.org/")
    public java.lang.String alarmInfoGetModel(

        @WebParam(name = "year", targetNamespace = "http://tempuri.org/")
        java.lang.Integer year,
        @WebParam(name = "month", targetNamespace = "http://tempuri.org/")
        java.lang.Integer month,
        @WebParam(name = "day", targetNamespace = "http://tempuri.org/")
        java.lang.Integer day,
        @WebParam(name = "alarmId", targetNamespace = "http://tempuri.org/")
        java.lang.Long alarmId
    );

    @WebMethod(operationName = "UpdateChannelHostInfo", action = "http://tempuri.org/IVasWebService/UpdateChannelHostInfo")
    @Action(input = "http://tempuri.org/IVasWebService/UpdateChannelHostInfo", output = "http://tempuri.org/IVasWebService/UpdateChannelHostInfoResponse")
    @RequestWrapper(localName = "UpdateChannelHostInfo", targetNamespace = "http://tempuri.org/", className = "org.tempuri.UpdateChannelHostInfo")
    @ResponseWrapper(localName = "UpdateChannelHostInfoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.UpdateChannelHostInfoResponse")
    @WebResult(name = "UpdateChannelHostInfoResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean updateChannelHostInfo(

        @WebParam(name = "json", targetNamespace = "http://tempuri.org/")
        java.lang.String json
    );

    @WebMethod(operationName = "SetChannelHost_Rtsp", action = "http://tempuri.org/IVasWebService/SetChannelHost_Rtsp")
    @Action(input = "http://tempuri.org/IVasWebService/SetChannelHost_Rtsp", output = "http://tempuri.org/IVasWebService/SetChannelHost_RtspResponse")
    @RequestWrapper(localName = "SetChannelHost_Rtsp", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SetChannelHostRtsp")
    @ResponseWrapper(localName = "SetChannelHost_RtspResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SetChannelHostRtspResponse")
    @WebResult(name = "SetChannelHost_RtspResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Boolean setChannelHostRtsp(

        @WebParam(name = "hostId", targetNamespace = "http://tempuri.org/")
        java.lang.Integer hostId,
        @WebParam(name = "rtsp", targetNamespace = "http://tempuri.org/")
        java.lang.String rtsp
    );

    @WebMethod(operationName = "GetRuleInfoByHostId", action = "http://tempuri.org/IVasWebService/GetRuleInfoByHostId")
    @Action(input = "http://tempuri.org/IVasWebService/GetRuleInfoByHostId", output = "http://tempuri.org/IVasWebService/GetRuleInfoByHostIdResponse")
    @RequestWrapper(localName = "GetRuleInfoByHostId", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetRuleInfoByHostId")
    @ResponseWrapper(localName = "GetRuleInfoByHostIdResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetRuleInfoByHostIdResponse")
    @WebResult(name = "GetRuleInfoByHostIdResult", targetNamespace = "http://tempuri.org/")
    public java.lang.String getRuleInfoByHostId(

        @WebParam(name = "hostId", targetNamespace = "http://tempuri.org/")
        java.lang.Integer hostId
    );
}