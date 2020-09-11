/* neste arquivo (classe) vou definir as características
 * que descrevem um carro, ou seja, vou declarar a estrutura do novo
 * tipo de dao CARRO, da mesma forma que se declaram variáveis
 * 
 */

public class Carro {
	
	// defino os atributos (ou seja, a estrutura)
	String marca;
	String modelo;
	int    ano;
	int    finalPlaca;
	String cor;
	String combustivel;
	float  preco;
	
	// defino os métodos (ou seja, as funcionalidades da classe)
	
	// primeiro método: exibir o anuncio
	void exibirAnuncio(){
		System.out.println("******    OFERTA IMPERDIVEL    ******");
		System.out.println(marca+"/"+modelo);
		System.out.println("Ano: "+ano + "  Final da Placa:"+finalPlaca);
		System.out.println("Cor: "+cor);
		System.out.println("Combustivel: "+combustivel);
		System.out.println("R$  "+preco);
		System.out.println("-------------------------------------");
	}
	
	// segundo método: calcular o IPVA
	/* vamos supor que o IPVA é sempre 3% do valor do carro */
	float calcularIPVA(){
		float ipva;          // declarei uma variável local (só existe enquanto este método executa)
		ipva = preco * 0.03f; // fiz a continha (aqui é simples, mas poderia ser complexa)    
		return ipva;         // retorno o valor armazenado nesta variável, para quem for chamá-lo na classe principal
	}
}