package core;

public class CartaoCashBack extends CartaoPrePago {
	private int tipo; // 0 - GOLD / 1 - SILVER / 2 - BRONZE

	public CartaoCashBack(String nomeTitular, String numCartao, int mesValidade, int anoValidade, int tipo) {
		super(nomeTitular, numCartao, mesValidade, anoValidade);
		this.tipo = tipo;
	}

	@Override
	public boolean comprar(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			switch (this.tipo) {
			case 0:
				super.saldo += valor * 0.08;
				break;
			case 1:
				super.saldo += valor * 0.05;
				break;
			case 2:
				super.saldo += valor * 0.02;
				break;
			}
			return true;
		}
		return false;
	}

	public String exibirInfo() {
		String strTipo = "";
		if (this.tipo == 0) {
			strTipo = "Cartao Categoria GOLD";
		} else if (this.tipo == 1) {
			strTipo = "Cartao Categoria SILVER";
		} else if (this.tipo == 2) {
			strTipo = "Cartao Categoria BRONZE";
		}
		return super.exibirInfo() + "  " + strTipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
