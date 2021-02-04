package classe;

public class ValorNull {

	public static void main(String[] args) {
		
		String A = "";
		
		System.out.println(A.concat("!"));
		
		Data D = Math.random() > 0.5 ? new Data() : null;
		
		if (D != null) {  // Usando "if" para verificar se o objeto é nulo
			D.mes = 3;
			System.out.println(D.dataFormatada());
		}
		
		String B = Math.random() > 0.5 ? "OPA" : null;
		
		if (B != null) {
			System.out.println(B.concat(" RAPAZIADA!"));
		}
		
	}
}
