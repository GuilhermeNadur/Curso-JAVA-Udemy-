package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite quantas notas serão inseridas: ");
		int qtdNotas = scan.nextInt();
		System.out.println();
		
		double[] Notas = new double[qtdNotas];
		
		for (int i = 0; i < Notas.length; i++) {
			System.out.print("Digite a " + (i + 1) + "° nota: ");
			Notas[i] = scan.nextDouble();
		}
		
		double totalNotas = 0;
		
		for (double nota: Notas) {
			totalNotas += nota;
		}
		
		System.out.printf("\nMédia: %.2f", totalNotas / Notas.length);
		
		scan.close();
		
	}
}
