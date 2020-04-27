package model;



public class Usuario {
	
	public String name;
	public int registration;
	public String course; 
	//public Livro listaL [] = new Livro [3];
	
	
	/*public Usuario(String n, int r, String c) {
		this.name = n;
		this.registration = r;
		this.course = c; 
		
	}*/ 



	/*public void setListaL(Livro[] novaLista){
		this.listaL =  novaLista;
	}	
	
	 public Livro[] getListaL() {
		 	return this.listaL;
	 }*/
	
	
	public String getName() {
		return name;
	}



	public void setName(String n) {
		this.name = n;
	}



	public int getRegistration() {
		return registration;
	}



	public void setRegistration(int r) {
		this.registration = r;
	}



	public String getCourse() {
		return course;
	}



	public void setCourse(String c) {
		this.course = c;
	}
	
	public String toString() {
		return " User: " + this.name + 
				" ID: " + this.registration + 
				" Course: " + this.course; 
				
		
	}


}
