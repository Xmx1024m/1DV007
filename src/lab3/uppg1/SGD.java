/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 * SGD.java
 */
package lab3.uppg1;

public class SGD {
	
	private int A, B, C;
	
	// Instansierar ett SGD objekt med tv� heltal
	public SGD (int a, int b) {
		
		// Om anv�ndaren angivit SGD(a,b) d�r a < b �ndrar vi p� det
		if (b > a) {
			A = b;
			B = a;
		}
		else {
			A = a;
			B = b;
		}
	}
	
	// Utf�r Euklides algoritm
	public void calculate() {
		
		System.out.print("SGD("+A+","+B+") = ");
		
		if (B == 0)
			System.out.print(A);
		else {
			while (B != 0) {
				C = A % B;
				A = B;
				B = C;
			}
			if (A < 0)
				A = A * -1;
			
			System.out.print(A);
		}
	}
}
