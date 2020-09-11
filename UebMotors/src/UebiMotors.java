  
public class UebiMotors {
	public static void main(String args[]) {
        /* aqui eu declaro as "variáveis" do novo tipo de dado, chamado CARRO 
         */
		Carro c1, c2, c3;
		
		// eu ainda não tenho o espaço de memória reservado, portanto
		// preciso solicitar para a JVM uma área para armazenar todas as infos
		
		c1 = new Carro();  // ao invocar o NEW, a VM reserva um espaço de memória
		c2 = new Carro();  // para que eu consiga atribuir valores
		c3 = new Carro();  // a este processo damos o nome de "INSTANCIAÇÃO"
		
		
		
		c1.marca  = "Fiote";
		c1.modelo = "147 Turbo Abarth";
		c1.ano    = 1982;
		c1.combustivel = "Gasolina Podium";
		c1.finalPlaca  = 1;
		c1.cor         = "Azul Geladeira da casa da vó";
		c1.preco       = 82350;
		
		c2.marca  = "Vokis";
		c2.modelo = "Fuscao 6V";
		c2.ano    = 1975;
		c2.combustivel = "Alcool";
		c2.finalPlaca  = 4;
		c2.cor         = "Beginho desbotado";
		c2.preco       = 93725;
		
		c3.marca  = "Forde";
		c3.modelo = "Del Rey Ghia S";
		c3.ano    = 1985;
		c3.combustivel = "Gas de cozinha clandestino";
		c3.finalPlaca  = 7;
		c3.cor         = "Bordô metalizado";
		c3.preco       = 45012;
				
		c1.exibirAnuncio();
		float impostoC1 = c1.calcularIPVA();
		System.out.println("VALOR DO IPVA = "+impostoC1);
		c2.exibirAnuncio();
		float impostoC2 = c2.calcularIPVA();
		System.out.println("VALOR DO IPVA = "+impostoC2);
		c3.exibirAnuncio();
		System.out.println("VALOR DO IPVA = "+c3.calcularIPVA());
		
		
	}
}