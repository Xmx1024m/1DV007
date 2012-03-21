/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 * ExceptionMain.java
 */
package lab2.uppg1;

public class ExceptionMain {

	public static void main(String[] args) {
		// Testar v�r CollectionException klass
		
		// Skapar en lista och fyller den med element
		ArrayIntList list = new ArrayIntList();
		
		for (int i = 0; i < 20; i++) {
			list.add(i);
		}

		// Skriv ut listans element och storlek
		System.out.println("Listans element: " +list);
		System.out.println("Listans storlek: " +list.size +"\n");
		
		// F�rs�ker ta bort ett index som inte finns i v�r array
		try {
			list.remove(30);
		} catch (CollectionException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		// F�rs�ker skriva ut v�rdet p� ett index som inte finns i v�r array
		try {
			System.out.println(list.get(25));
		} catch (CollectionException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		/*try {
			System.out.println(list.indexOf(1));
		} catch (CollectionException e) {
			e.printStackTrace();
		}*/
		
		
		/* ArrayIntStack */
		ArrayIntStack stack = new ArrayIntStack(); // Stacken �r tom
		
		// F�rs�ker kalla pop() p� en tom stack
		try {
			stack.pop();
		} catch (CollectionException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		// F�rs�ker kalla peek() p� en tom stack
		try { 
			stack.peek();
		} catch (CollectionException e) {
			e.printStackTrace();
		}
	}

}
