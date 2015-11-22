package com.amy.banking.exception;

import org.springframework.core.NestedRuntimeException;

@SuppressWarnings("serial")
public class NotEnoughBalanceException extends NestedRuntimeException {

	public NotEnoughBalanceException(String msg) {
		super(msg);

	}

}
