package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner Entrada = new Scanner (System.in);
		
		System.out.print("Digite o 1° valor: ");
		String S1 = Entrada.nextLine();
		System.out.print("Digite o 2° valor: ");
		String S2 = Entrada.nextLine();
		System.out.print("Digite o sinal do operador: ");
		String Op = Entrada.nextLine();
		
		Double R = "+".equals(Op) ? Double.parseDouble(S1) + Double.parseDouble(S2) : 
				   "-".equals(Op) ? Double.parseDouble(S1) - Double.parseDouble(S2) : 
				   "/".equals(Op) ? Double.parseDouble(S1) / Double.parseDouble(S2) : 
				   "*".equals(Op) ? Double.parseDouble(S1) * Double.parseDouble(S2) : 0;
				
		System.out.println(R);
		Entrada.close();
		
	}
}
