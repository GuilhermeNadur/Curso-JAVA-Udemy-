package poo.composicao;

public class Carro {

	final Motor motor;
	
	Carro() {
		this.motor = new Motor(this);
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	void acelerar() {
		if (motor.fatorInjecao < 2.5) {
			motor.fatorInjecao += 0.4;			
		}
	}
	
	void frear() {
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}
	
}
