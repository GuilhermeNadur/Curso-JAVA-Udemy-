package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
		
	String dataFormatada() {
		final String barra = "/";  // Variável LOCAL
		return Integer.toString(dia) + barra +
				Integer.toString(mes) + "/" + 
				 Integer.toString(ano);
	}
	
	// Outra opção de método para "dataFormatada":
	//	String dataFormatada () {
	//		return String.format("%d/%d/%d", dia, mes, ano);
	//  }
	
}
