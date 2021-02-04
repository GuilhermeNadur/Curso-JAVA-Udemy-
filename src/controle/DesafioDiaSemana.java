package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner (System.in);
		
		System.out.print("Digite o dia da semana: ");
		
		String Dia = Scanner.next();
		
		if ("domingo".equals(Dia.toLowerCase())) {
			System.out.println("Dia de número 1");
		} else if ("segunda".equals(Dia.toLowerCase())) {
			System.out.println("Dia de número 2");
		} else if ("terça".equals(Dia.toLowerCase())) {
			System.out.println("Dia de número 3");
		} else if ("quarta".equals(Dia.toLowerCase())) {
			System.out.println("Dia de número 4");
		} else if ("quinta".equals(Dia.toLowerCase())) {
			System.out.println("Dia de número 5");
		} else if ("sexta".equals(Dia.toLowerCase())) {
			System.out.println("Dia de número 6");
		} else if ("sábado".equals(Dia.toLowerCase()) || "sabado".equals(Dia.toLowerCase())) {
			System.out.println("Dia de número 7");
		} else {
			System.out.println("Dia inválido!");
		}
		
		System.out.println("Fim!");
		
		Scanner.close();
		
	}
}
