/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 * SGDMain.java
 */
package lab3.uppg1;

import java.util.Random;

public class SGDMain {
	
	/*	TAGET FRÅN WIKIPEDIA
	 * Algoritmen kan beskrivas på följande sätt:

     * 1. Två heltal a och b, där a > b är givna.
     * 2. Om b = 0 är algoritmen klar och svaret är a.
     * 3. I annat fall beräknas c, resten när man delat a med b.
     * sätt a = b, b = c och börja om från steg 2 igen
	 */
	
	private static int SGD (int a, int b) {
		
		// Om a / b ger en rest på 0 är vi klara och största gemensamma delare är b.
		if ((a % b) == 0)
			return b;
		
		// Annars räknar vi resten c = a % b, och sätter a = b och b = c och börjar om igen
		else 
			return SGD(b, (a % b));
			
	}

	public static void main(String[] args) {
		
		// Räknar ut fem instanser av SGD och ändrar plats på a och b om a < b
		Random rnd = new Random();
		
		for (int i = 0; i <= 5; i++) {
			
			int a = rnd.nextInt(1000) + 1;
			int b = rnd.nextInt(1000) + 1;
			
			if (a < b) {
				
				int A = b;
				int B = a;
				
				a = A;
				b = B;
			}
			
			System.out.println("SGD("+a+","+b+") = " + SGD(a,b));
		}
	}

}
