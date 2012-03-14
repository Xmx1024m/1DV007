/*
 * Författare: Simon Metsi & Mathias Andreasen
 * Queue.java
 */
package lab3.uppg3;

import java.util.Iterator;

/**
 * Interface givit till oss i 1DV007 kursen på Linnéuniversitetet, som vid implementation
 * gör det möjligt att utföra följade operationer på en kö:
 * <ul>
 * <li>Returnera storlek
 * <li>Titta om kön är tom
 * <li>Lägga till element
 * <li>Ta bort element
 * <li>Visa första elementet
 * <li>Visa sista elementet
 * <li>Iterera över elementen i kön
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
