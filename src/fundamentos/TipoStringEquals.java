package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String S1 = new String ("2");
		
		System.out.println("2" == S1);
		System.out.println("2".equals(S1));
		
		Scanner Leia = new Scanner (System.in);
		
		String S2 = Leia.next();     // Capta as informações retirando os espaços
//		String S2 = Leia.nextLine(); // Capta a linha com espaços
		
		System.out.println("2" == S2.trim());      // .trim() retira todos os espaços
		System.out.println("2".equals(S2.trim())); // .equals() é a maneira correta de
												   //				  comparar Strings.
		Leia.close();
		
	}
}
