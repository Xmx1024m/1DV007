/*
 * Författare: Simon Metsi & Mathias Andreasen
 * SearchSort.java
 */
package lab3.uppg2;

public class SearchSort {
	
	private static Comparable temp;
	private static int min = 0, j = 0;
	
	public static void selectionSort (Comparable[] list) {
		selSort(list,0);		// Startar rekursion
	}
	
	private static void selSort(Comparable[] arr, int pos) {
		
		if (pos < arr.length-1) {
			
			for (int i = j; i < arr.length; i++) {
				if (arr[i].compareTo(arr[min]) < 0) {
					
					// Byter plats på variablerna
					temp = arr[pos];
					arr[pos] = arr[i];
					arr[i] = temp;
				}
			}
			j++;		// Ökar ett steg åt höger i listan
			min++;		// Ökar ett steg åt höger i listan
			selSort(arr, (pos+1));
		}
	}
	
	public boolean binarySearch (Comparable[] list, Comparable target) {
		
		
		return false;
	}
	
	public boolean isSorted (Comparable[] list) {
		return true;
	}

}
