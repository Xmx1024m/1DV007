/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 * Queue.java
 */
package lab3.uppg3;

import java.util.Iterator;

/**
 * Interface givit till oss i 1DV007 kursen p� Linn�universitetet, som vid implementation
 * g�r det m�jligt att utf�ra f�ljade operationer p� en k�:
 * <ul>
 * <li>Returnera storlek
 * <li>Titta om k�n �r tom
 * <li>L�gga till element
 * <li>Ta bort element
 * <li>Visa f�rsta elementet
 * <li>Visa sista elementet
 * <li>Iterera �ver elementen i k�n
 * </ul>
 * @author Tobias Gidlund-Andersson 
 * <p><a href="https://plus.google.com/u/0/101832438471877801494/posts">+Tobias</href></p>
 *
 */

public interface Queue {
	
	int size();								// current queue size
	boolean isEmpty();						// true if queue is empty
	void enqueue(Object element); 			// add element at end of queue
	Object dequeue();						// return and remove first element
	Object first();							// return (without removing) first element
	Object last();							// return (without removing) last element
	Iterator iterator();					// element iterator

}
