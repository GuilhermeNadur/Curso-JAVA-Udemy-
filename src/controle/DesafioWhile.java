package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);

		double Nota = 0;
		double NotasTotais = 0;
		double C = 0;
		String Decisao = "";
		
		while (!Decisao.equalsIgnoreCase("N")) {
			
			System.out.print("Digite uma nota: ");
			Nota = Scan.nextDouble();
			
			if (Nota >= 0 && Nota <= 10) {
				NotasTotais = NotasTotais + Nota;
				++C;
				System.out.println("Nota adicionada com sucesso!");
			} else {
				System.out.println("Você digitou uma nota inválida!");
			}
			
			System.out.print("Gostaria de adicionar outra nota? [S/N] ");
			Decisao = Scan.next();
			System.out.print("\n");
			
		}

		System.out.println("A média das notas é de: " + NotasTotais / C);
		
		Scan.close();
		
	}
	
}
