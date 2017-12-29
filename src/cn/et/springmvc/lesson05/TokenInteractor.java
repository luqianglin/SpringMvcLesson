package cn.et.springmvc.lesson05;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TokenInteractor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		//获取参数 myToken
		String myToken = request.getParameter("myToken");
		//从session中获取myToken
		Object myToken1 = request.getSession().getAttribute("myToken");
		//需要验证重复提交
		if(myToken!=null){
			//重复提交
			if(myToken1==null){
				return false;
			}else{
				if(myToken.equals(myToken1)){//第一次
					//成功之后从Seeion中清除 myToken
					request.getSession().removeAttribute("myToken");
					return true;
				}else{
					return false;
				}
			}
		}else{
			return false;
		}
	}

	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
