package userInterface;

import core.CartaoCashBack;
import core.CartaoPrePago;

public class TesteCartao {
	public static void main(String[] args) {
		
		CartaoPrePago  cp1;
		CartaoCashBack cb1;
		
		cp1 = new CartaoPrePago("A1","Andre",2021,05);
		cb1 = new CartaoCashBack("B1","Ricardo",2022,06,2);
		
		System.out.println("Numero Cartão: "+cp1.getNumeroCartao()+" - Titular: "+cp1.getNometitular()+" - Validade: "+cp1.getMesValidade()+"/"+cp1.getAnoValidade());
		cp1.adicionarCredito(100);
		cp1.comprar(200);
		System.out.println();
		
		
		System.out.println("Numero Cartão: "+cb1.getNumeroCartao()+" - Titular: "+cb1.getNometitular()+" - Validade: "+cb1.getMesValidade()+"/"+cb1.getAnoValidade());
		cb1.adicionarCredito(200);
		cb1.comprar(50);
		
		
	}
	
	
	
}
