package poo.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	final List<Item> listaItens = new ArrayList<>();
	
	void adicionarItem(String nome, double preco, int qtde) {
		this.listaItens.add(new Item(nome, preco, qtde));
	}
	
	double totalCompra() {
		double total = 0;
		for (Item item: listaItens) {
			total += item.quantidaDeItens * item.produto.precoProduto;
		}
		return total;
	}
	
}
