package arraylist;

public class Product {
	
	private String code;
	private String name;
	private String color;
	private int qty;
	
	// 기본 생성자 메소드 : 컴파일러가 한다.
	public Product() {
		this("0001", "스마트폰", "블랙", 100);		
		System.out.println("매개변수가 없는 생성자 메소드");
		System.out.println("code = " + code);
		System.out.println("qty = " + qty);		
	}
	
	public Product(String code, String name, String color, int qty) {
		System.out.println("매개변수가 있는 생성자 메소드");
		this.code = code;
		this.name = name;
		this.color = color;
		this.qty = qty;		
	}
	// 속성메소드
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
 
	
	public String toString() {
		return "상품 [code=" + code + 
				", name=" + name + 
				", color=" + color + 
				", qty=" + qty + 
				"]";
	} 
}
