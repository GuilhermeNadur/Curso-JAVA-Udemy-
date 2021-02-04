package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		Scanner Leia = new Scanner (System.in);
		
		System.out.print("Escreva seu nome: ");
		String Nome = Leia.nextLine();
		
		System.out.print("Escreva sua idade: ");
		int Idade = Leia.nextInt();
		
		System.out.printf("%s têm %d anos.", Nome, Idade);
		
		Leia.close();
		
	}
}
