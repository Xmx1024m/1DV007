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
	
	// Tagen fr�n f�rel�sningsmaterial
	private class Node { // private inner class
		int value;
		Node next = null;
		
		Node(Object o) { value = (int) o; }
	}

	/**
	 * @return aktuella storleken p� den givna k�n
	 */
	public int size() { return size; }

	/**
	 * @return Sant om k�n �r tom
	 */
	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	/**
	 * @param element att l�gga till sist i k�n
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
		size++;			// �kar k�ns storlek
	}

	/**
	 * Tar bort f�rsta elementet i k�n
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
		else throw new QueueException("K�n �r tom");
	}

	/**
	 * @return f�rsta elementet i k�n
	 * @throws QueueException 
	 */
	public Object first() throws QueueException {
		if (head != null || size > 0)
			return head.value;
		else throw new QueueException("K�n �r tom och det finns inget v�rde att h�mta");
	}

	/**
	 * @return sista elementet i k�n
	 * @throws QueueException 
	 */
	public Object last() throws QueueException {
		if (head != null || size > 0)
			return tail.value;
		else throw new QueueException("K�n �r tom s� det finns inget \"sista\" v�rde");
	}

	/**
	 * Itererar �ver den givna k�n
	 */
	public Iterator iterator() {
		// TODO Skriv klart iteratorn
		return null;
	}

}
