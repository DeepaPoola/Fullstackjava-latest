package com.jdbc.dao;

import java.util.List;

public interface ITestDao {
   void insertRecords();
   List selectRecords();
   List noOfEmployee();
   public default void m1() {
	   System.out.println("Default method");
   }
}
