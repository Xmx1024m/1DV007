/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 * NewsMain.java
 */
package lab1.uppg3;

import java.util.Scanner;

public class NewsMain {

	public static void main(String[] args) {
		// Demonstrerar NewsPaper och NewsAgency
<<<<<<< HEAD

		NewsAgency TT = new NewsAgency("TT");
		NewsPaper dn = new NewsPaper("Dagens Nyheter");
		
		TT.regNewsPaper(dn);

		dn.addNews("Detta �r en str�ng");
		System.out.println(dn.printNews());
=======
		
		NewsAgency tt = new NewsAgency("Tidningar");
		NewsPaper dn = new NewsPaper("Dagens Nyheter");
		NewsPaper ab = new NewsPaper("Aftonbladet");
		
		dn.addNews("DN 1");
		dn.addNews("DN 2");
		
		ab.addNews("AB 3");
		ab.addNews("AB 4");
		ab.addNews("AB 5");
		
		tt.addNewspaper(dn);
		tt.addNewspaper(ab);
		
		tt.shareNews();
		
		System.out.print(tt.listNewsPapers());
		
		System.out.println(ab.printNews());
		
		
>>>>>>> origin/mathias
	}
}
