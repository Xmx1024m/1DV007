/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 */
package lab2.uppg2;

import java.util.Scanner;

public class SumMain {
	
	/*
	 * Ber�kningen skall ske enligt f�ljande:
	 * summan 1-till-N ar lika med summan 1-till-(N/2) plus summan (N/2+1)-till-N
	 * n == (n / 2) + ((n / 2) + 1)
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Skriv in ett tal du vill ber�kna summan av (1 + 2 + 3 + ... N): ");
		int val = scan.nextInt();
		
		Sum summa = new Sum(val);
		
		System.out.println(summa.getSum());
		
		
	}
}
