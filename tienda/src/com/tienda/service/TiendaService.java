package com.tienda.service;

<<<<<<< HEAD
import org.apache.jasper.tagplugins.jstl.core.Set;
=======
import java.util.List;
>>>>>>> branch 'master' of https://github.com/yashArora101a/Tienda.git

<<<<<<< HEAD
import com.kenai.jaffl.struct.Struct.String;
import com.tienda.Exception.OrderNotFoundException;
import com.tienda.Exception.ProductNotFoundException;
import com.tienda.Exception.UserNotFoundException;
import com.tienda.Exception.WishlistNotFoundException;
import com.tienda.bean.Order;
=======
>>>>>>> branch 'master' of https://github.com/yashArora101a/Tienda.git
import com.tienda.bean.Product;
import com.tienda.util.DataStore;

public class TiendaService {
/*	
	public User getUserDetails(String username) throws UserNotFoundException{
		
		return new DataStore().getUser(username);
	}
	
	public Product getProductDetails(String code) throws ProductNotFoundException{
		
		return new DataStore().getProduct(code);
		
	}

	public Order getOrderDetailsForUser(String username, String number ) throws OrderNotFoundException{
		
		return new DataStore().getOrderForUser(username, number);
	}
	
	public Set<Order> getAllOrdersForUser(String username){
		return new DataStore().getAllOrdersForUser(username);
	}
	
	public Wishlist getWishlistForUser(String username) throws WishlistNotFoundException{
		
		return new DataStore().getWishlistForUser(username);
		
		
	}
	
	public void addUser(User user) {
		new DataStore().addUser(user);
		
	}
	
	public void addOrder(Order order) {
		new DataStore().addOrder(order);
		
	}
	public Set<Product> getAllProducts(){
		return new DataStore().getAllProducts();
	}
 */
	public void addProduct(Product product) {

		System.out.print("222222222222222yash");
		new DataStore().addProduct(product);
	}
	
	public List<Product> getAllProducts() {

		System.out.print("222222222222222yash");
		return new DataStore().getAllProducts();
	}
}
