package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ProductTest {

	public static void main(String[] args) {
		
		ArrayList<Product> pList = new ArrayList<Product>();
		Product p1 = new Product();
		 
		System.out.println(p1.getCode());
		System.out.println(p1.getColor());
		System.out.println(p1.getName());
		System.out.println(p1.getQty());
		System.out.println(p1.toString());
		
		Product p2 = new Product("0002", "SMART TV", "흰색", 200);
		Product p3 = new Product("0003", "노트북", "은색", 100);
		
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		ProductTest pt1 = new ProductTest();
		pt1.getProdInfo(pList);
//		ProductTest.getProdInfo(pList);		 
		
		
		
	}
	
	public static void getProdInfo(List<Product> list) {
		Product prod = null;
		String code = null;
		String name = null;
		String color = null;
		int qty = 0;
		for(int i=0; i <list.size() ; i++) {
			prod = (Product)list.get(i);
			code = prod.getCode();
			name = prod.getName();
			color = prod.getColor();
			qty = prod.getQty();
			
			System.out.println("product code = " + code);
			System.out.println("product name = " + name);
			System.out.println("product color = " + color);
			System.out.println("product qty = " + qty);
			System.out.println();
		}
	}

}
