package model;

/*import java.util.ArrayList;
import java.util.Scanner;*/




public class Cliente {
	public String nome;
	public String telefone;
	public String endere�o;
	public int numeroconta;
	protected double saldo;
	
	public void setSaldo(Cliente cliente,double valor) {
		this.saldo = valor;
		cliente.saldo += valor;
		
	}

	public int getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}

	public Cliente() {
		
	}
	
	public Cliente(String nome, String telefone, String endere�o,double saldo) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endere�o = endere�o;
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}


	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	
	
	public void getClientes() {
		
	}



}
