package UserInterface;
import Core.Conta;
import Core.ContaEspecial;

public class testeConta {
	public static void main(String[] args) {
		Conta c1;
		ContaEspecial c2;
		
		c1 = new Conta("Andre","999999",1,500);
		c2 = new ContaEspecial("Eduardo","777777",2,800,200);
		
		c1.creditar(200);
		
		if (c1.debitar(10000)){
			System.out.println("Debito Efetuado com sucesso. Saldo Atual: "+c1.getSaldo());
		}
		else {
			System.out.println("Saldo insuficiente. Saldo Atual: "+c1.getSaldo());
		}
		
		
		
	}
	
	
	
}
