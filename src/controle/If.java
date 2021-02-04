package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner Entrada = new Scanner (System.in);
		
		System.out.print("Informe a média do aluno: ");
		double Media = Entrada.nextDouble();
		
		// NÃO é permitido usar ";" na maioria das estruturas de controle
		if (Media <= 10  && Media >= 7.0) {
			System.out.println("APROVADO");
		}
		
		if (Media <= 6.9 && Media >= 4) {
			System.out.println("EM RECUPERAÇÃO");
		}
		
		boolean CritReprov = Media <= 3.9 && Media >= 0;
		
		if (CritReprov) {
			System.out.println("REPROVADO");
		}
		
		Entrada.close();
		
	}
}
