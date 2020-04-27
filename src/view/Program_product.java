package view;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Product;


public class Program_product {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	//Product product;
	ArrayList<Product> list = new ArrayList<>();
	
	System.out.println("Quantity of products?(only numbers):  ");
	int n = sc.nextInt();
	
	for (int i = 0; i < n; i++) {
		
		System.out.println("----- Enter product data: -----");
		System.out.println("Name: ");
		String name = sc.next();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);	
		list.add(product);
	
	 System.out.println( );
	
	}
	
	
	
	System.out.println("-=-=-=-=-=-=-=-=-=--==-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=");
	for (Product product : list) {
		System.out.println(product);
		
	
	}
	
	
	sc.close();
	}

}
