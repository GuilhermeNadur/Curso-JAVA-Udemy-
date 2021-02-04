package classe;

public class DesafioJantar {

	public static void main(String[] args) {
		
		DesafioPessoa p = new DesafioPessoa("Guilherme", 61);
		
		DesafioComida arroz = new DesafioComida(1);
		
		double pesoInicial = p.peso;
		
		p.comer(arroz);
		
		double pesoFinal = p.peso;
		
		System.out.printf("Peso Inicial: %.2fKg\n", pesoInicial);
		System.out.printf("Peso Final: %.2fKg", pesoFinal);
		
	}
}
