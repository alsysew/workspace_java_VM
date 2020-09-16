package model;

public abstract class Funcionario {
	protected String nome;
	protected int registro;

	public Funcionario(String nome, int registro) {
		super();
		this.nome = nome;
		this.registro = registro;
	}
	
	
	public abstract float calcularSalario();
	
	public String toString() {
		return "Funcionario: "+nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}
	
	
	
	
	
	
	
	
}
