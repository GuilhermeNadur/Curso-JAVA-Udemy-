package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Ana", 7);
			Validar.usuario(aluno);
			Validar.usuario(null);
		} catch (StringVaziaException | NumeroForaIntervaloException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("FIM");
	}
}
