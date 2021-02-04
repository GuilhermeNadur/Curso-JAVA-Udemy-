package lambdas;

@FunctionalInterface
public interface Calculo {

	double executar(double a , double b);
	
	
	
	//  Apenas mostrando que há possibilidade de criar métodos "default" e "static" 
	//   em uma "@FunctionalInterface"
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muitoLegal";
	}
	
}
