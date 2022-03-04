import java.util.Scanner;

import controller.ClienteController;
import model.Banco;
import model.Cliente;
import model.ContaCorrente;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		boolean contacc = true;
		int getid, contatransferencia;
		double valor;
		String variavelB;
		System.out.println("Digite a opção: ");

		Banco banco = new Banco();
		ContaCorrente conta = new ContaCorrente();

		Cliente cliente = new Cliente();
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println(" 1- Clientes"); System.out.println(" 2- Banco");
		 * System.out.println(" 3- Extrato");
		 */

		int menu;
		do {
			System.out.println();
			System.out.println(" 1- Clientes");
			System.out.println(" 2- Banco");
			System.out.println(" 3- Extrato");
			menu = sc.nextInt();
			switch (menu) {

			case 1:
				int menuCliente;
				do {
					System.out.println(" 1- Adicionar cliente conta Corrente");
					System.out.println(" 1- Adicionar cliente conta Poupança");

					menuCliente = sc.nextInt();

					switch (menuCliente) {
					case 1:
						contacc = true;
						System.out.println("adicionar cliente Conta Corrente");
						Cliente clientecc = ClienteController.adicionarcliente(contacc);
						banco.setClientescc(clientecc);
						System.out.println();
						banco.getClientescc();
						break;
					case 2:
						contacc = false;
						System.out.println("adicionar cliente Conta poupança");
						Cliente clientecp = ClienteController.adicionarcliente(contacc);
						banco.setClientescp(clientecp);
						banco.getClientescp();
						break;
					}
				} while (menuCliente != 0);
				break;
			case 2:
				System.out.println("1 - Depositar");
				System.out.println("2 - Sacar");
				System.out.println("3 - Transferir");

				int menuBanco = sc.nextInt();
				do {

					switch (menuBanco) {

					case 1:
						// System.out.println("Depositar");
						System.out.println("Digite o numero da conta a ser depositado: ");
						getid = sc.nextInt();
						System.out.println("Digite o valor a ser depositado: ");
						valor = sc.nextDouble();

						Cliente bancocc = banco.buscarclientecc(getid);
						if (bancocc == null) {
							Cliente clientebancocp = banco.buscarclientecp(getid);
							banco.depositar(clientebancocp, valor);
						} else
							banco.depositar(bancocc, valor);

						break;
					case 2:
						// System.out.println("Sacar");
						System.out.println("Digite o numero da conta a ser sacado: ");
						getid = sc.nextInt();
						System.out.println("Digite o valor a ser sacado: ");
						valor = sc.nextDouble();
						bancocc = banco.buscarclientecc(getid);
						if (bancocc == null) {
							Cliente clientebancocp = banco.buscarclientecp(getid);
							banco.sacar(clientebancocp, valor);
						} else
							banco.sacar(bancocc, valor);
						break;
					case 3:

						Cliente contaT = new Cliente();
						System.out.println("Digite o numero da sua conta: ");
						getid = sc.nextInt();
						bancocc = banco.buscarclientecc(getid);
						System.out.println("Digite o valor a ser transferido: ");
						valor = sc.nextDouble();
						System.out.println("Digite o numero da conta a ser transferido: ");
						contatransferencia = sc.nextInt();
						contaT = banco.buscarclientecc(contatransferencia);
						if (bancocc == null) {
							Cliente bancocp = banco.buscarclientecp(getid);
							contaT = banco.buscarclientecp(contatransferencia);
							banco.transferir(bancocp, contaT, valor);
						} else
							banco.transferir(bancocc, contaT, valor);
						break;

					}
					break;
				} while (menuBanco != 0);

				break;
			case 3:
				System.out.println("1 - Extrato conta corrente");
				System.out.println("1 - Extrato conta poupança");

				int menuExtrato = sc.nextInt();
				do {

					switch (menuExtrato) {
						
					case 1:
						System.out.println("1 - Extrato conta poupança");
						// System.out.println("Depositar");
						System.out.println("Digite o numero da conta: ");
						getid = sc.nextInt();
						
						Cliente bancocc = banco.buscarclientecc(getid);
						conta.Extratoconta(bancocc);
						if (bancocc == null) {
							/*Cliente clientebancocp = banco.buscarclientecp(getid);
							banco.depositar(clientebancocp, valor);*/
						} else
							//banco.depositar(bancocc, valor);

						break;
						
					case 2:
						
						System.out.println("1 - Extrato conta poupança");
						// System.out.println("Depositar");
						System.out.println("Digite o numero da conta: ");
						getid = sc.nextInt();
						
						Cliente bancocp = banco.buscarclientecc(getid);
						if (bancocp == null) {
							/*Cliente clientebancocp = banco.buscarclientecp(getid);
							banco.depositar(clientebancocp, valor);*/
						} else
							//banco.depositar(bancocc, valor);
						break;

					}
					break;
				} while (menuExtrato != 0);

				break;

			case 0:
				return;

			}
		} while (menu != 0);
		sc.close();
	}
}
