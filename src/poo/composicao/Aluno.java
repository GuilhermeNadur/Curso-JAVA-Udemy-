package poo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nomeDoAluno;
	final List<Curso> cursosDoAluno = new ArrayList<>();
	
	Aluno(String nome) {
		this.nomeDoAluno = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursosDoAluno.add(curso);
		curso.alunosDoCurso.add(this);
	}
	
	Curso obterCursoPorNome(String nome) {
		for (Curso curso: this.cursosDoAluno) {
			if (curso.nomeDoCurso.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	
	public String toString() {
		return nomeDoAluno;
	}
	
}
