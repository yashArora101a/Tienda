package com.tienda.util;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.tienda.resource.ProductResource;
import com.tienda.resource.UserResource;
@ApplicationPath("/")
public class TiendaApplication extends Application {
	@Override
	public Set<Class<?>> getClasses(){
		Set<Class<?>> classes = new HashSet<Class<?>>();
		
		classes.add(ProductResource.class);
		classes.add(TiendaExceptionMapper.class);
		
		return classes;
		
	}

}
