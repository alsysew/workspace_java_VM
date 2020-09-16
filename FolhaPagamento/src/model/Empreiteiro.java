package model;

public class Empreiteiro extends Funcionario	 {

	public float valorEmpreitada;

	
	public Empreiteiro(String nome, int registro, float valorEmpreitada) {
		super(nome, registro);
		this.valorEmpreitada = valorEmpreitada;
	}
	
	public String toString() {
		return "Empreiteiro: "+super.nome;
	}
	
	
	@Override
	public float calcularSalario() {
		return this.valorEmpreitada;
	}

	public float getValorEmpreitada() {
		return valorEmpreitada;
	}

	public void setValorEmpreitada(float valorEmpreitada) {
		this.valorEmpreitada = valorEmpreitada;
	}
	
	
	
}
