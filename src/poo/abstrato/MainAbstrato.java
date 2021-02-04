package poo.abstrato;

public class MainAbstrato {

	public static void main(String[] args) {
		
		Cachorro a = new Cachorro();
		
		a.respirar(); // Herdado de Animal e definido por Animal
		a.mamar();    // Herdado de Mamifero e definido por Mamifero
		a.mover();    // Herdado de Animal e definido por Cachorro
		
	}
}
