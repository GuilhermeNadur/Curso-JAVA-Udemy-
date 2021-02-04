package classe;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> pilha = new ArrayDeque<>();
		
		pilha.add("Livro 1");
		pilha.push("Livro 2");
		pilha.push("Livro 3");
		
		System.out.println(pilha);
		
		System.out.println(pilha.peek());
		System.out.println(pilha.element());
		
		System.out.println(pilha.poll());
		System.out.println(pilha.remove());
		System.out.println(pilha.pop());
		
	}
}
