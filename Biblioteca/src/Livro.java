
public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String categoria;
	private int posicaoEstante;
	private int posicaoPrateleira;
	private boolean  emprestado;
	
	public Livro(String titulo, String autor, int anoPublicacao, String categoria, int posicaoEstante, int posicaoPrateleira, boolean emprestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.categoria = categoria;
		this.posicaoEstante = posicaoEstante;
		this.posicaoPrateleira = posicaoPrateleira;
		this.emprestado = emprestado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPosicaoEstante() {
		return posicaoEstante;
	}

	public void setPosicaoEstante(int posicaoEstante) {
		this.posicaoEstante = posicaoEstante;
	}

	public int getPosicaoPrateleira() {
		return posicaoPrateleira;
	}

	public void setPosicaoPrateleira(int posicaoPrateleira) {
		this.posicaoPrateleira = posicaoPrateleira;
	}
	
	
	
	public void Emprestar() {
		this.emprestado = true;
		
	}
	
	public void Devolver() {
		this.emprestado = false;
	}
	
	public void imprimir() {
		System.out.println("Título: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("Ano de publicação: "+anoPublicacao);
		System.out.println("Categoria: "+categoria);
		System.out.println("Posição Estante: "+posicaoEstante);
		System.out.println("Posição Prateleira: "+posicaoPrateleira);
		if (emprestado) {
			System.out.println("Situação: Emprestado");
		}
		else {
			System.out.println("Situação: Não Emprestado");
		}
		System.out.println("----------------------------------------");
		
		
		
	}
}
