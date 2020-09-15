

public class FabricaDeProdutos {
	
	public Produto fabricarNovo() {
		Produto novo = new Produto(0,"****",0.0);
		return novo;
	}
	
	public Produto clonarProduto(Produto original) {
		Produto novo = new Produto(original.getCodigo(), original.getDescricao(), original.getPreco());
		return novo;
	}

}