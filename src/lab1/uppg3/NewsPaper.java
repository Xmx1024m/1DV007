/*
 * FÃ¶rfattare: Simon Metsi & Mathias Andreasen
 * NewsPaper.java
 */
package lab1.uppg3;

import java.util.ArrayList;
import java.util.Scanner;

public class NewsPaper {
	
<<<<<<< HEAD
	private String name = ""; // Namnet på tidningen
=======
	private String name = "";				// namnet pÃ¥ nyhetstidningen
>>>>>>> refs/heads/master
	private ArrayList<String> news = new ArrayList<>();
	private Scanner scan = new Scanner(System.in);

	// Simpel konstruktor som instansierar ett nytt NewsPaper objekt och ger det ett namn
	public NewsPaper (String n) {
		name = n;
	}
	
<<<<<<< HEAD
	// Lägger till nyheter i vår ArrayList "news"
	public void addNews(String s) {
		news.add(s);
=======
	// LÃ¤gger till nyheter i vÃ¥r ArrayList "news"
	public void addNews(String s) { news.add(s); }
	
	private void shareNews() {
		
>>>>>>> refs/heads/master
	}
	
<<<<<<< HEAD
	// Låter användaren välja vilken nyhet som ska skrivas ut
=======
	// LÃ¥ter anvÃ¤ndaren vÃ¤lja vilken nyhet som ska skrivas ut
>>>>>>> refs/heads/master
	public String printNews() {
		System.out.print("Just nu finns det " + news.size() + "st nyheter, vilken vill du skriva ut?: ");
		news.toString();
		int val = (scan.nextInt() - 1);
		
		String newsPrint = news.get(val).toString();
		
		return newsPrint;
	}
	
}
