package model;

public class Livro {
	public String title;
	public int isbn; 
	
	
	/*public Livro(String t, int c, Usuario [] lista) {
		this.title = t;
		this.isbn = c;
		
				
		
		
	}*/


	public String getTitle() {
		return title;
	}


	public void setTitle(String t) {
		this.title = t;
	}


	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int c) {
		this.isbn = c;
	}
	


	public String toString() {
		return " Livro: " + this.title +
				" ISBN: " + this.isbn;
	}
	
	
}
