package com.John.spring.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.John.spring.model.Employee;

public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

	@Override
	public Employee findEmployeeById(long empId) {
		List<Map<String, Object>> list = getJdbcTemplate().queryForList(
				SqlStatement.GETEMPLOYEEBYID, empId);
		if (list.size() > 0) {
			Employee emp = new Employee();
			Map<String, Object> data = list.get(0);
			//confused
			//emp.setEmployeeId((Long) data.get("employeeid"));
			emp.setEmployeeId(Long.parseLong(data.get("employeeid").toString()));
			emp.setAddress((String) data.get("address"));
			emp.setAge((Integer) data.get("age"));
			emp.setEnable((Boolean) data.get("isenable"));
			emp.setName((String) data.get("name"));
			emp.setTel((String) data.get("tel"));
			return emp;
		} else {
			return null;
		}
	}

	@Override
	public void addEmployee(Employee emp) {
		getJdbcTemplate().update(SqlStatement.ADDEMPLOYEE, emp.getName(),
				emp.getAge(), emp.isEnable(), emp.getAddress(), emp.getTel());

	}

	@Override
	public void deleteEmployee(long empId) {
		getJdbcTemplate().update(SqlStatement.DELETEMPLOYEE, empId);

	}

	@Override
	public void updateEmployee(Employee emp) {
		getJdbcTemplate().update(SqlStatement.UPDATEEMPLOYEE, emp.getName(),
				emp.getAge(), emp.isEnable(), emp.getAddress(), emp.getTel(),
				emp.getEmployeeId());

	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Map<String, Object>> list = getJdbcTemplate().queryForList(
				SqlStatement.GETALLEMPLOYEES);
		List<Employee> result = new ArrayList<Employee>();
		if (list.size() > 0) {
			for (Map<String, Object> data : list) {
				Employee emp = new Employee();
				emp.setEmployeeId((long) data.get("employeeid"));
				emp.setAddress(((String) data.get("address")));
				emp.setAge((Integer) data.get("age"));
				emp.setEnable((Boolean) data.get("isenable"));
				emp.setName((String) data.get("name"));
				emp.setTel((String) data.get("tel"));
				result.add(emp);
			}
			return result;
		} else {
			return null;
		}
	}

}
