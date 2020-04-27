package modelo;

public class GrupoPesquisa {

	private String nome;
	private String pais;
	private Pesquisador listaP[] = new Pesquisador [10]; //composição


	
	//construtor
	
	
	 public GrupoPesquisa(String n, String p, Pesquisador lista []) {
		 this.nome = n;
		 this.pais = p;
		 this.listaP = lista;
		 
	}
	
	//getters and setters
	public void setListaP(Pesquisador[] novaLista){
		this.listaP =  novaLista;
		
		
	}
	
	 public Pesquisador[] getListaP() {
	 	return this.listaP;
	 
	} 
	 
	 
	 public String getNome() {
		return nome;
	}
	
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	
	public String getPais() {
		return pais;
	}
	
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String toString() {
		 return "GrupoPesquisa = " + "nome = " + this.nome + " pais = " + this.pais + " listaP = " + this.listaP;
		
		
	}
	

}
