
package ui;

import model.Carro;
import model.Moto;
import model.Veiculo;

public class Concessionaria {
	public static void main(String[] args) {
		Veiculo v1, v2;
		
		v1 = new Carro("Fiat 147", "ABC1234", 4);
		v2 = new Moto("CG 125", "XYZ9876", "Moto de fuga!");
		
		
		v1.acelerar();
		v1.freiar();
		v2.acelerar();
		v2.freiar();
	}

}