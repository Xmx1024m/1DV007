/*
 * Författare: Simon Metsi & Mathias Andreasen
 * ArrayIntStack.java
 */
package lab2.uppg1;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {
	
	@Override
	public void push(int n) {
		if (size<values.length) { //Om stacken stor nog läggs värdet till direkt annars körs resize först.
			values[size++] = n;
		}
		else {
			resize();
			values[size++] = n;
		}
	}

	@Override
	public int pop() throws CollectionException {
		
		// Så länge storleken på stacken inte är 0 tar kör vi pop()
		if (size != 0) {
			int i = size-1; //Sparar värdet på topelementet
			values[size-1] = 0; //Tar bort topelementet
			size--; //Minskar size
			return i; //Returnerar det sparade topelementet
		}
		
		// Om stackens storlek är 0 fångar vi ett exception
		else throw new CollectionException("Stacken är tom");
	}

	@Override
	public int peek() throws CollectionException {
		
		// Så länge storleken på stacken inte är 0 tar kör vi peek()
		if (size != 0)
			return values[size];
		
		// Om stackens storlek är 0 fångar vi ett exception
		else throw new CollectionException("Stacken är tom");
	}
	
}
