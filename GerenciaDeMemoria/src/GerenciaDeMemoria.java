
public class GerenciaDeMemoria {
	public static void main(String[] args) {
		
		Produto p1, p2;
		FabricaDeProdutos fabrica = new FabricaDeProdutos();
		
		p1 = fabrica.fabricarNovo();
		p1.setCodigo(1);
		p1.setDescricao("Computador");
		p1.setPreco(1000);
		
		p2 = p1; // eu faço uma cópia?? Não. Neste caso, P2 aponta para a mesma área de memória que P1
		
		System.out.println(p1.getCodigo()+","+p1.getDescricao()+","+p1.getPreco());
		System.out.println(p2.getCodigo()+","+p2.getDescricao()+","+p2.getPreco());
		
		
		System.out.println();
		System.out.println("Alterando o preço via P2");
		p2.setPreco(1500.0);
		
		System.out.println();
		System.out.println(p1.getCodigo()+","+p1.getDescricao()+","+p1.getPreco());
		System.out.println(p2.getCodigo()+","+p2.getDescricao()+","+p2.getPreco());
		
		System.out.println("Mas e se eu quisesse uma cópia de verdade?");
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
		
		if (s1 == s2) {  // aqui eu comparo endereços de memória
			System.out.println("Mesmo Endereço de Memória");
		}
		else {
			System.out.println("Diferentes endereços");
		}
		
		
		if (s1.equals(s2)) {  // aqui sim eu comparo conteúdo
			System.out.println("Mesmo conteúdo");
		}
		else {
			System.out.println("Conteúdos diferentes");
		}
		
		s2 = "Isidro";
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);

	}
}