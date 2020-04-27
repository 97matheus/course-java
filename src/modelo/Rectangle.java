package model;

public class Rectangle {

	public double width;
	public double height;



	//construtor
	
	/*public Rectangle(double w, double h) {
		this.width = w;
		this.height = h; 
	}*/
	
	// metodos
	
	public double totalArea() {
		return this.width * this.height;
		
	}

	public double perimeter() {
		return 2*this.width + 2*this.height;
		
	}

	public double diagonal () {
		return Math.sqrt(this.width*this.width) + (this.height + this.height);  
		
		
	}
	
	public String toString() {
		return " AREA = " + this.totalArea() + 
				" PERIMETER = " + this.perimeter() + 
				" DIAGONAL = " + this.diagonal();
		
		
	}
	














}
