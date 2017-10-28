package test.Basics; 

public class Product {
	private static int maxId;
	private int id;
	private String name;
	float price;
	public Product(String name, float price) {
		id = ++maxId;
		this.name = name;
		this.price = price;
	}
	public void setName(String name) {
		name.toUpperCase();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPrice() {
		return price;
	}
	public int getId() {
		return id+1;
	}
	public String toString() {
		return id+" "+name+" "+price;
	}
}
