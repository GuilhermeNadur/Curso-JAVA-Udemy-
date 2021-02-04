package lambdas;

public class ProgramaPrincipal2 {

	public static void main(String[] args) {
		
	// Usando o método "lambda"
	Calculo calc = (x, y) -> { double a = x + y; return a; };
	
	System.out.println(calc.executar(5, 5));
	
	// Usando o método "lambda"
	calc = (a, b) -> a * b;
	
	System.out.println(calc.executar(5, 5));
	
	}
}
