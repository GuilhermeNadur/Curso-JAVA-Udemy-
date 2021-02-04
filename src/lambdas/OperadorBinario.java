package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		// "BiFunction" recebe dois parâmetros de qualquer tipo e retorna qualquer tipo
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			System.out.printf("Média: %.2f\n", notaFinal);
			return notaFinal >= 7 ? "APROVADO" : "EM RECUPERAÇÃO";
		};
		
		System.out.println(resultado.apply(9.7, 5.1));
		
		// "BinaryOperator" recebe dois parâmetros de qualquer tipo e retorna o mesmo tipo
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		
		System.out.println(media.apply(9.8, 5.7));
		
		Function<Double, String> conceito = m -> m >= 7 ? "APROVADO" : "EM RECUPERAÇÃO";
		
		System.out.println(media.andThen(conceito).apply(9.7, 5.1));
		
	}
}
