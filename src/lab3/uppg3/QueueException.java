/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 * QueueException.java
 */
package lab3.uppg3;

/**
 * Exception klass som f�ngar upp otill�tna operationer som anv�ndaren kan g�ra i {@link lab3.uppg3.LinkedQueue}
 * 
 * @param message att visas som felmeddelanden f�r anv�ndaren
 * <br></br>
 * @author Mathias Andreasen 
 *
 */
public class QueueException extends Exception {
	
	public QueueException (String message) { super (message); }

}
