package com.zywu.mvn.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zywu.mvn.dao.EmployeeDao;
import com.zywu.mvn.pojo.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/FirstMvcWebApp-servlet.xml"})
public class EmployeeServiceTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	EmployeeDao employeeDao;

	@Test
	public void findEmployeeByIdTest() {
		assertNotNull(employeeDao);
		Employee employee = employeeDao.findEmployeeById(1);
		assertNotNull(employee);
		

	}
}
