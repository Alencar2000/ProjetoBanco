package model;

public class ContaPoupanša extends Cliente{
	public int numeroConta;

	public ContaPoupanša(String nome,String telefone,String enderešo,double saldo, int numeroConta) {
		super(nome,telefone,enderešo,saldo);
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
	System.out.println(cliente.enderešo);
	System.out.println(cliente.telefone);
	System.out.println(cliente.saldo);

}

	
}
