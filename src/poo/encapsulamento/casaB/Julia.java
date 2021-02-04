package poo.encapsulamento.casaB;

import poo.encapsulamento.casaA.Ana;

public class Julia {

	void testeAcessos() {
		
		Ana sogra = new Ana();
		
//		segredo
//		facoDentroDeCasa
//		formaDeFalar
//		todosSabem
		
//		System.out.println(sogra.segredo); // não foi possível acessar atributos "private"
//		System.out.println(sogra.facoDentroDeCasa); // não foi possível acessar atributos "default" (package)
//		System.out.println(sogra.formaDeFalar); // não foi possível acessar atributos "protected"
		System.out.println(sogra.todosSabem);
	}
	
}
