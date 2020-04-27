package modelo;

public class Product {
	private String name;
	private double price;
	private int quantity;
	//public int quantity_stock;


// construtores
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity; 
		
	
	}

// getters and setters 
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



	public int getQuantity() {
		return quantity;
	}



	/*public void setQuantity(int quantity) {
		this.quantity = quantity;
	}*/ 
	

// métodos
	
	public double totalValueInStock() {
		return this.price*this.quantity;
		
	}

	public void addProducts(int quantity) {
		this.quantity += quantity ;
		
	}


	 public String toString() {
		 return "Name: " + this.name + 
				 " |" + " Price: $" + this.price + 
				 " |"+ " Quantity in stock: " + this.quantity + " | Total: $"
				 + totalValueInStock();
		 
	 }

}
