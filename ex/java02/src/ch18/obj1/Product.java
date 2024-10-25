package ch18.obj1;

import java.io.Serializable;

public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	} 
	
	public String getName() {
		return name;
	} 

	public void setName(String name) {
		this.name = name;
	} 
 
	public int getPrice() {
		return price;
	} 

	public void setPrice(int price) {
		this.price = price;
	} 
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	} 

}
