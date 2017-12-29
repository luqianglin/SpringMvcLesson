package cn.et.springmvc.lesson06.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Test {
	/**
	 * {
	 * 	id:1,
	 * 	username:'A'	
	 * }
	 */
	public static void parseObject(){
		Map map = new HashMap();
		map.put("id", 1);
		map.put("username", "A");
		JSONObject jo=JSONObject.fromObject(map);
		System.out.println(jo.toString());
	}
	/**
		[
			{
			  id:1,
			  username:"A",
			  lostedmoney:50
			
			}，{
			  id:2,
			  username:"B",
			  lostedmoney:500
			}
		]
		json字符串的键一定要带 "key":1
		值 数字不需要 ”“  字符串必须带""
	
	 */
	public static void parseArray(){
		Map map = new HashMap();
		map.put("id", 1);
		map.put("username", "A");
		
		Map map1 = new HashMap();
		map1.put("id", 2);
		map1.put("username", "B");
		
		List list = new ArrayList();
		list.add(map);
		list.add(map1);
		JSONArray ja = JSONArray.fromObject(list);
		System.out.println(ja.toString());
	}
	
	/**
	 * 
	 * 
	 */
	public static void parseJsonArray(){
		Map map = new HashMap();
		map.put("id", 1);
		map.put("username", "A");
		
		Map adddress = new HashMap();
		adddress.put("city", "sz");
		adddress.put("stree", "gl");
		map.put("address", adddress);
		
		
		JSONObject jo = JSONObject.fromObject(map);
		System.out.println(jo.toString());
	}
	public static void main(String[] args) {
		parseObject();
		parseArray();
		parseJsonArray();
		
	}
}
