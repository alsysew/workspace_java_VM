//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Prova {
	public static void main(String[] args) {
		//Scanner teclado = new Scanner(System.in);

		Questao lista[];
		lista = new Questao[5];
		String resp;
		boolean resultado;

		lista[0] = new Questao("Quanto vale 1+1?", "2");
		lista[1] = new Questao("Qual a formula da água?", "H2O");
		lista[2] = new Questao("Qual a cor do cavalo Branco de Napoleao?", "Marrom");
		lista[3] = new Questao("Quem ganhou o Sub 20 da 2a divisão do Paulista 2019", "XV de Jaú");
		lista[4] = new Questao("Quem descobriu o Brasa?", "PA Cabral");

		for (Questao q : lista) {

			//System.out.println(q.apresentarQuestao());
			// vou ler a resposta do usuario
			//resp = teclado.nextLine();
			
			resp = JOptionPane.showInputDialog(q.apresentarQuestao());
			resultado = q.corrigir(resp);
			if (resultado) {
				JOptionPane.showMessageDialog(null,"ACERTOU!");
				//System.out.println("ACERTOU - parabéns");
			} else {
				JOptionPane.showMessageDialog(null, "ERROU");
				//System.out.println("ERRRROOOOUUUWWW - Lembre do Faustão falando...");
			}

		}
		//teclado.close();
	}
}