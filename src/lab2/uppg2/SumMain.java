/*
 * Författare: Simon Metsi & Mathias Andreasen
 */
package lab2.uppg2;

import java.util.Scanner;

public class SumMain {
	
	/*
	 * Beräkningen skall ske enligt följande:
	 * summan 1-till-N ar lika med summan 1-till-(N/2) plus summan (N/2+1)-till-N
	 * n == (n / 2) + ((n / 2) + 1)
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Skriv in ett tal du vill beräkna summan av (1 + 2 + 3 + ... N): ");
		int val = scan.nextInt();
		
		Sum summa = new Sum(val);
		
		System.out.println(summa.getSum());
		
		
	}
}
