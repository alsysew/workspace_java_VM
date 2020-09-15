package core;

public class CartaoPrePago {
	protected String numeroCartao;
	protected String nometitular;
	protected int anoValidade;
	protected int mesValidade;
	protected double saldo;

	public CartaoPrePago(String numeroCartao, String nometitular, int anoValidade, int mesValidade) {
		this.numeroCartao = numeroCartao;
		this.nometitular = nometitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = saldo;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getNometitular() {
		return nometitular;
	}

	public void setNometitular(String nometitular) {
		this.nometitular = nometitular;
	}

	public int getAnoValidade() {
		return anoValidade;
	}

	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}

	public int getMesValidade() {
		return mesValidade;
	}

	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}

	public double getSaldo() {
		return saldo;
	}


	public void adicionarCredito(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean comprar(double valor) {
		if (this.saldo < valor) {
			System.out.println("Salso insuficiente. Saldo: "+getSaldo());
			return false;
		}
		else {
			this.saldo = this.saldo - valor;
			System.out.println("Compra efetuada. Saldo: "+getSaldo());
			return true;
		}
	}

	
	
}
