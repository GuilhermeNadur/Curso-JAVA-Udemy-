package lambdas;

import java.util.function.BinaryOperator;

public class ProgramaPrincipal3 {

	public static void main(String[] args) {
		
	// Usando o método "lambda"
	BinaryOperator<Double> calc = (x, y) -> { double a = x + y; return a; };
	
	System.out.println(calc.apply(5.0, 5.0));
	
	// Usando o método "lambda"
	calc = (a, b) -> a * b;
	
	System.out.println(calc.apply(5.0, 5.0));
	
	BinaryOperator<String> calc2 = (x, y) -> { String a = x + y; return a; };
	
	System.out.println(calc2.apply("a", "b"));
	
	// Usando o método "lambda"
	calc = (a, b) -> a * b;
	
	System.out.println(calc2.apply("a", "b"));
	
	}
}
