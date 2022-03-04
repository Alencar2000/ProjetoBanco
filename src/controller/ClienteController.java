package controller;

import java.util.Scanner;

import model.Cliente;

public class ClienteController {

	public static int numconstantecc = 1;
	public static int numconstantecp = 1;

	public static Cliente adicionarcliente(Boolean conta) {
		boolean contacc = conta;
		Cliente cliente = new Cliente();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		cliente.setNome(nome);
		System.out.println("Digite seu endereço: ");
		String endereco = sc.nextLine();
		cliente.setEndereço(endereco);
		System.out.println("Digite o telefone: ");
		String telefone = sc.nextLine();
		cliente.setTelefone(telefone);
		if (contacc == true) {
			cliente.numeroconta = numconstantecc++;
		} else
			cliente.numeroconta = numconstantecp++;

		return cliente;
	}

	public static Cliente listarcliente(Cliente cliente) {

		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Endereço: " + cliente.getEndereço());
		System.out.println("Telefone: " + cliente.getTelefone());

		return cliente;
	}

}
