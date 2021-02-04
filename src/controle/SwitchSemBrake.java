package controle;

public class SwitchSemBrake {

	public static void main(String[] args) {
		
		String Faixa = "branca";
		
		switch (Faixa.toLowerCase()) {
		case "preta":
			System.out.println("DOMINO O GOLPE TAKEUSHI!");
		case "cinza":
			System.out.println("DOMINO O GOLPE NUTSI!");
		case "branca":
			System.out.println("DOMINO O GOLPE JURIK!");
//		default:
//			System.out.println("Valor inválido!");
		}	
		
	}
}
