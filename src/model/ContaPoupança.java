package model;

public class ContaPoupan�a extends Cliente{
	public int numeroConta;

	public ContaPoupan�a(String nome,String telefone,String endere�o,double saldo, int numeroConta) {
		super(nome,telefone,endere�o,saldo);
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
	System.out.println(cliente.endere�o);
	System.out.println(cliente.telefone);
	System.out.println(cliente.saldo);

}

	
}
