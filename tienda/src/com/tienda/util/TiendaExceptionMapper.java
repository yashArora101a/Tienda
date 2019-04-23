package com.tienda.util;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.tienda.Exception.TiendaException;

@Provider
public class TiendaExceptionMapper implements ExceptionMapper<TiendaException> {

	@Override
	public Response toResponse(TiendaException ex) {

		return Response.status(Status.BAD_REQUEST).entity(ex.getExceptionMessage()).build();
	}

}
