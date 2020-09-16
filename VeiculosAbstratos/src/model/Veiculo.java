package model;

/* propósito da classe abstrata: criar um TEMPLATE DE ESTRUTURA, 
 * ou seja, todo objeto que herda (estende, amplia) o tipo Veiculo, vem minimamente
 * com a estrutura marca + placa
 */
public abstract class Veiculo {
	protected String marca;
	protected String placa;
	
	public Veiculo(String marca, String placa) {
		super();
		this.marca = marca;
		this.placa = placa;
	}
	
	// crio "cláusulas contratuais". Na classe abstrata eu defino QUAL tem que ser a funcionalida
	// defino o "O QUE"
	
	// as classes filhas que vão herdar dessa classe Base, comprometem-se a implementar a lógica
	// destes métodos (ou seja, o "COMO")
	// neste caso, a classe veículo define 2 cláusulas contratuais: acelerar e frear
	public abstract void acelerar();
	public abstract void freiar();
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}
