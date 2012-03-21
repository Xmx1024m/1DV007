/*
 * Författare: Simon Metsi & Mathias Andreasen
 * SearchSort.java
 */
package lab3.uppg2;

public class SearchSort {
	
	private static Comparable temp;
	private static int j = 0, mid = 0, low = 0, high = 0;
	
	public static void selectionSort (Comparable[] list) {
		selSort(list,0);		// Startar rekursion
	}
	
	static void selSort(Comparable[] arr, int pos) {
		
		if (pos < arr.length-1) {
			
			for (int i = j; i < arr.length; i++) {
				if (arr[i].compareTo(arr[j]) < 0) {
					
					// Byter plats på variablerna
					temp = arr[pos];
					arr[pos] = arr[i];
					arr[i] = temp;
				}
			}
			j++;		// Ökar ett steg åt höger i listan
			selSort(arr, (pos+1));
		}
	}
	
	static boolean binarySearch (Comparable[] list, Comparable target) {
		
		// Körs bara om listan är sorterad
		if (isSorted(list)) {
			
			// körs bara en gång (ful-hack)
			if (high == 0)
				high = list.length-1;
			
			// räkna ut mitten_pos
			mid = ((low + high) / 2);
			
			// Om vi har tur är target på mitten_pos i listan på första försöket
			// annars körs binarySearch() tills vi kommer dit
			if (target.compareTo(list[mid]) == 0)
				return true;
			
			// annars om target är mindre än mitten_värdet vet vi att target
			// finns till vänster om mitten_pos
			else if (target.compareTo(list[mid]) < 0) {
				high = mid -1;
				return binarySearch(list, target);
			}
			// annars om target är större än mitten_värdet vet vi att target
			// finns till höger om mitten_pos
			else if (target.compareTo(list[mid]) > 0) {
				low = mid + 1;
				return binarySearch(list, target);
			}
		}
		return false;
	}
	
	static boolean isSorted (Comparable[] list) {
		// Om varje siffra står i nummer ordning är den sorterad
		for (int i = 0; i < list.length-1; i++) {
			if (list[i].compareTo(list[i+1]) > 0)
				return false;
		}
		
		return true;
	}

}
