package fundamentos;

public class Conversões1 {

	public static void main(String[] args) {
		
		// Conversão Explícita (CAST)
		float A = (float) 1.12345678910;
		System.out.println(A);
		
		// Conversão Implícita
		double B = 1;
		System.out.println(B);
		
		// Conversão Explícita (CAST)
		int C = 300;
		byte D = (byte) C;
		System.out.println(D);
		
		// Conversão Explícita (CAST)
		double F = 1;
		int G = (int) F;
		System.out.println(G);
		
		// Conversão int, Integer... -> String
		Integer H = 10000;
		System.out.println(H.toString().length());
		
		int I = 10000;
		System.out.println(Integer.toString(I).length());
		
	}
}
