/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 * NewsMain.java
 */
package lab1.uppg3;

import java.util.Scanner;

public class NewsMain {

	public static void main(String[] args) {
		// Demonstrerar NewsPaper och NewsAgency
		
		NewsAgency tt = new NewsAgency("Tidningar");
		NewsPaper dn = new NewsPaper("Dagens Nyheter");
		NewsPaper ab = new NewsPaper("Aftonbladet");
		
		dn.addNews("Test 1");
		dn.addNews("Test 2");
		
		ab.addNews("Test 3");
		ab.addNews("Test 4");
		
		tt.addNewspaper(dn);
		tt.addNewspaper(ab);
		
		tt.shareNews();
		
		System.out.print(tt.listNewsPapers());
		
		
		
		
	}
}
