package poo.encapsulamento;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;
	
	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	// Getter
	public String getNome() {
		return nome;
	}
	
	// Setter
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Getter
	public String getSobrenome() {
		return sobrenome;
	}
	
	// Setter
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	// Getter
	public int getIdade() {
		return idade;
	}
	
	// Setter
	public void setIdade(int novaIdade) {
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}

	public String getNomeCompleto() {
		return nome + " " + sobrenome;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome = " + nome + ", sobrenome = " + sobrenome + ", idade = " + idade + "]";
	}

}
