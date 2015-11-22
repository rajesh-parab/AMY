package com.amy.banking.services;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.amy.banking.dao.AccountBalanceDao;
import com.amy.banking.exception.NotEnoughBalanceException;
import com.amy.banking.models.AcctBal;

public class MoneyWithdrawlServiceTest extends AbstractAMYBankingTest {

	@Autowired
	AccountBalanceDao accountBalanceDao;

	@Autowired
	MoneyWithdrawlService moneyWithdrawlService;

	@Test
	public void moneyWithdrawlWithEnoughBalance() {
		AcctBal bal = accountBalanceDao.findByAcctId("A001");
		int expectedBal = bal.getBalance().intValue() - 1000;
		boolean result = moneyWithdrawlService.withdrawMoney("A001",
				new BigDecimal(1000));

		assertTrue(result);
		assertTrue(expectedBal == bal.getBalance().intValue());
	}

	@Test
	public void moneyWithdrawlAllBalance() {
		AcctBal bal = accountBalanceDao.findByAcctId("A001");
		int expectedBal = bal.getBalance().intValue() - 1000;
		boolean result = moneyWithdrawlService.withdrawMoney("A001",
				new BigDecimal(1000));

		assertTrue(result);
		assertTrue(expectedBal == bal.getBalance().intValue());

		result = moneyWithdrawlService.withdrawMoney("A001", new BigDecimal(
				expectedBal));
		assertTrue(result);
		assertTrue(0 == bal.getBalance().intValue());

	}

	@Test(expected=NotEnoughBalanceException.class)
	public void moneyWithdrawlWithExceedBalance() {
		AcctBal bal = accountBalanceDao.findByAcctId("A001");
		//withdraw 1000 more than actual balcne
		 moneyWithdrawlService.withdrawMoney("A001",
				new BigDecimal(bal.getBalance().intValue()+1000));

	}
 
	
}
