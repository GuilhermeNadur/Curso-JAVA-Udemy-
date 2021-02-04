package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1); // int -> Integer
		conjunto.add(1.5); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add('x'); // char -> Charactere
		conjunto.add("String"); // String
		
		System.out.println("Tamanho do Conjunto HashSet: " + conjunto.size());
		
		System.out.println(conjunto.remove("string"));
		System.out.println(conjunto.remove("String"));
		
		System.out.println("Tamanho do Conjunto HashSet: " + conjunto.size());
		
		System.out.println(conjunto.contains("String"));
		
		Set nums = new HashSet();

		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
//		conjunto.addAll(nums); // União entre duas coleções
		System.out.println(conjunto);
		
		conjunto.retainAll(nums); // Reter valores de uma coleção que sejam iguais
								  //   ao de outra coleção
		System.out.println(conjunto);
		
		conjunto.clear(); // Limpar coleção
		System.out.println(conjunto);
		
	}
}
