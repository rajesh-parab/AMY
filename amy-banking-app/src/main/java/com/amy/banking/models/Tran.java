package com.amy.banking.models;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the trans database table.
 * 
 */
@Entity
@Table(name = "trans")
public class Tran {

	//@SequenceGenerator(name = "s1", sequenceName = "s1")
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s1")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "acct_id")
	private AcctBal acctBal;

	private BigDecimal amount;

	@Column(name = "ch_id")
	private String chId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "tran_date")
	private Date tranDate;

	@Column(name = "tran_type")
	private String tranType;

	public Tran() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AcctBal getAcctBal() {
		return acctBal;
	}

	public void setAcctBal(AcctBal acctBal) {
		this.acctBal = acctBal;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getChId() {
		return this.chId;
	}

	public void setChId(String chId) {
		this.chId = chId;
	}

	public Date getTranDate() {
		return this.tranDate;
	}

	public void setTranDate(Date tranDate) {
		this.tranDate = tranDate;
	}

	public String getTranType() {
		return this.tranType;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

}