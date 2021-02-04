package classe;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Guilherme"));
		usuarios.add(new Usuario("Amanda"));
		
		boolean resultado = usuarios.contains(new Usuario("Guilherme"));
		System.out.println(resultado);
		
		System.out.println(new Usuario("Guilherme").hashCode());
		System.out.println(new Usuario("Amanda").hashCode());
		System.out.println(new Usuario("Peter").hashCode());	
		
		System.out.println(usuarios);
		
	}
}
