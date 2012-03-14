package lab3.uppg3;

import java.util.Random;

/**
 * Main klass f�r att testa v�ra implementerade metoder i {@link lab3.uppg3.LinkedQueue} 
 * @author Simon Metsi & Mathias Andreasen
 *
 */
public class QueueMain {

	public static void main(String[] args) throws QueueException {
		// TODO Testa v�ra metoder, en i taget
		
		Random rnd = new Random();						// Random f�r att l�gga in slumpm�ssiga tal i k�n
		
		LinkedQueue que = new LinkedQueue();
		
		// size()
		System.out.println("Storleken p� k�n �r: " +que.size());
		
		// isEmpty()
		if(que.isEmpty())
			System.out.println("K�n �r tom");
		
		// enqueue()
		for (int i = 0; i < 5; i++) {
			int element = rnd.nextInt(10);
			System.out.println("L�gger till " + element);
			que.enqueue(element);
		}
		
		System.out.println("Storleken p� k�n efter enqueue() �r: " + que.size());
		
		// dequeue(), exception d� listan nu �r tom
		int k = que.size();
		for (int i = 0; i <= k; i++) {
			try { 
				System.out.println("Elementet " + que.dequeue() + " togs bort och storleken �r nu: " +que.size());
			} catch (QueueException e) {
				e.printStackTrace();
			}
		}
		
		// l�gger till element f�r att demonstrera first()
		que.enqueue(2);
		que.enqueue(5);
		
		// first(), exception d� k�n �r tom
		System.out.println("F�rsta elementet i k�n: " + que.first());
		que.dequeue();
		que.dequeue();
		
		try {
			System.out.println("F�rsta elementet i k�n: " + que.first());
		} catch (QueueException e) {
			e.printStackTrace();
		}
		
		// last(), exception d� k�n �r tom
		try { 
			System.out.println(que.last());
		} catch (QueueException e) {
			e.printStackTrace();
		}
		

	}

}
