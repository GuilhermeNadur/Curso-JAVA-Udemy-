package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		// "Predicate" recebe um parâmetro de qualquer tipo e retorna um valor "boolean"
		Predicate<Integer> isPar = n -> n % 2 == 0 ? true : false;
		Predicate<Integer> isTresNum = n -> n >= 100 && n <= 999;
		
		System.out.println(isPar.and(isTresNum).negate().test(122));
		System.out.println(isPar.or(isTresNum).test(122));
		
	}
}
