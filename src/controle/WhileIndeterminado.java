package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner (System.in);
		
		String A = "";
		
		while (!A.equalsIgnoreCase("sair")) {
			System.out.print("Digite o comando: ");
			A = Scan.next();
		}
		
		Scan.close();
		
	}
}
