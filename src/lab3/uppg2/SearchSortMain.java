/*
 * Författare: Simon Metsi & Mathias Andreasen
 * SearchSortMain.java
 */
package lab3.uppg2;

public class SearchSortMain {
	
	public static void main(String[] args) {
		// TODO Test
		
		Comparable[] tal = new Comparable[5];
		
		tal[0] = 3;
		tal[1] = 9;
		tal[2] = 6;
		tal[3] = 1;
		tal[4] = 2;
		
		SearchSort.selectionSort(tal);
		
		for (Comparable n : tal)
			System.out.print(n);
	}

}
