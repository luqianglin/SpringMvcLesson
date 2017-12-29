package cn.et.springmvc.lesson05.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MoneyDaoImpl{
	@Autowired
	JdbcTemplate template;
	public void transnateMoney(int money){
		String sql ="update mymoney set lostedmoney=lostedmoney-"+money+" where id=1";
		template.execute(sql);
	}
	/**
	 * 返回余额
	 * @return
	 */
	public int selectMoney(){
		String sql ="select lostedmoney from mymoney where id=1";
		Integer lostedMoney= template.queryForObject(sql, Integer.class);
		return lostedMoney;
	}
	
}
