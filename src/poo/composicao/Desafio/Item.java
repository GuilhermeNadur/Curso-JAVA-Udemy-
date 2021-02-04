package poo.composicao.Desafio;

public class Item {

	int quantidaDeItens;
	final Produto produto;
	
	Item(String nome, double preco, int qtde) {
		this.produto = new Produto(nome, preco);
		this.quantidaDeItens = qtde;
	}
	
}
