package lambdas;

public class ProgramaPrincipal1 {

	public static void main(String[] args) {
		
		Calculo calc = new Somar();
		System.out.println(calc.executar(5, 5));
		
		calc = new Multiplicar();
		System.out.println(calc.executar(5, 5));
		
	}
}
