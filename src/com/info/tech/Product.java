package com.info.tech;

public class Product {
	private Integer id = 14;
	private String name = "chandu";

	public static void main(String[] args) {
		Product product = new Product();
		System.out.println(product);
		Product product2 = new Product();
		System.out.println(product2);

		System.out.println(product == product2);// false
		System.out.println("I AM CHECKING WITH EQUALS()");
		System.out.println(product.equals(product2));// false
		System.out.println("I AM CHECKING WITH EQUALS()");

	}

	/**
	 * Here i am overriding the equals()..Bcz if we are not overiding the equals()
	 * if we are not override then it will always check only the object not content
	 * so if you want to check the content then we go an d overide the equals method
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		Product product = new Product();
		Product p = (Product) obj;
		return this.name.equals(p.name) && this.id == p.id && this.name == p.name;
	}

}
