package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);

		String C = "";
		
		System.out.print("Informe a nota: ");
		int Nota = Scan.nextInt();
		
		switch (Nota) {
		// Primeira forma de agrupar os "cases":
		case 10:
		case 9:
			C = "A";
			break;
		// Segunda forma de agrupar os "cases":
		case 8: case 7:
			C = "B";
			break;
		case 6: case 5:
			C = "C";
			break;
		case 4: case 3:
			C = "D";
			break;
		case 2: case 1: case 0:
			C = "E";
			break;
		default:
			System.out.println("Valor inválido!");
			C = "não encontrado";
		}
		
		System.out.printf("Conceito: %s", C);
		
		Scan.close();
		
	}
}
