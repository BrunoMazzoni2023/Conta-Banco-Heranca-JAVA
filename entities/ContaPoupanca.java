package entities;

public class ContaPoupanca extends Conta {
	
	private Double taxadeJurus;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, double saldo, Double taxadeJurus) {
		super(numero, titular, saldo);
		this.taxadeJurus = taxadeJurus;
	}

	public Double getTaxadeJurus() {
		return taxadeJurus;
	}

	public void setTaxadeJurus(Double taxadeJurus) {
		this.taxadeJurus = taxadeJurus;
	}
	
	public void saldoAtualizado() {
		saldo += saldo * taxadeJurus;
	}
	
}
