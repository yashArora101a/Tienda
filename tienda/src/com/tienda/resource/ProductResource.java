package com.tienda.resource;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.tienda.bean.Product;
import com.tienda.service.TiendaService;


@Path("/products")
public class ProductResource {
	/*@GET
	@Produces(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Set<Product> fetchAllOrdersForUser(@PathParam("uname") String username) {
		Set<Product> products=null;
		products=new TiendaService().getAllProducts();
		return products;
		
	}*/
	@POST
	@Consumes(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response addProduct(Product product) {
		System.out.print("11111111111111111yash");
		System.out.print(product);
		new TiendaService().addProduct(product);
		return Response.ok().build();
	}
	@GET
	@Produces(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Product> getAllProducts() {
		System.out.print("11111111111111111yash");
		
		return new TiendaService().getAllProducts();
		
	}
}
