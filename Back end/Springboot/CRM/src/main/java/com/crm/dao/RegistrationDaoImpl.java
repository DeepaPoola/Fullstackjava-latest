package com.crm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.crm.model.CustomerBean;

@Repository
public class RegistrationDaoImpl implements IRegistrationDao {

	@Autowired
	JdbcTemplate jt;
	
	@Override
	public boolean saveCustomer(CustomerBean customerBean) {
		// TODO Auto-generated method stub
		 String sqlCommand="insert into user4 values(?,?,?,?)";
		jt.update(sqlCommand, customerBean.getFirstName(),customerBean.getEmail(),customerBean.getMobile(),customerBean.getPassword());
		 
		 
		 return true;
	}

}
