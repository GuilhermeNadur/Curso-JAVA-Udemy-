package poo.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

	public class Cliente {

		final String nome;
		final List<Compra> listaCompras = new ArrayList<>();
		
		Cliente(String nome) {
			this.nome = nome;
		}
		
		void adicionarCompra(Compra compra) {
			this.listaCompras.add(compra);
		}
		
		double carrinho() {
			double total = 0;
			for (Compra compra: listaCompras) {
				total += compra.totalCompra();
			}
			return total;
		}
}
