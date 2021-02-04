package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Amanda");
		listaAprovados.add("Guilherme");
		
		for (String aprovados: listaAprovados) {
			System.out.println(aprovados);
		}
		
		SortedSet<Integer> nums = new TreeSet<>();
		nums.add(1);
		nums.add(200);
		nums.add(10);
		nums.add(15);
		
		for (Integer n: nums) {
			System.out.println(n);
		}
		
	}
}
