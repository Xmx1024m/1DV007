package lab3.uppg3;

import java.util.Random;

/**
 * Main klass för att testa våra implementerade metoder i {@link lab3.uppg3.LinkedQueue} 
 * @author Simon Metsi & Mathias Andreasen
 *
 */
public class QueueMain {

	public static void main(String[] args) throws QueueException {
		// TODO Testa våra metoder, en i taget
		
		Random rnd = new Random();						// Random för att lägga in slumpmässiga tal i kön
		
		LinkedQueue que = new LinkedQueue();
		
		// size()
		System.out.println("Storleken på kön är: " +que.size());
		
		// isEmpty()
		if(que.isEmpty())
			System.out.println("Kön är tom");
		
		// enqueue()
		for (int i = 0; i < 5; i++) {
			int element = rnd.nextInt(10);
			System.out.println("Lägger till " + element);
			que.enqueue(element);
		}
		
		System.out.println("Storleken på kön efter enqueue() är: " + que.size());
		
		// dequeue(), exception då listan nu är tom
		int k = que.size();
		for (int i = 0; i <= k; i++) {
			try { 
				System.out.println("Elementet " + que.dequeue() + " togs bort och storleken är nu: " +que.size());
			} catch (QueueException e) {
				e.printStackTrace();
			}
		}
		
		// lägger till element för att demonstrera first()
		que.enqueue(2);
		que.enqueue(5);
		
		// first(), exception då kön är tom
		System.out.println("Första elementet i kön: " + que.first());
		que.dequeue();
		que.dequeue();
		
		try {
			System.out.println("Första elementet i kön: " + que.first());
		} catch (QueueException e) {
			e.printStackTrace();
		}
		
		// last(), exception då kön är tom
		try { 
			System.out.println(que.last());
		} catch (QueueException e) {
			e.printStackTrace();
		}
		

	}

}
