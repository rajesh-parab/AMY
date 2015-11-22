package com.amy.banking.services;

import java.math.BigDecimal;

public interface MoneyWithdrawlService {
  
	boolean withdrawMoney(String accountNumber,BigDecimal amount);
}
