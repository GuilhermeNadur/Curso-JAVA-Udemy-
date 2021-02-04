package poo.encapsulamento.casaA;

public class Paulo {

	void testeAcessos() {
		
		Ana esposa = new Ana();
		
//		segredo
//		facoDentroDeCasa
//		formaDeFalar
//		todosSabem
		
//		System.out.println(esposa.segredo); // não foi possível acessar atributos "private"
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
	}
	
}
