package cn.et.springmvc.lesson06.entity;

public class UserInfo {
	String name="BeJson";
	String url="http://www.bejson.com";
	Address[] address;
	
	/**
	 * 在json中
	 * 普通数据
	 * 		键:值
	 * 对象
	 * 		键:{
	 * 
	 * 		}
	 * 数组
	 * 		键:[
	 * 
	 * 		]
	 * 
	 * 
	 * 
	  {
    		"name": "BeJson",
    		"url": "http://www.bejson.com",
    		"page": 88,
    		"isNonProfit": true,
    		"address": [{
        		"street": "科技园路.",
        		"city": "江苏苏州",
        		"country": "中国"
    	 	},{
    	 		"street": "科技园路.",
        		"city": "江苏苏州",
        		"country": "中国"
        	}]
    
 	   	}
	
	 */
}
