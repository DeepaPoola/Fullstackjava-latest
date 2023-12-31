package com.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.entity.StudentData;

@Repository
public interface StudentRepository extends JpaRepository<StudentData, Long> {

}
