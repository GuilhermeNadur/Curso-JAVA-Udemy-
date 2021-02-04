package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Heroi wordPath = new Heroi("WordPath", 29, true);
		Heroi gusta = new Heroi("Gusta", 13, true);
		Heroi danBilzerian = new Heroi("DanBilzerian", 19, false);
		
		List<Heroi> herois = Arrays.asList(wordPath, gusta, danBilzerian);
		
		Predicate<Heroi> acessoPortao01 = h -> h.key01 == true;
		Predicate<Heroi> acessoMissoes01 = h -> h.level >= 15;
		Function<Heroi, String> saudacao01 = h -> "Bem vindo, " + h.nome + "!";
		
		herois.stream()
			.filter(acessoPortao01)
			.filter(acessoMissoes01)
			.map(saudacao01)
			.forEach(System.out::println);
		
	}
}
