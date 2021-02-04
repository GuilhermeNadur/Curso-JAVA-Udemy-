package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		int A = 97;
		int B = 'a';
		
		System.out.println(A > B);
		System.out.println(A >= B);
		System.out.println(A < B);
		System.out.println(A <= B);
		System.out.println(A != B); // Diferente
		
		double Nota = 7.2;
		boolean Bom_Comportamento = true;
		boolean Media = Nota >= 7;
		boolean Desconto = Bom_Comportamento && Media;
		
		System.out.println("Tem desconto? " + Desconto);
		
	}
}
