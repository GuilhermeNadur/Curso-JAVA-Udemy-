package poo.heranca.main;

import poo.heranca.desafio.Carro;
import poo.heranca.desafio.Civic;
import poo.heranca.desafio.Ferrari;

public class MainCarro {

	public static void main(String[] args) {
		
		Carro casual = new Civic();
		Ferrari esportivo = new Ferrari();
		
		casual.acelerar();
		casual.acelerar();
		esportivo.ligarTurbo();
		esportivo.acelerar();
		esportivo.desligarTurbo();
		esportivo.acelerar();
		
		System.out.println("Civic: " + casual.velocidadeAtual + " Km/h");
		System.out.println("Ferrari: " + esportivo.velocidadeAtual + " Km/h\n");
		
		casual.frear();
		casual.frear();
		casual.frear();
		esportivo.frear();
		esportivo.frear();
		esportivo.frear();
		
		System.out.println("Civic: " + casual.velocidadeAtual + " Km/h");
		System.out.println("Ferrari: " + esportivo.velocidadeAtual + " Km/h");
		
	}
}
