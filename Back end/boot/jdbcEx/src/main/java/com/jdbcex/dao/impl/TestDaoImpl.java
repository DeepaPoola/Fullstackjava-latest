package com.jdbcex.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbcex.dao.ITestDao;

@Repository
public class TestDaoImpl implements ITestDao {

	@Autowired
	JdbcTemplate jt;
	
	@Override
	public void insertRecords() {
		// TODO Auto-generated method stub
          jt.update("insert into data values(12,'Me',20000)");
          jt.update("insert into data values(13,'you',30000)");
	}

	@Override
	public List selectRecords() {
		// TODO Auto-generated method stub
		return jt.queryForList("select * from data");
	}

}
