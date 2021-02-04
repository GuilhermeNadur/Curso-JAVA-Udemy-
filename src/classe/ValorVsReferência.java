package classe;

public class ValorVsReferência {

	public static void main(String[] args) {
		
		double A = 5;
		double B = A; // Atribuição por VALOR (Primitivo)
		
		A++;
		B--;
		
		System.out.println(A);
		System.out.println(B);
		
		int E = 5;
		
		alterarPrimitivo(E);
		
		System.out.println(E); // Valores primitivos não sofrem alteração
		
		Data C = new Data(15, 07, 2000);
		Data D = C; // Atribuição por REFERÊNCIA (Objeto)
		
		C.dia = 16;
		D.mes = 10;
		
		System.out.println(C.dataFormatada());
		System.out.println(D.dataFormatada());
		
		voltarDataValorPadrao(C);
		
		System.out.println(C.dataFormatada()); // Objetos sofrem alteração
		System.out.println(D.dataFormatada()); // Objetos sofrem alteração
	}
	
	static void voltarDataValorPadrao(Data A) {
		A.dia = 1;
		A.mes = 1;
		A.ano = 1970;
	}
	
	static void alterarPrimitivo(int A) {
		A++;
	}
}
