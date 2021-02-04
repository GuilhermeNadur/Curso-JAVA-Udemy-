package fundamentos;

public class ComandoPonto {
	
	public static void main(String[] args) {
		
		// Variações e Constantes
		final String Nome = "Guilherme";
		String Saudacao = "Bom dia, galera!";
		
		// Alterar todas as caracteres para MAIÚSCULAS
		Saudacao = Saudacao.toUpperCase();
		System.out.println(Saudacao);
		
		// Substituir caracteres por outras dentro de uma String
		Saudacao = Saudacao.replace("GALERA", Nome.toUpperCase());
		System.out.println(Saudacao);
		
		// Concatenar (Adicionar) mais caracteres dentro de uma String
		Saudacao = Saudacao.concat(" TUDO BEM?");
		System.out.println(Saudacao);
		
	}
}
