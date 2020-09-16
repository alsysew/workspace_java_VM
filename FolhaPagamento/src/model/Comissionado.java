package model;

public class Comissionado extends Funcionario{

	private float salarioBase;
	private float comissao;
	
	public Comissionado(String nome, int registro, float salarioBase, float comissao) {
		super(nome, registro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	@Override
	public float calcularSalario() {
		return this.salarioBase + (this.salarioBase * this.comissao / 100);
	}
	
	public String toString() {
		return "Comissionado: "+super.nome;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	
	
	
}
