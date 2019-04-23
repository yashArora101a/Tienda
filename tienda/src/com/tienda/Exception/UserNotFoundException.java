package com.tienda.Exception;

import com.tienda.bean.ExceptionMessage;


public class UserNotFoundException extends TiendaException {

	private static final long serialVersionUID = -8726563052769816274L;

	public UserNotFoundException() {
		super();
	}

	public UserNotFoundException(ExceptionMessage exceptionMessage) {
		super(exceptionMessage);
	}
}
