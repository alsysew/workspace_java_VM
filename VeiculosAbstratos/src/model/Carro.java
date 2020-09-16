
package model;

public class Carro extends Veiculo{
	private int lugares;

	public Carro(String marca, String placa, int lugares) {
		super(marca, placa);
		this.lugares = lugares;
	}

	@Override
	public void acelerar() {
		System.out.println("Carro "+super.marca+"/"+super.placa+"/"+this.lugares+" acelerando no p�! VRUMMMMM");
	}

	@Override
	public void freiar() {
		System.out.println("Carro "+super.marca+"/"+super.placa+"/"+this.lugares+" freiando na m�o! IIICCCHHHHHH");
	}

	// nestes casos, a classe carro, ao comprometer-se em estender (ampliar) a classe Ve�culo
	// precisa definir o corpo dos c�digos referentes aos m�todos abstratos de Ve�culo

	
	

}