package modelo;

public class Pesquisador {

	private String nome;
	private String pais;
	private String descricao;
	
	
	 public Pesquisador(String n, String p, String d){
	        this.nome = n;
	        this.pais = p;
	        this.descricao = d;
	    }


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	 
	 
	 public String toString() {
		 return "Pesquisador - Nome: "+ this.nome + "Pais: " + this.pais + "Descrição: " + this.descricao;
		 
		 
	 }





















}
