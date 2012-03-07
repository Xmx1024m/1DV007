/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 * ArrayIntStack.java
 */
package lab2.uppg1;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {
	
	@Override
	public void push(int n) {
		if (size<values.length) { //Om stacken stor nog l�ggs v�rdet till direkt annars k�rs resize f�rst.
			values[size++] = n;
		}
		else {
			resize();
			values[size++] = n;
		}
	}

	@Override
	public int pop() throws CollectionException {
		
		// S� l�nge storleken p� stacken inte �r 0 tar k�r vi pop()
		if (size != 0) {
			int i = size-1; //Sparar v�rdet p� topelementet
			values[size-1] = 0; //Tar bort topelementet
			size--; //Minskar size
			return i; //Returnerar det sparade topelementet
		}
		
		// Om stackens storlek �r 0 f�ngar vi ett exception
		else throw new CollectionException("Stacken �r tom");
	}

	@Override
	public int peek() throws CollectionException {
		
		// S� l�nge storleken p� stacken inte �r 0 tar k�r vi peek()
		if (size != 0)
			return values[size];
		
		// Om stackens storlek �r 0 f�ngar vi ett exception
		else throw new CollectionException("Stacken �r tom");
	}
	
}
