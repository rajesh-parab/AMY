package com.amy.banking.services;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.amy.banking.dao.AccountBalanceDao;
import com.amy.banking.models.AcctBal;

public class AccountBalanceTest extends AbstractAMYBankingTest {
	
	@Autowired
	AccountBalanceDao accountBalanceDao;

	@Test
	public void test() {
		
		List<AcctBal>  acctBalances=accountBalanceDao.findAll();
		assertNotNull(acctBalances);
	}

}
