package com.amy.banking.services;

import javax.sql.DataSource;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional

@ContextConfiguration(locations = "classpath:amy-banking-app-test-config.xml")
@TransactionConfiguration(transactionManager = "transactionManager",defaultRollback=false)
public abstract class AbstractAMYBankingTest {

	@Autowired
	private DataSource amyBankingDS;

	private JdbcTemplate jdbcTemplate = null;

	public JdbcTemplate getAmyCoreJdbcTemplate() {
		if (jdbcTemplate == null) {
			jdbcTemplate = new JdbcTemplate(amyBankingDS);
		}
		return jdbcTemplate;
	}
/*
	public String getTrnsactionFromDB() {

		String name = getAmyCoreJdbcTemplate().queryForObject(
				"select name from tran where enable=1 limit 1",
				String.class);
		return name;
	}*/
}
