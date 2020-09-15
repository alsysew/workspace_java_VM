
public class GerenciaDeMemoria {
	public static void main(String[] args) {
		
		Produto p1, p2;
		FabricaDeProdutos fabrica = new FabricaDeProdutos();
		
		p1 = fabrica.fabricarNovo();
		p1.setCodigo(1);
		p1.setDescricao("Computador");
		p1.setPreco(1000);
		
		p2 = p1; // eu fa�o uma c�pia?? N�o. Neste caso, P2 aponta para a mesma �rea de mem�ria que P1
		
		System.out.println(p1.getCodigo()+","+p1.getDescricao()+","+p1.getPreco());
		System.out.println(p2.getCodigo()+","+p2.getDescricao()+","+p2.getPreco());
		
		
		System.out.println();
		System.out.println("Alterando o pre�o via P2");
		p2.setPreco(1500.0);
		
		System.out.println();
		System.out.println(p1.getCodigo()+","+p1.getDescricao()+","+p1.getPreco());
		System.out.println(p2.getCodigo()+","+p2.getDescricao()+","+p2.getPreco());
		
		System.out.println("Mas e se eu quisesse uma c�pia de verdade?");
		// R: cria um novo objeto em P2 e atribui os valores dele com os valores de P1
		//p2 = new Produto(p1.getCodigo(), p1.getDescricao(), p1.getPreco());
		
		p2 = fabrica.clonarProduto(p1);
		
		if (p2 == p1) {
			System.out.println("Apontam para mesmo endereco");
		}
		else {
			System.out.println("Apontam para enderecos distintos");
		}
		
		
		if (p2.equals(p1)) {
			System.out.println("Possuem o mesmo conteudo");
		}
		else {
			System.out.println("Possuem conteudos diferentes");
		}
		
		p2.setPreco(2000);
		System.out.println(p1.getCodigo()+","+p1.getDescricao()+","+p1.getPreco());
		System.out.println(p2.getCodigo()+","+p2.getDescricao()+","+p2.getPreco());
		
		
		System.out.println("---------------------------------------------------");
		
		for (int i=1; i<=10; i++) {
			p1 = new Produto(i,"Produto "+i,i*100);
		}
		
		//System.gc();
		//System.out.println("codigo "+p1.getCodigo());
		
		
		System.out.println("-----------------------------------------------");
		
		String s1 = "Oi, tudo bem? Quer tc?";
		String s2 = "Oi, tudo bem? Quer tc?";  // s2 = s1
		
		if (s1 == s2) {  // aqui eu comparo endere�os de mem�ria
			System.out.println("Mesmo Endere�o de Mem�ria");
		}
		else {
			System.out.println("Diferentes endere�os");
		}
		
		
		if (s1.equals(s2)) {  // aqui sim eu comparo conte�do
			System.out.println("Mesmo conte�do");
		}
		else {
			System.out.println("Conte�dos diferentes");
		}
		
		s2 = "Isidro";
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);

	}
}