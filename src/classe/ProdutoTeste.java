package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4199.00);
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.49;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDescontoAd(0.20);
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("A média do carrinho é de: US$%.2f", mediaCarrinho);
		
	}
}
