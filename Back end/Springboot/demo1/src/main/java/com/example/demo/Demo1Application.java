package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.bean.HelloBean;
import com.example.demo.bean.Test;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner{

	@Autowired
	HelloBean h;
	
	@Autowired
	Test t;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Demo application");
		h.sayHello();
		t.m1();
		
	}

}
