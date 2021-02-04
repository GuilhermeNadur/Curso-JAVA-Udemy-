package lambdas;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		// "Function" recebe um parâmetro de qualquer tipo e retorna qualquer tipo
		Function<Integer, String> parOuImpar1 = a -> { 
			if (a % 2 == 0) {
				return "PAR";
			} else { return "ÍMPAR"; }
		};
		
		Function<Integer, String> parOuImpar2 = n -> n % 2 == 0 ? "PAR" : "ÍMPAR";
		
		Function<String, String> getResultado = valor -> "O resultado é " + valor;
		
		Function<String, String> empolgado = valor -> valor + "! OBAAA!";
		
		String resultadoFinal = parOuImpar1
				.andThen(getResultado)
				.andThen(empolgado)
				.apply(5);
		
		System.out.println(parOuImpar1.apply(5));
		System.out.println(parOuImpar2.apply(6));
		System.out.println(resultadoFinal);
		
	}
}
