package poo.heranca.desafio;

public interface Luxo {

	void ligarAr();
	void desligarAr();
	
	default int nivelAr() {
		return 1;
	}
	
}
