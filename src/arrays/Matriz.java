package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);

		System.out.print("Quantos alunos serão adicionados? ");
		int qtdAlunos = Scan.nextInt();
		
		System.out.print("Quantas notas por aluno serão adicionadas? ");
		int qtdNotasPorAluno = Scan.nextInt();
		
		double[][] notasDaTurma = new double [qtdAlunos][qtdNotasPorAluno];
		
		double totalNotas = 0;
		
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("%d° Aluno - informe sua %d° nota: ", (a + 1), (n + 1));
				notasDaTurma[a][n] = Scan.nextDouble();
				totalNotas += notasDaTurma[a][n];
			}
		}
		
		double mediaNotas = totalNotas / (qtdAlunos * qtdNotasPorAluno);
		
		System.out.printf("Média da turma: %.2f", mediaNotas);
		
		// Lendo Arrays com "for", transformando-os em String e apresentando no console
		for (double[] notasDoAluno: notasDaTurma) {
			System.out.println("\n" + Arrays.toString(notasDoAluno));
		}
		
		Scan.close();
		
	}
}
