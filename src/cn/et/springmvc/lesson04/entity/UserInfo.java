package cn.et.springmvc.lesson04.entity;

import java.sql.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;



public class UserInfo {
	/**
	 * NotNull 属性名 !=null
	 * NotEmpty 属性名 !=null && ！=属性名.equals("")
	 */
	@NotEmpty(message="{userError}")
	private String userName;//用户名
	@NotEmpty(message="{passwordError}")
	private String password;//密码
	@NotEmpty(message="{repasswordError}")
	private String repassword;
	// xx@123.com .+@.+\..+
	@Pattern(message="{emailError}",regexp=".+@.+\\..+")
	private String email;//邮件
	@NotEmpty(message="{ageError}")
	@Min(value=1,message="{ageError1}")
	@Max(value=2,message="{ageError2}")
	private String age;//年龄
	@Size(min=11,max=11,message="{phoneError}")
	private String phone;//手机号码
	@Past(message="{dateError}")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	//时间输入格式 yyyy-MM-dd
	private Date date;//时间
	//网址 http://www.baibu.com
	@NotEmpty(message="{webAddressError}")
	//@Pattern(message="{WebAddressError1}",regexp="(http://|ftp://|https://|www){0,1}[^\u4e00-\u9fa5\\s]*?\\.(com|net|cn|me|tw|fr)[^\u4e00-\u9fa5\\s]*")
	private String webAddress;//个人网址
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getWebAddress() {
		return webAddress;
	}
	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}
	
	
	
}