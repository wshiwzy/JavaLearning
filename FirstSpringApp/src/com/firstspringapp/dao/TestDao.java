package com.firstspringapp.dao;

import com.firstspringapp.bean.DataBean;

public interface TestDao  {
	
	DataBean getDataBeanById(int id);
	
	void addDataBean(DataBean bean);
	
	void UpdateBean(DataBean bean);
	
	void DeleteBean(DataBean bean);
}
