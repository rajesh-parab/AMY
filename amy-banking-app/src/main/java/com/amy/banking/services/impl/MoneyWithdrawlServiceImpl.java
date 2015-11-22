package com.amy.banking.services.impl;

import java.math.BigDecimal;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amy.banking.dao.AccountBalanceDao;
import com.amy.banking.dao.TransDao;
import com.amy.banking.exception.AccountNotExistException;
import com.amy.banking.exception.NotEnoughBalanceException;
import com.amy.banking.models.AcctBal;
import com.amy.banking.models.Tran;
import com.amy.banking.services.MoneyWithdrawlService;
@Service
@Transactional
public class MoneyWithdrawlServiceImpl implements MoneyWithdrawlService {

	@Autowired
	AccountBalanceDao accountBalanceDao;
	 
	@Autowired
	TransDao transDao;
	
	@Override
	public boolean withdrawMoney(String accountNumber, BigDecimal amount) {
		 
		AcctBal acountBal=	accountBalanceDao.findByAcctId(accountNumber);
		if(acountBal==null){
			throw new AccountNotExistException(" Account number "+accountNumber+ " does not exit");
		}
		if(acountBal.getBalance().compareTo(amount)>=0){
			acountBal.setBalance(acountBal.getBalance().subtract(amount));
			accountBalanceDao.saveAndFlush(acountBal);
			Tran tran = new Tran();
		//	tran.setId(1L);
			tran.setChId("bank");
			tran.setAmount(amount);
			tran.setTranDate(Calendar.getInstance().getTime());
			tran.setAcctBal(acountBal);
			transDao.saveAndFlush(tran);
		}else{
			throw new NotEnoughBalanceException("Not enough balnce in account. Balance is "+amount);
		}
		
		return true;
	}

}
