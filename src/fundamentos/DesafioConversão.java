package fundamentos;

import java.util.Scanner;

public class DesafioConversão {

	public static void main(String[] args) {
		
		Scanner Leia = new Scanner (System.in);
		
		System.out.print("Digite o 1° valor: ");
		String A = Leia.nextLine();
		System.out.print("Digite o 2° valor: ");
		String B = Leia.nextLine();
		System.out.print("Digite o 3° valor: ");
		String C = Leia.nextLine();
		
		Double Media = (Double.parseDouble(A.replace(",", ".")) +
				Double.parseDouble(B.replace(",", ".")) +
				Double.parseDouble(C.replace(",", "."))) / 3;
		
		System.out.printf("A média dos valores é: %.2f.", Media);
		
		Leia.close();
		
	}
}
