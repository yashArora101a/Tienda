package com.tienda.resource;

import java.util.List;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tienda.Exception.OrderNotFoundException;
import com.tienda.bean.Order;
import com.tienda.service.TiendaService;
import com.tienda.util.DataStore;
@Path("/orders")
public class OrderResource {

	
	@GET
	@Produces(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("{ord-num}")
	public Order fetchOrderDetailsForUser(@PathParam("uname") String username,
										  @PathParam("ord-num") String number) 
										  throws OrderNotFoundException {
		Order order;
		order=new TiendaService().getOrderDetailsForUser(username, number);
		return order;
		
	}

	@GET
	@Produces(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Set<Order> fetchAllOrdersForUser(@PathParam("uname") String username) {
		Set<Order> orders;
		orders=new TiendaService().getAllOrdersForUser(username);
		return orders;
		
	}
	
	@POST
	@Consumes(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(value={MediaType.APPLICATION_JSON})
	public List<Order> createOrder(Order order) {
		
		new TiendaService().addOrder(order);
		
		return new DataStore().getAllOrders();
		
	}
}
