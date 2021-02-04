package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner Entrada = new Scanner (System.in);
		
		System.out.print("Informe a nota: ");
		
		double Nota = Entrada.nextDouble();
		
		if (Nota > 10 || Nota < 0) {
			System.out.println("Nota inválida!");
		} else if (Nota >= 8.1) {
			System.out.println("Conceito A");
			} else if (Nota >= 6.1) {
				System.out.println("Conceito B");
				} else if (Nota >= 4.1) {
					System.out.println("Conceito C");
					} else if (Nota >= 2.1) {
						System.out.println("Conceito D");
						} else {
							System.out.println("Conceito E");			
							}
		
		Entrada.close();
		
	}
}
