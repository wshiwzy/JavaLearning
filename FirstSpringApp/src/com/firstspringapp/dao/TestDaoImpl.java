package com.firstspringapp.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.stereotype.Repository;

import com.firstspringapp.bean.DataBean;


@Repository
public class TestDaoImpl  implements TestDao {
	
	private JdbcTemplate jdbc;
	
	@Autowired
	public TestDaoImpl(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	@Override
	public DataBean getDataBeanById(int id) {
//		return jdbc.queryForObject("select * from ttt where a=?", new ParameterizedRowMapper<DataBean>() {		
//
//			@Override
//			public DataBean mapRow(ResultSet arg0, int arg1)
//					throws SQLException {
//				DataBean dBean=new DataBean();
//				dBean.setA(arg0.getInt(1));
//				dBean.setB(arg0.getString(2));
//				return dBean;
//			}
//		}, id);
		
		List<Map<String,Object>> rows = jdbc.queryForList("select * from ttt where a=?", id);
		List<DataBean> beanList=new ArrayList<DataBean>();
		for(Map<String, Object> map:rows)
		{
			DataBean dBean=new DataBean();
			dBean.setA((Integer)map.get("a"));
			dBean.setB((String)map.get("b"));
			beanList.add(dBean);
		}
		if(beanList.size()>0)
			return beanList.get(0);
		else {
			return null;
		}
	}

	@Override
	public void addDataBean(DataBean bean) {
		jdbc.update("insert into ttt values(?,?)", bean.getA(),bean.getB());
	}

	@Override
	public void UpdateBean(DataBean bean) {
		jdbc.update("update ttt set b=? where a=?", bean.getB(),bean.getA());		
	}

	@Override
	public void DeleteBean(DataBean bean) {
		jdbc.update("delete from ttt where a=?", bean.getA());
	}
	
	

}
