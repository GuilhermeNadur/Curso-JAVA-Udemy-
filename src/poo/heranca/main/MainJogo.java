package poo.heranca.main;

import poo.heranca.Direcao;
import poo.heranca.Heroi;
import poo.heranca.Jogador;
import poo.heranca.Monstro;

public class MainJogo {

	public static void main(String[] args) {
		
		Jogador monstro = new Monstro();
		
		Jogador heroi = new Heroi();
		
		heroi.andar(Direcao.NORTE);
		
		System.out.println("Monstro (vida): " + monstro.vida);
		System.out.println("Herói (vida): " + heroi.vida);
		System.out.println();
		System.out.println("Ataque: " + heroi.atacar(monstro));
		System.out.println("Ataque: " + heroi.atacar(monstro));
		System.out.println("Ataque: " + heroi.atacar(monstro));
		System.out.println();
		System.out.println("Monstro (vida): " + monstro.vida);
		System.out.println("Herói (vida): " + heroi.vida);
		
	}
	
}
