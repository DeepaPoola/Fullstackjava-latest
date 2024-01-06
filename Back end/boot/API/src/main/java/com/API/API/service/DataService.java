package com.API.API.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.API.API.repository.DataRepository;

@Service
public class DataService {

	
	@Autowired
	DataRepository repo;
	
	public List getAllData() {
		List data=new ArrayList();
		repo.findAll().forEach(data::add);
		return data;
	}
}
