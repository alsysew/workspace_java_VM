package ui;

import java.util.Scanner;

import model.QuestaoComDica;
import model.QuestaoMultiplaEscolha;
import model.QuestaoSimples;

public class Prova {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String resp;
		int pontos=0;
		
		QuestaoSimples lista[] = new QuestaoSimples[5];
		lista[0] = new QuestaoSimples("Quem é o dono do interior?","XV de Jau");
		lista[1] = new QuestaoComDica("Qual a linguagem do curso?","JAVA","Começa com JA e termina com VA");
		lista[2] = new QuestaoMultiplaEscolha("Quanto vale 2+2", "quatro", "um", "dois", "tres", "quatro");
		lista[3] = new QuestaoSimples("Qual a formula da agua?","h2o");
		lista[4] = new QuestaoComDica("Qual a cor do cavalo Branco de Napoleao?","Marrom","Cuidado com o nome");
	
	    for (QuestaoSimples q: lista) {
	    	System.out.println(q.aplicarQuetao());
	    	resp = teclado.nextLine();
	    	if (q.corrigir(resp)) {
	    		pontos++;
	    	}
	    }
	    System.out.println("Voce acertou "+pontos+" de um total de "+lista.length);
	}

}