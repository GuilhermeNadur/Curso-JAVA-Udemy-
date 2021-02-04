package poo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	final String nomeDoCurso;
	final List<Aluno> alunosDoCurso = new ArrayList<>();
	
	Curso(String nome) {
		this.nomeDoCurso = nome;
	}
	
	void adicionarAluno(Aluno aluno) {
		this.alunosDoCurso.add(aluno);
		aluno.cursosDoAluno.add(this);
	}
	
}
