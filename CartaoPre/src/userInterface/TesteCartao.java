package userInterface;

import core.CartaoCashBack;
import core.CartaoPrePago;

public class TesteCartao {
	public static void main(String[] args) {
		
		CartaoPrePago cartoes[];
		
		cartoes = new CartaoPrePago[5];  // 5 referencias para a superclasse CartaoPrePago
		
		cartoes[0] = new CartaoPrePago ("Titular Prepago 1","1234567890",10,2030);
		cartoes[1] = new CartaoPrePago ("Titular Prepago 2","2345678901",11,2030);
		cartoes[2] = new CartaoCashBack("Titular Gold    1","3456789012",11,2030,0);
		cartoes[3] = new CartaoCashBack("Titular Silver  1","4567890123",12,2030,1);
		cartoes[4] = new CartaoCashBack("Titular Bronze  1","5678901234",11,2029,2);
		
		for (CartaoPrePago c: cartoes) {
			c.adicionarCredito(1000);
			System.out.println(c.exibirInfo());
		}
		
		for (CartaoPrePago c: cartoes) {
			c.comprar(100);
			System.out.println(c.exibirInfo());
		}
		
	}
}