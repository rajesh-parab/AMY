package com.amy.banking.exception;

import org.springframework.core.NestedRuntimeException;

@SuppressWarnings("serial")
public class AccountNotExistException extends NestedRuntimeException {

	public AccountNotExistException(String msg) {
		super(msg);

	}

	public AccountNotExistException(String msg, Throwable cause) {
		super(msg, cause);

	}

}
