package fundamentos.operadores;

public class Aritméticos {

	public static void main(String[] args) {
		
		var X = 8;
		var Y = 3;
		
		System.out.println(X / Y);
		System.out.println(X / (double) Y);
		System.out.println(X / (float) Y);
		
		int Z = 2 + 3 + 5;
		int W = (int) Math.pow(Z, 5); // ou definir a variável como "double"
		
		System.out.println(W);
		
		
		// Desafio Aritmético:
		
		double A = 1 - 5;
		double B = 2 - 7;
		double C = 3 + 2;
		double D = 3 * 2;
		double E = Math.pow(10, 3);
		
		double R = Math.pow((Math.pow((6 * (C)), 2) / D -
					(Math.pow(((A) * (B) / 2), 2))), 3) / E;
		
		System.out.println("O resultado do Desafio Aritmético é: " + (int) R);
		
	}
}
