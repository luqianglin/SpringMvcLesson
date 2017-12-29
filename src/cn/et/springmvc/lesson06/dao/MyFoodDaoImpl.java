package cn.et.springmvc.lesson06.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class MyFoodDaoImpl {
	
	@Autowired
	JdbcTemplate jdbc;
	/**
	 * 查询所有数据
	 * @param foodname
	 * @return
	 */
	public List<Map<String, Object>> queryAllFood(String foodname){
		
		return jdbc.queryForList("select * from food where foodname like '%"+foodname+"%'");
	}
	/**
	 * 删除
	 * @param foodId
	 */
	public void deleteFood(String foodId){
		 jdbc.execute("delete from food where foodId = "+foodId);
	}
	/**
	 * 添加
	 * @param foodName
	 * @param price
	 */
	public void saveFood(String foodName,String price){
		 jdbc.execute("insert into food(foodname,price) values('"+foodName+"',"+price+")");
	}
	/**
	 * 修改
	 * @param foodId
	 * @param foodName
	 * @param price
	 */
	public void updateFood(String foodId,String foodName,String price){
	
		 jdbc.execute("update food set foodname='"+foodName+"',price='"+price+"' where foodid="+foodId);
	}
}
