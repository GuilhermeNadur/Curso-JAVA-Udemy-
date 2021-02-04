package controle;

public class For3 {

	public static void main(String[] args) {
		
		// "for" dentro de "for"
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.printf("[%d,%d]", i, j);
			}
			System.out.println();
		}
		
	}
}
