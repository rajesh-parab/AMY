package com.amy.banking.models;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the acct_bal database table.
 * 
 */
@Entity
@Table(name = "acct_bal")
public class AcctBal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "acct_id")
	private String acctId;

	private BigDecimal balance;
	
 	@OneToMany(mappedBy = "acctBal",fetch=FetchType.EAGER)
 	private List<Tran> trans;
 
	public AcctBal() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAcctId() {
		return this.acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

}