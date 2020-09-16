package iu;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class CalcularFolha {
	
	public static void main(String[] args) {
		
		Funcionario[] func = new Funcionario[4];
		func[0] = new Chefe("Andre", 1, 10000.0f, 15.0f, 100.0f);
		func[1] = new Comissionado("Andrea", 2, 1000.0f, 10.0f);
		func[2] = new Horista("Beatriz", 3, 900.0f, 50);
		func[3] = new Empreiteiro("Isidro", 4, 800.0f);
		
		for (Funcionario f: func ) {
//			f.imprimir();
//			System.out.println("Salário = "+f.calcularSalario());
			
			System.out.println(f);
		}
		
	}
	

}
