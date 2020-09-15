package Core;

public class ContaEspecial extends Conta {
	
	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, float saldo, float limite) {
		super(nomeTitular, cpf, numeroConta, saldo);
		this.limite = limite;
	}
	
	private float limite;

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	
	public boolean debitar(float valor) {
		if ((super.saldo + this.limite) < valor) {
			return false;
		} else {
			super.saldo = this.saldo - valor;
			return true;
		}
	}
	
}
