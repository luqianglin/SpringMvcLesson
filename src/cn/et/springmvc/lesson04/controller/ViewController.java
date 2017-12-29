package cn.et.springmvc.lesson04.controller;


import java.io.OutputStream;

import java.util.Locale;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.et.springmvc.lesson04.entity.UserInfo;

/**
 * 后台验证步骤 
 * 1.javabean添加验证注解 
 * 2.action中使用@Vaild表示javabean
 * 使用Errors或者BindingResult判断是否验证失败 3.出现jar包冲突 4.3.2
 * 
 * @author Administrator
 * 
 */
@Controller
public class ViewController {
	
	@RequestMapping(value ="/viewResover", method = RequestMethod.GET)
	public String reg(@ModelAttribute("user") @Valid UserInfo user, BindingResult error) {
		
		return "lesson04/result";
	}
	/**
	 * 通过messagesource 在action中获取消息
	 */
	@Autowired
	MessageSource ms;
	@RequestMapping(value ="/nation", method=RequestMethod.GET)
	public String reg(HttpServletResponse response,OutputStream os,Locale local) throws Exception{
		response.setContentType("text/html;charset=UTF-8");
		os.write(ms.getMessage("key", null, local).getBytes("UTF-8"));
		return null;
	}
	@RequestMapping(value ="/mid", method = RequestMethod.GET)
	public String mid() throws Exception{
		
		return "/lesson04/reg.jsp";
	}
	
	
	@RequestMapping(value="/myreg", method=RequestMethod.POST)
	public String mid(@ModelAttribute("user") @Valid UserInfo user,BindingResult result) throws Exception{
		
		if(result.hasErrors()){
			return "/lesson04/reg.jsp";
		}
		return null;
	}
}
