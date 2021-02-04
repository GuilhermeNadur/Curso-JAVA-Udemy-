package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data nascGui = new Data(15, 7, 2000);
		
		Data diaDaMentira = new Data();
		
		diaDaMentira.dia = 1;
		diaDaMentira.mes = 4;
		diaDaMentira.ano = 2020;
		
		System.out.println(nascGui.dataFormatada());
		
		System.out.println(diaDaMentira.dataFormatada());
				
	}
}
