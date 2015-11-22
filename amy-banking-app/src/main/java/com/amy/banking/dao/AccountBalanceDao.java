package com.amy.banking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amy.banking.models.AcctBal;

@Repository
public interface AccountBalanceDao extends JpaRepository<AcctBal, Long> {
	
	AcctBal findByAcctId(String acctId);

}
