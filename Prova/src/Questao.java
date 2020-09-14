
public class Questao {
	private String enunciado;
	private String resposta;
	
	public Questao(String enunciado, String resposta) {
		this.enunciado = enunciado;
		this.resposta = resposta;
	}
	
	public String apresentarQuestao() {
		return enunciado;
	}
	
	public boolean corrigir(String resposta) {
		return this.resposta.equals(resposta);
	}
		
}
