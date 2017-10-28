package test.Basics;

public class Shop {
	public static void main(String[] args) {
		Food food = new Food("Cookie", 1.99f);
		System.out.println(food.price);
		System.out.println(food.getTax());
		System.out.println(food.getId());
		System.out.println(food);
	}
}
