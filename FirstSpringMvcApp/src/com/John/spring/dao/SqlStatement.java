package com.John.spring.dao;

public class SqlStatement {	
	static final String GETEMPLOYEEBYID = "select * from employee where employeeid=? ";
	
	static final String GETALLEMPLOYEES = "select * from employee ";
	
	static final String ADDEMPLOYEE = "INSERT INTO EMPLOYEE(name,age,isenable,address,tel) VALUES(?,?,?,?,?,?)";
	
	
	static final String UPDATEEMPLOYEE = "update employee set name=?,age=?,isenable=?,address=?,tel=? where employeeid=?";
	
	
	static final String DELETEMPLOYEE = "delete from employee where employeeid=?";
	
	
	
}
