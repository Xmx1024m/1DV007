package lab3.uppg1;

public class linSearch {
	
	private static int min = 0;
	private static int svar;
	
	public static void main (String[] args) {
		
		int[] tal = new int[9];
		
		for (int i = 0; i < tal.length; i++) {
			tal[i] = i;
			System.out.println(tal[i]);
		}
		
		System.out.println("Talet 6 finns på index: " + linSearchA(tal, 6));
		
		System.out.println("20 / 4 : " + IntDiv(20, 4));
	}
	
	private static int linSearchA(int[] a, int n) {
		
		// Om "n" ligger på positionen n i arrayen
		if (a[min] == n) {
			return min;
		}
		
		else {
			min++;
			return linSearchA(a, n);
		}
		
	}
	
	private static int IntDiv(int a, int b) {
		
		// När ska vi sluta
		if (a <= 0) {
			return svar;
		}
		
		// Vad ska vi göra
		else {
			svar++;
			return IntDiv((a-b), b);
		}
		
	}

}
