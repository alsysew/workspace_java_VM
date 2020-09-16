package model;

public class Moto extends Veiculo{
	private String estilo;

	public Moto(String marca, String placa, String estilo) {
		super(marca, placa);
		this.estilo = estilo;
	}

	@Override
	public void acelerar() {
		System.out.println("Moto "+super.marca+"/"+super.placa+"/"+this.estilo+" acelerando na m�o! PROPROPROPRO");
		
	}

	@Override
	public void freiar() {
		System.out.println("Moto "+super.marca+"/"+super.placa+"/"+this.estilo+" freiando no p�! ROOOOOOOCCCCC");
		
	}
}