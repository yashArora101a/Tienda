package com.tienda.bean;

import java.io.File;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@XmlRootElement(name="product")
@Component
@Entity
@Table(name="Product")
public class Product {

	@Autowired
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="productId",nullable=false)
	private int productId;
	
	
	@Column(name="category",nullable=false)
	private String category;

	@Column(name="name",nullable=false)
	private String name;

	@Column(name="brand",nullable=false)
	private String brand;

	@Column(name="description",nullable=false)
	private String description;
	
	@Column(name="price",nullable=false)
	private int price;
	
	@Column(name="quantity",nullable=false)
	private int quantity;
	
	@Column(name="image",nullable=true)
	private File image =new File("C:\\Users\\YAro\\Desktop\\Logo.png");
	

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	/*public Product(int productId, String category, String name,
			String brand, String description, int price,
			int quantity, File image) {
		super();
		this.productId = productId;
		this.category = category;
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.image = image;
	}*/
	public Product( String category, String name,
			String brand, String description, int price,
			int quantity) {
	//	this(productId,category,name,brand,description,price,quantity,image);
		super();
		
		this.category = category;
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		//this.image = image;
	}

	public void setProductId(int productId) {
		this.productId=productId;
	}

	public int getProductId() {
		return productId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", category=" + category + ", name=" + name + ", brand=" + brand
				+ ", description=" + description + ", price=" + price + ", quantity=" + quantity 
				+ "]";
	}/*@Override
	public String toString() {
		return "Product [productId=" + productId + ", category=" + category + ", name=" + name + ", brand=" + brand
				+ ", description=" + description + ", price=" + price + ", quantity=" + quantity + ", image=" + image
				+ "]";
	}*/

	
}
