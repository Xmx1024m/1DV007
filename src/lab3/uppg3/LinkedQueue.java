package lab3.uppg3;

import java.util.Iterator;

/**
 * Implementerar {@link lab3.uppg3.Queue}
 * 
 * @author Simon Metsi & Mathias Andreasen
 */

public class LinkedQueue implements Queue {
	
	private int size = 0;
	private Node head = null;
	private Node tail = null;
	private Object tmp = null;
	
	// Tagen från föreläsningsmaterial
	private class Node { // private inner class
		int value;
		Node next = null;
		
		Node(Object o) { value = (int) o; }
	}

	/**
	 * @return aktuella storleken på den givna kön
	 */
	public int size() { return size; }

	/**
	 * @return Sant om kön är tom
	 */
	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	/**
	 * @param element att lägga till sist i kön
	 */
	public void enqueue(Object element) {
		if (head == null) {
			head = new Node(element);
			tail = head;
		}
		
		else {
			tail.next = new Node(element);
			tail = tail.next;
			
		}
		size++;			// Ökar köns storlek
	}

	/**
	 * Tar bort första elementet i kön
	 * @return elementet som togs bort
	 * @throws QueueException 
	 */
	public Object dequeue() throws QueueException {
		
		if (size > 0) {
			size--;
			tmp = head.value;
			head = head.next;
			return tmp;
		}
		else throw new QueueException("Kön är tom");
	}

	/**
	 * @return första elementet i kön
	 * @throws QueueException 
	 */
	public Object first() throws QueueException {
		if (head != null || size > 0)
			return head.value;
		else throw new QueueException("Kön är tom och det finns inget värde att hämta");
	}

	/**
	 * @return sista elementet i kön
	 * @throws QueueException 
	 */
	public Object last() throws QueueException {
		if (head != null || size > 0)
			return tail.value;
		else throw new QueueException("Kön är tom så det finns inget \"sista\" värde");
	}

	/**
	 * Itererar över den givna kön
	 */
	public Iterator iterator() {
		// TODO Skriv klart iteratorn
		return null;
	}

}
