package model;

public class ContaCorrente extends Cliente{
	public int numeroConta;
	
	public ContaCorrente(String nome,String telefone,String endere�o,double saldo, int numeroConta) {
		super(nome,telefone,endere�o,saldo);
		this.numeroConta = numeroConta;
	}
	public ContaCorrente() {
		
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public void Extratoconta(Cliente cliente) {
		System.out.println(cliente.nome);
		System.out.println(cliente.endere�o);
		System.out.println(cliente.telefone);
		System.out.println(cliente.saldo);

	}
	
	
		
}
