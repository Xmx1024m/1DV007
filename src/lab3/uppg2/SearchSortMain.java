/*
 * Författare: Simon Metsi & Mathias Andreasen
 * SearchSortMain.java
 */
package lab3.uppg2;

public class SearchSortMain {
	
	public static void main(String[] args) {
		// Demostrerar vår SearSort-klass
		
		Comparable[] tal = new Comparable[5];
		
		// Lista att sortera
		tal[0] = 3;
		tal[1] = 9;
		tal[2] = 6;
		tal[3] = 1;
		tal[4] = 2;
		
		// Följande två IF-satser kommer aldrig visas då listan ej ännu är sorterad
		if (SearchSort.isSorted(tal))
			System.out.println("Kommer inte visas, listan är inte sorterad");
		
		if (SearchSort.binarySearch(tal, 6))
			System.out.println("Kommer inte visas, listan är inte sorterad");
		
		// Fancy utskrivning
		for (Comparable n : tal)
			System.out.print(n);
		
		System.out.print(" --> ");
		
		SearchSort.selectionSort(tal);	// Här sorteras listan
		
		for (Comparable n : tal)
			System.out.print(n);
		
		// Följande två IF-satser kommer visas, för nu är listan sorterad
		if (SearchSort.isSorted(tal))
			System.out.println("\nListan är nu sorterad från minst -> högst");
		
		if (SearchSort.binarySearch(tal, 6))
			System.out.println("Talet 6 finns i listan");
	}

}
