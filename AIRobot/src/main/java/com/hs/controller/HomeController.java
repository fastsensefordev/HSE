package com.hs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hs.response.ResultResponse;
import com.hs.response.ResultUtil;

@Controller
public class HomeController {
	/**
	* @Title: index
	* @Description: 首页
	* @param @return    参数
	* @return ModelAndView    返回类型
	* @throws
	 */
    @RequestMapping({"/index","/"})
    public ModelAndView index() {
        return new ModelAndView("index");
    }
    /**
    * @Title: templateManage
    * @Description: 模板管理
    * @param @return    参数
    * @return ModelAndView    返回类型
    * @throws
     */
    @RequestMapping({"/templateManage"})
    public ModelAndView templateManage() {
    	ModelAndView modelAndView = new ModelAndView();
    	modelAndView.setViewName("templateManage");
    	modelAndView.addObject("currMenu", "templateManage");
        return modelAndView;
    }
    
    /**
    * @Title: authManage
    * @Description: 权限管理
    * @param @return    参数
    * @return ModelAndView    返回类型
    * @throws
     */
    @RequestMapping({"/authManage"})
    public ModelAndView authManage() {
    	ModelAndView modelAndView = new ModelAndView();
    	modelAndView.setViewName("authManage");
    	modelAndView.addObject("currMenu", "authManage");
        return modelAndView;
    }
    /**
    * @Title: addressManage
    * @Description: 地址管理
    * @param @return    参数
    * @return ModelAndView    返回类型
    * @throws
     */
    @RequestMapping({"/addressManage"})
    public ModelAndView addressManage() {
    	ModelAndView modelAndView = new ModelAndView();
    	modelAndView.setViewName("addressManage");
    	modelAndView.addObject("currMenu", "addressManage");
        return modelAndView;
    }
    /**
    * @Title: warnManage
    * @Description: 报警管理
    * @param @return    参数
    * @return ModelAndView    返回类型
    * @throws
     */
    @RequestMapping({"/warnManage"})
    public ModelAndView warnManage() {
    	ModelAndView modelAndView = new ModelAndView();
    	modelAndView.setViewName("warnManage");
    	modelAndView.addObject("currMenu", "warnManage");
        return modelAndView;
    }
    
    @RequestMapping({"/dashboard"})
    public ModelAndView dashboard() {
        return new ModelAndView("dashboard");
    }
    
    /**
     * @author: 
     * @createTime: 2019年7月15日 下午10:12:46
     * @return ModelAndView
     */
    @RequestMapping({"/login"})
    public ModelAndView login() {
        return new ModelAndView("login");
    }
    
    @RequestMapping({"/getTableData"})
    @ResponseBody
    public ResultResponse getTableData() {
        return ResultUtil.success();
    }
    
}
