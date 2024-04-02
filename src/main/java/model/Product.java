package model;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String img;
	private double price;
	private String category; // phân loại
	private int quantity;

	public Product(int id, String img, String name, double price) {
		super();
		this.id = id;
		this.img = img;
		this.name = name;
		this.price = price;
	}
	
	public Product(int id) {
		super();
		this.id = id;
	}
	
	public Product(String name, String img, double price, String category) {
		super();
		this.img = img;
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public Product(int id, String name, String img, double price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.img = img;
		this.price = price;
		this.category = category;
	}

	public Product(int id, String name, String img, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.img = img;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, String img, double price) {
		super();
		this.name = name;
		this.img = img;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", img=" + img + ", price=" + price + ", category=" + category
				+ ", quantity=" + quantity + "]";
	}
}
