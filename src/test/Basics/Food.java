package test.Basics;

public class Food extends Product{
	
	public float price;
	
	public Food(String name, float price) {
		super(name, price);	
	}
	
	public float getTax() {
		return price*0.1f;
	}
}
