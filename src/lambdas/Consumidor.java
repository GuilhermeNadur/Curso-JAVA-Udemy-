package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		// "Consumer" recebe um parâmetro de qualquer tipo e não retorna nada
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 1.80, 0);
		
		imprimirNome.accept(p1);
		
		Produto p2 = new Produto("Garfo", 2.00, 0);
		Produto p3 = new Produto("Faca", 2.00, 0);
		Produto p4 = new Produto("Panela", 7.00, 0);
		Produto p5 = new Produto("Tijolo", 3.50, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
		
		
	}
}
