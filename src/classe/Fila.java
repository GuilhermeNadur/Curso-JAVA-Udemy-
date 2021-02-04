package classe;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.offer("Bia"); // Adiciona se houver espaço na fila ou retorna "false"
		fila.offer("João"); // Adiciona se houver espaço na fila ou retorna "false"
		fila.add("Ana"); // Adiciona se houver espaço na fila ou retorna um erro
		
		System.out.println(fila);
		
		System.out.println(fila.peek()); // retorna "null" caso não houver elementos
		System.out.println(fila.element());	// retorna erro caso não houver elementos	
		
		System.out.println(fila.poll()); // retorna o próxima elemento da fila e o remove
		System.out.println(fila.poll()); // retorna "null" caso esteja vazia
		System.out.println(fila.remove()); // retorna erro caso esteja vazia
		
// 		fila.size();    -> retorna tamanho da fila
//  	fila.isEmpty(); -> retorna "true" se conter algum elemento 
//                           ou "false" se estiver vazia
//  	fila.clear();   -> limpa a fila
		
	}
}
