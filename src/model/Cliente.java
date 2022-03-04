package model;

/*import java.util.ArrayList;
import java.util.Scanner;*/




public class Cliente {
	public String nome;
	public String telefone;
	public String endereço;
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
	
	public Cliente(String nome, String telefone, String endereço,double saldo) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereço = endereço;
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
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	
	public void getClientes() {
		
	}



}
