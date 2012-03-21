/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 * SearchSortMain.java
 */
package lab3.uppg2;

public class SearchSortMain {
	
	public static void main(String[] args) {
		// Demostrerar v�r SearSort-klass
		
		Comparable[] tal = new Comparable[5];
		
		// Lista att sortera
		tal[0] = 3;
		tal[1] = 9;
		tal[2] = 6;
		tal[3] = 1;
		tal[4] = 2;
		
		// F�ljande tv� IF-satser kommer aldrig visas d� listan ej �nnu �r sorterad
		if (SearchSort.isSorted(tal))
			System.out.println("Kommer inte visas, listan �r inte sorterad");
		
		if (SearchSort.binarySearch(tal, 6))
			System.out.println("Kommer inte visas, listan �r inte sorterad");
		
		// Fancy utskrivning
		for (Comparable n : tal)
			System.out.print(n);
		
		System.out.print(" --> ");
		
		SearchSort.selectionSort(tal);	// H�r sorteras listan
		
		for (Comparable n : tal)
			System.out.print(n);
		
		// F�ljande tv� IF-satser kommer visas, f�r nu �r listan sorterad
		if (SearchSort.isSorted(tal))
			System.out.println("\nListan �r nu sorterad fr�n minst -> h�gst");
		
		if (SearchSort.binarySearch(tal, 6))
			System.out.println("Talet 6 finns i listan");
	}

}
