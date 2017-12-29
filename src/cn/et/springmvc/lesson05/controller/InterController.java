package cn.et.springmvc.lesson05.controller;

import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.et.springmvc.lesson05.dao.MoneyDaoImpl;

@Controller
public class InterController {
	
	@RequestMapping(value="/inter",method=RequestMethod.GET)
	public String reg(OutputStream os) throws IOException{
		
		os.write("hello".getBytes());
		return null;
	}
	/**
	 * 扣钱
	 */
	@Autowired
	MoneyDaoImpl mdi;
	@RequestMapping(value="/tm",method=RequestMethod.GET)
	public String reg1(Integer money,OutputStream os,HttpServletResponse response ) throws IOException{
		response.setContentType("text/html;UTF-8");
		mdi.transnateMoney(money);
		os.write(("余额为 :"+mdi.selectMoney()).getBytes("UTF-8"));
		return null;
	}
}
