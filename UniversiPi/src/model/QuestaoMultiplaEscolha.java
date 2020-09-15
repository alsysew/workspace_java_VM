
package model;

public class QuestaoMultiplaEscolha extends QuestaoSimples {
	private String alternativaA;
	private String alternativaB;
	private String alternativaC;
	private String alternativaD;
	
	public QuestaoMultiplaEscolha(String enunciado, String resposta, String alternativaA, String alternativaB,
			String alternativaC, String alternativaD) {
		super(enunciado, resposta);
		this.alternativaA = alternativaA;
		this.alternativaB = alternativaB;
		this.alternativaC = alternativaC;
		this.alternativaD = alternativaD;
	}
	
	
	public String aplicarQuestao() {
		return super.enunciado+"\n"+
	           "  a)"+this.alternativaA+"\n"+
			   "  b)"+this.alternativaB+"\n"+
	           "  c)"+this.alternativaC+"\n"+
			   "  d)"+this.alternativaD;
	}
	
	


}

