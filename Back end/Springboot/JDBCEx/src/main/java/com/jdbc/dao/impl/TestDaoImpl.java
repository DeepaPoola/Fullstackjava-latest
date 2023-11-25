package com.jdbc.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbc.dao.ITestDao;

@Repository
public class TestDaoImpl implements ITestDao {
     
	@Autowired
	JdbcTemplate jt;
	
	@Override
	public void insertRecords() {
		// TODO Auto-generated method stub
     jt.update("insert into emp values(10,'sunny',10000)");
     jt.update("insert into emp values(11,'saif',150000)");
	}

	@Override
	public List selectRecords() {
		// TODO Auto-generated method stub
		return jt.queryForList("select * from emp");
	}

	@Override
	public List noOfEmployee() {
		// TODO Auto-generated method stub
		return jt.queryForList("select name from emp");
	}

}
