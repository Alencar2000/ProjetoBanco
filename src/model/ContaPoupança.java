package model;

public class ContaPoupança extends Cliente{
	public int numeroConta;

	public ContaPoupança(String nome,String telefone,String endereço,double saldo, int numeroConta) {
		super(nome,telefone,endereço,saldo);
		this.numeroConta = numeroConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

public void Extratoconta(Cliente cliente) {
	System.out.println(cliente.nome);
	System.out.println(cliente.endereço);
	System.out.println(cliente.telefone);
	System.out.println(cliente.saldo);

}

	
}
