package cn.et.springmvc.lesson03.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import cn.et.springmvc.lesson01.hello.User;
@SessionAttributes("user")
@Controller
public class SessionController {
	@ModelAttribute("user")
	public User getUser(){
		User user = new User();
		return user;
	}
	/**
	 * http://192.168.14.24:8080/SpringMvcLesson/s1?id=1
	 * 请求转发 forward
	 * 请求重定向 redirect 使用SessionAttribute方式 用于在重定向中传至 将值存储在session中(用完清除)
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/s1",method=RequestMethod.GET)
	public String case1(Map map){
		return "forward:/s2";
	}
	@RequestMapping(value="/s2",method=RequestMethod.GET)
	public String case2(String id,HttpServletResponse res) throws IOException{
		res.getWriter().println(id);
		return null;
	}
	
	@RequestMapping(value="/a1",method=RequestMethod.GET)
	public String case3(@ModelAttribute("user") User user){
		return "redirect:/a2";
	}
	@RequestMapping(value="/a2",method=RequestMethod.GET)
	public String case4(Map map,HttpServletResponse res,SessionStatus sessionStatus) throws IOException{
		
		User user = (User)map.get("user");
		res.getWriter().println(user.getId());
		sessionStatus.setComplete();
		return null;
	}
}
