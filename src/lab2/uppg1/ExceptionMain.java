/*
 * Författare: Simon Metsi & Mathias Andreasen
 * ExceptionMain.java
 */
package lab2.uppg1;

public class ExceptionMain {

	public static void main(String[] args) {
		// Testar vår CollectionException klass
		
		// Skapar en lista och fyller den med element
		ArrayIntList list = new ArrayIntList();
		
		for (int i = 0; i < 20; i++) {
			list.add(i);
		}

		// Skriv ut listans element och storlek
		System.out.println("Listans element: " +list);
		System.out.println("Listans storlek: " +list.size +"\n");
		
		// Försöker ta bort ett index som inte finns i vår array
		try {
			list.remove(30);
		} catch (CollectionException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		// Försöker skriva ut värdet på ett index som inte finns i vår array
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
		ArrayIntStack stack = new ArrayIntStack(); // Stacken är tom
		
		// Försöker kalla pop() på en tom stack
		try {
			stack.pop();
		} catch (CollectionException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		// Försöker kalla peek() på en tom stack
		try { 
			stack.peek();
		} catch (CollectionException e) {
			e.printStackTrace();
		}
	}

}
