package core;

public class CartaoCashBack extends CartaoPrePago {

	private int tipo;

	public CartaoCashBack(String numeroCartao, String nometitular, int anoValidade, int mesValidade, int tipo) {
		super(numeroCartao, nometitular, anoValidade, mesValidade);
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public boolean comprar(double valor) {
		if (this.saldo < valor) {
			System.out.println("Salso insuficiente. Saldo: " + getSaldo());
			return false;
		} else {
			switch (this.tipo) {
			case 1:
				this.saldo = (this.saldo - valor) + (valor * 0.02);
				System.out.println("Compra efetuada. Saldo: " + getSaldo() + " Desconto: " + (valor * 0.02));
				break;
			case 2:
				this.saldo = (this.saldo - valor) + (valor * 0.05);
				System.out.println("Compra efetuada. Saldo: " + getSaldo() + " Desconto: " + (valor * 0.05));
				break;
			case 3:
				this.saldo = (this.saldo - valor) + (valor * 0.08);
				System.out.println("Compra efetuada. Saldo: " + getSaldo() + " Desconto: " + (valor * 0.08));
				break;
			}
		}
		return true;
	}

}
