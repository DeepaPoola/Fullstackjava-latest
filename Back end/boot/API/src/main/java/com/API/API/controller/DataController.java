package com.API.API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.API.API.service.DataService;

@RestController
public class DataController {
  
	@Autowired
	DataService dataservice;
	
	//localhost:8686/Data/datas
	@GetMapping("/datas")
	public List getData() {
		return dataservice.getAllData();
	}
}
