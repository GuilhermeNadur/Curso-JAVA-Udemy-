package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		// Tipos Numéricos Inteiros
		byte AnosEmpresa = 23;
		short NumeroVoos = 542;
		int ID = 56789;
		long PontosAcumulados = 3_134_845_223L;
		
		// Tipos Numéricos Reais
		float Salario = 11_445.50F;
		double VendasAcumuladas = 2_991_797_103.50;
		
		// Tipo Booleano
		boolean StatusFerias = false; // or true
		
		// Tipo Caractere
		char Status = 'A';
		
		// Dias de Empresa
		System.out.println(AnosEmpresa * 365);
		
		// Número de Viagens
		System.out.println(NumeroVoos / 2);
		
		// Pontos por Real
		System.out.println(PontosAcumulados / VendasAcumuladas);
		
		System.out.println(ID + ": " + Salario);
		System.out.println("Férias: " + StatusFerias);
		System.out.println("Status: " + Status);
		
	}
}
