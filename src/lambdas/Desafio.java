package lambdas;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		// ETAPA #01
		Function<Produto, Double> precoComDesconto = p1 -> p1.preco * (1 - p1.desconto);
		
		// ETAPA #02
		UnaryOperator<Double> calcImposto = n1 -> n1 >= 2500 ? n1 + (n1 * 0.085) : n1;
		
		// ETAPA #03
		UnaryOperator<Double> calcFrete = n1 -> n1 >= 3000 ? n1 + 100 : n1 + 50;
		
		// ETAPA #04
		UnaryOperator<Double> arredondar = n1 -> {
			DecimalFormat df = new DecimalFormat("#.00");
			return Double.parseDouble(df.format(n1));
		};
		
		// ETAPA #05
		Function<Double, String> formatar = n -> "R$" + n.toString().replace(".", ",");
		
		// FINAL
		String precoFinal = precoComDesconto
				.andThen(calcImposto)
				.andThen(calcFrete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
				
		System.out.println(precoFinal);
		
	}
}
