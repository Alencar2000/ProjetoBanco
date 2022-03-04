package model;

import java.util.ArrayList;

import controller.ClienteController;

public class Banco  extends Cliente{
	private String nome;

	public int agencia;
	public int contacorrente;
	public int contapoupança;
	public double saldo;
	public ArrayList<Cliente> clientescp = new ArrayList<Cliente>(); // Clientes conta poupança
	public ArrayList<Cliente> clientescc = new ArrayList<Cliente>(); // Clientes conta corrente

	public Banco() {

	}

	public Banco(String nome, int agencia, double saldo) {
		this.nome = nome;
		this.agencia = agencia;
	}

	public Banco(int agencia, double saldo) {
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

	public void sacar(Cliente cliente,Double valor) {
		cliente.saldo -= valor;
		System.out.print("Saldo");
		System.out.print("R$");System.out.println(cliente.saldo);
		System.out.println();


		

	}

	public void depositar(Cliente cliente,Double valor) {
		

		cliente.saldo += valor;
		System.out.print("Saldo");
		System.out.print("R$ ");System.out.println(cliente.saldo);
		
			

	}
	
	public void transferir(Cliente cliente,Cliente clientetransferencia, Double valor) {
		this.sacar(cliente, valor);
		this.depositar(clientetransferencia, valor);
		
		
	}

	public Cliente buscarclientecc(int codigo) {
		int codigo1 = codigo;

			for (Cliente cliente : this.clientescc) {
				if (cliente.getNumeroconta() == codigo1) {
					return cliente;
				}
		}
		System.out.println("Codigo não encontrado");
		return null;
	}
	public Cliente buscarclientecp(int codigo) {
		int codigo1 = codigo;

			for (Cliente cliente : this.clientescp) {
				if (cliente.getNumeroconta() == codigo1) {
					return cliente;
				}
		}
		System.out.println("Codigo não encontrado");
		return null;
	}


	//

	public void getClientescc() {
		for (Cliente cliente : this.clientescc) {
			ClienteController.listarcliente(cliente);
		}
	}

	public void setClientescc(Cliente cliente) {
		this.clientescc.add(cliente);
	}
	
	// get and set clientes Counta poupança
	public void getClientescp() {
		for (Cliente cliente : this.clientescp) {
			ClienteController.listarcliente(cliente);
		}
	}

	public void setClientescp(Cliente cliente) {
		this.clientescp.add(cliente);
	}

}
