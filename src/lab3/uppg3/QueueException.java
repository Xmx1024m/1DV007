/*
 * Författare: Simon Metsi & Mathias Andreasen
 * QueueException.java
 */
package lab3.uppg3;

/**
 * Exception klass som fångar upp otillåtna operationer som användaren kan göra i {@link lab3.uppg3.LinkedQueue}
 * 
 * @param message att visas som felmeddelanden för användaren
 * <br></br>
 * @author Mathias Andreasen 
 *
 */
public class QueueException extends Exception {
	
	public QueueException (String message) { super (message); }

}
