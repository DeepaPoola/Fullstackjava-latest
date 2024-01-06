package com.API.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.API.API.model.Data;

@Repository
public interface DataRepository extends JpaRepository<Data, Long> {

}
