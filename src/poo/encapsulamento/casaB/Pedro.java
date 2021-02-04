package poo.encapsulamento.casaB;

import poo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{

	void testeAcessos() {
		
//		segredo
//		facoDentroDeCasa
//		formaDeFalar
//		todosSabem
		
//		System.out.println(segredo); // não foi possível acessar atributos "private"
//		System.out.println(facoDentroDeCasa); // não foi possível acessar atributos "default" (package)
		System.out.println(formaDeFalar); 
		System.out.println(todosSabem);
	}
	
}
