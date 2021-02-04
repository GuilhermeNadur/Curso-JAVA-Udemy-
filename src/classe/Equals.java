package classe;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Guilherme R Nadur";
		u1.email = "gui.nadur100@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Guilherme R Nadur";
		u2.email = "gui.nadur100@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
	}
}
