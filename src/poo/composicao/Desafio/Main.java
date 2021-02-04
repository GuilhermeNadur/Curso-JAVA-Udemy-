package poo.composicao.Desafio;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Maria");
		Compra compra1 = new Compra();
		cliente1.adicionarCompra(compra1);
		
		compra1.adicionarItem("Bolacha", 3.49, 5);
		compra1.adicionarItem("Leite", 4.99, 10);
		
		System.out.printf("Total Carrinho (%s): R$%.2f\n", cliente1.nome, 
				cliente1.carrinho());
		
		Cliente cliente2 = new Cliente("João");
		Compra compra2 = new Compra();
		cliente2.adicionarCompra(compra2);
		
		compra2.adicionarItem("Pão", 0.59, 7);
		compra2.adicionarItem("Copo", 3.99, 3);
		
		System.out.printf("Total Carrinho (%s): R$%.2f\n", cliente2.nome, 
				compra2.totalCompra());
		
	}
}