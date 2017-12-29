package cn.et.springmvc.lesson03.controller;

import java.util.Map;

import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/**
 * springmvc中Model相关对象 是处理和数据相关的对象
 *  @ModelAttribute 重命名 参数数据
 *  Model(ModelMap,Map)传递数据到视图(request.setAttribute)
 *  ModelAndView绑定数据到视图(ModelMap用于传递数据View对象用于跳转)
 *  
 * @author Administrator
 *
 */
@Controller
public class ModelController {
	@RequestMapping(value ="/case", method = RequestMethod.GET)
	public String case1(Map map){
		map.put("sex", "boy");
		return "/lesson03/res.jsp";
	}
	@RequestMapping(value ="/case2", method = RequestMethod.GET)
	public ModelAndView case2(){
		ModelAndView mav=new ModelAndView("/lesson03/res.jsp");
		mav.addObject("sex","girl");
		return mav;
	}
}
