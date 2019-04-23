package com.tienda.bean;

import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="wishlist")
public class Wishlist {
	private int wishlistId;
	private User wishedBy;
	private Set<Product> wishes;
	public int getWishListId() {
		return wishlistId;
	}
	public void setWishListId(int wishListId) {
		this.wishlistId = wishListId;
	}
	public User getWishedBy() {
		return wishedBy;
	}
	public void setWishedBy(User wishedBy) {
		this.wishedBy = wishedBy;
	}
	public Set<Product> getWishes() {
		return wishes;
	}
	public void setWishes(Set<Product> wishes) {
		this.wishes = wishes;
	}
	public Wishlist(int wishlistId, User wishedBy, Set<Product> wishes) {
		super();
		this.wishlistId = wishlistId;
		this.wishedBy = wishedBy;
		this.wishes = wishes;
	}
	public Wishlist() {
		super();
	}

}
