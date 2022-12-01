package entities;

public class ContaPrime extends Conta {
		
	private Double emprestimoLimite;
	
	public ContaPrime() {
		
	}

	public ContaPrime(Integer numero, String titular, double saldo, Double emprestimoLimite) {
		super(numero, titular, saldo);
		this.emprestimoLimite = emprestimoLimite;
	}

	public Double getEmprestimoLimite() {
		return emprestimoLimite;
	}

	public void setEmprestimoLimite(Double emprestimoLimite) {
		this.emprestimoLimite = emprestimoLimite;
	}
	
	public void emprestimo(double quantia) {
		if (quantia <= emprestimoLimite) {
			saldo += quantia - 10;
		}
	
	}
}
