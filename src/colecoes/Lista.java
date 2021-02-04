package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Guilherme");
		
		lista.add(u1);
		lista.add(new Usuario("Amanda"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Jack"));
		lista.add(new Usuario("Billy"));
		
		System.out.println(lista.get(3)); // Acessando pelo índice
		
		System.out.println("Removido: " + lista.remove(3));
		System.out.println(lista.remove(new Usuario("Manu")));
		
		System.out.println("Jack está na lista? " + lista.contains(new Usuario("Jack")));
		
		for (Usuario u: lista) {
			System.out.println(u.nome);
		}
		
	}
}
