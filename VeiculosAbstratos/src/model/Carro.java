
package model;

public class Carro extends Veiculo{
	private int lugares;

	public Carro(String marca, String placa, int lugares) {
		super(marca, placa);
		this.lugares = lugares;
	}

	@Override
	public void acelerar() {
		System.out.println("Carro "+super.marca+"/"+super.placa+"/"+this.lugares+" acelerando no pé! VRUMMMMM");
	}

	@Override
	public void freiar() {
		System.out.println("Carro "+super.marca+"/"+super.placa+"/"+this.lugares+" freiando na mão! IIICCCHHHHHH");
	}

	// nestes casos, a classe carro, ao comprometer-se em estender (ampliar) a classe Veículo
	// precisa definir o corpo dos códigos referentes aos métodos abstratos de Veículo

	
	

}