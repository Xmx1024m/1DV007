/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
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
					
					// Byter plats p� variablerna
					temp = arr[pos];
					arr[pos] = arr[i];
					arr[i] = temp;
				}
			}
			j++;		// �kar ett steg �t h�ger i listan
			selSort(arr, (pos+1));
		}
	}
	
	static boolean binarySearch (Comparable[] list, Comparable target) {
		
		// K�rs bara om listan �r sorterad
		if (isSorted(list)) {
			
			// k�rs bara en g�ng (ful-hack)
			if (high == 0)
				high = list.length-1;
			
			// r�kna ut mitten_pos
			mid = ((low + high) / 2);
			
			// Om vi har tur �r target p� mitten_pos i listan p� f�rsta f�rs�ket
			// annars k�rs binarySearch() tills vi kommer dit
			if (target.compareTo(list[mid]) == 0)
				return true;
			
			// annars om target �r mindre �n mitten_v�rdet vet vi att target
			// finns till v�nster om mitten_pos
			else if (target.compareTo(list[mid]) < 0) {
				high = mid -1;
				return binarySearch(list, target);
			}
			// annars om target �r st�rre �n mitten_v�rdet vet vi att target
			// finns till h�ger om mitten_pos
			else if (target.compareTo(list[mid]) > 0) {
				low = mid + 1;
				return binarySearch(list, target);
			}
		}
		return false;
	}
	
	static boolean isSorted (Comparable[] list) {
		// Om varje siffra st�r i nummer ordning �r den sorterad
		for (int i = 0; i < list.length-1; i++) {
			if (list[i].compareTo(list[i+1]) > 0)
				return false;
		}
		
		return true;
	}

}
