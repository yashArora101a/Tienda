package com.tienda.resource;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ResourceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import com.tienda.Exception.UserNotFoundException;
import com.tienda.bean.ExceptionMessage;
import com.tienda.bean.Link;
import com.tienda.bean.User;
import com.tienda.service.TiendaService;
import com.tienda.util.DataStore;
@Path("/users")
public class UserResource {
	
	/*
	@Context                                             
	private ResourceContext resourceContext;			// dependency injection
	
	@Context
	private UriInfo uriInfo;
	
	@GET
	@Produces(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("{uname}")
	public Response fetchUserDetails(@PathParam("uname") String username,
							@HeaderParam("Accept") String acceptHeader) throws UserNotFoundException{
		
		User user;
		user=new TiendaService().getUserDetails(username);
		
		user.setLinks(new HashSet<Link>());
		
		UriBuilder baseBuilder = uriInfo.getBaseUriBuilder();
		baseBuilder.path(UserResource.class);
		baseBuilder.path(UserResource.class,"getSubResource")
					.resolveTemplate("uname", username);
		
		user.getLinks().add(new Link(UriBuilder.fromPath(baseBuilder.toTemplate())
												.resolveTemplate("sub-resource-name", "orders")
												.build()
												.toString(), 
												String.format("%s, %s", MediaType.APPLICATION_JSON,
															   		  MediaType.APPLICATION_XML)));
		
		user.getLinks().add(new Link(UriBuilder.fromPath(baseBuilder.toTemplate())
				.resolveTemplate("sub-resource-name", "wishlist")
				.build()
				.toString(), 
				String.format("%s, %s", MediaType.APPLICATION_JSON,
							   		  MediaType.APPLICATION_XML)));

		return Response.ok(user).build();
	}
	
	@POST
	@Consumes(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(value={MediaType.APPLICATION_JSON})
	public List<User> createUser(User user){
		
		new TiendaService().addUser(user);
		
		return new DataStore().getAllUser();
		
	}
	
	@POST
	@Consumes(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response createUser(User user) throws URISyntaxException{
		
		new TiendaService().addUser(user);
		URI u = new URI(uriInfo.getBaseUriBuilder()
							 .path(UserResource.class)
							 .path(user.getUsername())
							 .toString());
		return Response.ok(u).build();
		
	}
	

    @Path("{uname}/{sub-resource-name}")
    //@Produces(value={MediaType.APPLICATION_JSON})
    public Object getSubResource(@PathParam("sub-resource-name") String subResourceName) {
    	if("orders".equals(subResourceName)){
    		return resourceContext.getResource(OrderResource.class);
    		
    	} else if("wishlist".equals(subResourceName)) {
    		//return resourceContext.getResource(WishlistResource.class);
    		
    	}
    	throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity(new ExceptionMessage("No such resources")).build());
	}
	 */
}
