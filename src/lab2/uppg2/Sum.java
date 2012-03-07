/*
 * Författare: Simon Metsi & Mathias Andreasen
 * Sum.java
 */
package lab2.uppg2;

public class Sum {
	
	private int a, b, first, second, summa;
	
	public Sum (int n) {
		
		a = (n / 2);
		b = ((n / 2) + 1);
		
		summa = low(a) + high(b, n);
	}
	
	public int getSum () { return summa; }
	
	public int low(int a) {
		
		if (a == 1)
			first = a;
		else
			first = a + low(a-1);
		
		return first;
	}
	
	public int high(int b, int n) {
		
		if (b == n)
			second = b;
		else
			second = b + high(b+1, n);
		
		return second;
		
	}

}
