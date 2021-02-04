package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		String S = "Boa tarde!";
		
		System.out.println(S);
		System.out.println(S.length());
		System.out.println(S.charAt(9));
		System.out.println(S.concat("!!"));
		System.out.println(S + ("!!"));
		System.out.println(S.startsWith("Boa"));
		System.out.println(S.endsWith("tarde!"));
		System.out.println(S.equals("Boa tarde!"));
		System.out.println(S.equalsIgnoreCase("boa tarde!"));
		System.out.println(S.toLowerCase().contains("boa"));
		System.out.println(S.substring(4, 9));
		
		
		var Nome = "Guilherme";
		var Sobrenome = "Rodrigues";
		var Idade = 20;
		var Salario = 800.00;
		
		System.out.printf("Nome: %s %s têm %d anos e recebe R$%.2f.", Nome,
						  Sobrenome, Idade, Salario);
	}
}
