package model;

public class Conta {
	private String nome;
	public int agencia;
	public Conta() {
		
	}
	public Conta(String nome, int agencia) {
		this.nome = nome;
		this.agencia = agencia;
	}	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	
	
	
	
	
}
