package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.bean.HelloBean;
import com.example.demo.bean.Test;

//@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	HelloBean hb;
	
	@Autowired
	Test t;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		 System.out.println("Runner method");
		hb.sayHello();
		t.m1();
		t.m2();
		
	}

}
