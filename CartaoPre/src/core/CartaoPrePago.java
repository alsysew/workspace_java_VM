package core;

public class CartaoPrePago {
	protected String nomeTitular;
	protected String numCartao;
	protected int mesValidade;
	protected int anoValidade;
	protected double saldo;

	public CartaoPrePago(String nomeTitular, String numCartao, int mesValidade, int anoValidade) {
		super();
		this.nomeTitular = nomeTitular;
		this.numCartao = numCartao;
		this.mesValidade = mesValidade;
		this.anoValidade = anoValidade;
	}

	public void adicionarCredito(double valor) {
		this.saldo += valor;
	}

	public boolean comprar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}

	public int getMesValidade() {
		return mesValidade;
	}

	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}

	public int getAnoValidade() {
		return anoValidade;
	}

	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}

	public double getSaldo() {
		return saldo;
	}

	public String exibirInfo() {
		String info = "CARTAO   " + numCartao + " (" + nomeTitular + ")" + "\n" + "VALIDADE " + mesValidade + "/"
				+ anoValidade + "   Saldo R$ " + String.format("%.2f", saldo);
		return info;
	}

}