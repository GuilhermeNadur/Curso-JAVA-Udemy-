package classe;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Guilherme");
		usuarios.put(2, "Amanda");
		usuarios.put(3, "Gustavo");
		usuarios.put(4, "Paulo");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		
		System.out.println(usuarios.keySet()); // retorna os primeiros valores
		System.out.println(usuarios.values()); // retorna os segundos valores
		System.out.println(usuarios.entrySet()); // retorna ambos os valores
		
		System.out.println(usuarios.containsKey(5));
		System.out.println(usuarios.containsValue("José"));
		
		System.out.println(usuarios.get(2));
		System.out.println(usuarios.remove(2, "Afonso"));
		
		for (int a: usuarios.keySet()) {
			System.out.println(a + ".");
		}
		
		for (String a: usuarios.values()) {
			System.out.println(a + ".");
		}
		
		for (Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro);
		}
		
	}
}
