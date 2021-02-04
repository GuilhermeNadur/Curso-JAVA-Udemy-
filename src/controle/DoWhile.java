package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		String A = "";
		
		do {
			System.out.println("Você precisa escrever as palavras mágicas...");
			System.out.print("Você deseja sair? ");
			A = Scan.nextLine();
		} while (!A.equalsIgnoreCase("por favor"));

		System.out.println("Encerrando...");
		
		Scan.close();
		
	}
}
