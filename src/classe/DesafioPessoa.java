package classe;

public class DesafioPessoa {

	String nome;
	double peso;
	
	DesafioPessoa() {}
	
	DesafioPessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	double comer(DesafioComida peso) {
		return this.peso += peso.pesoComida;
	}
}
