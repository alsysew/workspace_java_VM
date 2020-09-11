/* neste arquivo (classe) vou definir as caracter�sticas
 * que descrevem um carro, ou seja, vou declarar a estrutura do novo
 * tipo de dao CARRO, da mesma forma que se declaram vari�veis
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
	
	// defino os m�todos (ou seja, as funcionalidades da classe)
	
	// primeiro m�todo: exibir o anuncio
	void exibirAnuncio(){
		System.out.println("******    OFERTA IMPERDIVEL    ******");
		System.out.println(marca+"/"+modelo);
		System.out.println("Ano: "+ano + "  Final da Placa:"+finalPlaca);
		System.out.println("Cor: "+cor);
		System.out.println("Combustivel: "+combustivel);
		System.out.println("R$  "+preco);
		System.out.println("-------------------------------------");
	}
	
	// segundo m�todo: calcular o IPVA
	/* vamos supor que o IPVA � sempre 3% do valor do carro */
	float calcularIPVA(){
		float ipva;          // declarei uma vari�vel local (s� existe enquanto este m�todo executa)
		ipva = preco * 0.03f; // fiz a continha (aqui � simples, mas poderia ser complexa)    
		return ipva;         // retorno o valor armazenado nesta vari�vel, para quem for cham�-lo na classe principal
	}
}