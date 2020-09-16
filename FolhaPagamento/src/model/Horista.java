package model;

public class Horista extends Funcionario {
	private float valorHora;
	private int numeroHoras;

	
	public Horista(String nome, int registro, float valorHora, int numeroHoras) {
		super(nome, registro);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}

	public String toString() {
		return "Horista: "+super.nome;
	}

	@Override
	public float calcularSalario() {
		return this.valorHora * this.numeroHoras;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	
	
	
	
}
