package com.jajg.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jajg.entity.Employee;

public class EmployeeDao {
	private JdbcTemplate template;
	public void insert(Employee employee)
	{
		String query="insert into emp values(?,?,?)";
		int result=template.update(query,employee.getId(),employee.getName(),employee.getCity());
		System.out.println(result +" queries inserted");
	}
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public EmployeeDao() {
		
	}
	public EmployeeDao(JdbcTemplate template) {
		
		this.template = template;
	}
	
}
