package arrays;

import java.util.Arrays;

public class Exercício {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		
		notasAlunoA [0] = 7.4;
		notasAlunoA [1] = 8;
		notasAlunoA [2] = 6.2;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println("Primeira nota: " + notasAlunoA[0]);
		System.out.println("Última nota: " + notasAlunoA[notasAlunoA.length - 1]);
		
		double totalAlunoA = 0;
		
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println("A média do aluno A é de " + totalAlunoA / notasAlunoA.length);
		
		final double notaArmazenada = 8.9;
		double[] notasAlunoB = {8, 9, 10, notaArmazenada, 6.7};
		
		double totalAlunoB = 0;
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println("A média do aluno B é de " + totalAlunoB / notasAlunoB.length);
		
	}
}
