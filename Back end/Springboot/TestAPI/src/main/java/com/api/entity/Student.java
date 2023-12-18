package com.api.entity;

import lombok.Data;
import javax.persistence.Entity;

@Data
@Entity
public class Student {
   private int id;
   private String first_Name;
   private String lastName;
}
