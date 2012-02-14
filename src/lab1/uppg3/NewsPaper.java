/*
 * Författare: Simon Metsi & Mathias Andreasen
 * NewsPaper.java
 */
package lab1.uppg3;

import java.util.ArrayList;
import java.util.Scanner;

public class NewsPaper {
	
<<<<<<< HEAD
<<<<<<< HEAD
	private String name = ""; // Namnet på tidningen
=======
	private String name = "";				// namnet pÃ¥ nyhetstidningen
>>>>>>> refs/heads/master
	private ArrayList<String> news = new ArrayList<>();
=======
	private String name = "";				// namnet på nyhetstidningen
	private ArrayList<String> news = new ArrayList<String>();
>>>>>>> origin/mathias
	private Scanner scan = new Scanner(System.in);

	// Simpel konstruktor som instansierar ett nytt NewsPaper objekt och ger det ett namn
	public NewsPaper (String n) { name = n; }
	
<<<<<<< HEAD
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
=======
	// LÃ¤gger till nyheter till en nyhetstidning och skickar den till vår nyhetsbyrå
	public void addNews (String s) { news.add(s); }
	
	// Returnerar namnet på nyhetstidningen
	public String getName () { return name; }
	
	// Returnerar alla nyhter en tidning har
	public ArrayList getNews () {
		
		ArrayList<String> allNews = new ArrayList<String>();	// Alla nyheter för en tidning
>>>>>>> origin/mathias
		
		for (int i = 0; i < news.size(); i++) {
			allNews.add(news.get(i));
		}
		
		return allNews;
	}
	
	// Listar hur många nyheter vi har i vår tidning och låter användaren välja vilken som ska visas
	public String printNews () {
		
		System.out.print("Just nu har " + this.name + " " + news.size() + "st nyheter, vilken vill du skriva ut?: ");
		int val = scan.nextInt();
	
		String str = news.get(val-1).toString();
		return str;
	}
}
