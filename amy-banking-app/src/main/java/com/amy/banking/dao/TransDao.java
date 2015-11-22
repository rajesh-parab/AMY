package com.amy.banking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amy.banking.models.Tran;

@Repository
public interface TransDao extends JpaRepository<Tran, Long> {
	
}
