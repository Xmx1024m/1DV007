/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 * SGDMain.java
 */
package lab3.uppg1;

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
		
		System.out.println(SGD(7, 2));

	}

}
