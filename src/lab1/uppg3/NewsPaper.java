/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 * NewsPaper.java
 */
package lab1.uppg3;

import java.util.ArrayList;
import java.util.Scanner;

public class NewsPaper {
	
<<<<<<< HEAD
<<<<<<< HEAD
	private String name = ""; // Namnet p� tidningen
=======
	private String name = "";				// namnet på nyhetstidningen
>>>>>>> refs/heads/master
	private ArrayList<String> news = new ArrayList<>();
=======
	private String name = "";				// namnet p� nyhetstidningen
	private ArrayList<String> news = new ArrayList<String>();
>>>>>>> origin/mathias
	private Scanner scan = new Scanner(System.in);

	// Simpel konstruktor som instansierar ett nytt NewsPaper objekt och ger det ett namn
	public NewsPaper (String n) { name = n; }
	
<<<<<<< HEAD
<<<<<<< HEAD
	// L�gger till nyheter i v�r ArrayList "news"
	public void addNews(String s) {
		news.add(s);
=======
	// Lägger till nyheter i vår ArrayList "news"
	public void addNews(String s) { news.add(s); }
	
	private void shareNews() {
		
>>>>>>> refs/heads/master
	}
	
<<<<<<< HEAD
	// L�ter anv�ndaren v�lja vilken nyhet som ska skrivas ut
=======
	// Låter användaren välja vilken nyhet som ska skrivas ut
>>>>>>> refs/heads/master
	public String printNews() {
		System.out.print("Just nu finns det " + news.size() + "st nyheter, vilken vill du skriva ut?: ");
		news.toString();
		int val = (scan.nextInt() - 1);
=======
	// Lägger till nyheter till en nyhetstidning och skickar den till v�r nyhetsbyr�
	public void addNews (String s) { news.add(s); }
	
	// Returnerar namnet p� nyhetstidningen
	public String getName () { return name; }
	
	// Returnerar alla nyhter en tidning har
	public ArrayList getNews () {
		
		ArrayList<String> allNews = new ArrayList<String>();	// Alla nyheter f�r en tidning
>>>>>>> origin/mathias
		
		for (int i = 0; i < news.size(); i++) {
			allNews.add(news.get(i));
		}
		
		return allNews;
	}
	
	// Listar hur m�nga nyheter vi har i v�r tidning och l�ter anv�ndaren v�lja vilken som ska visas
	public String printNews () {
		
		System.out.print("Just nu har " + this.name + " " + news.size() + "st nyheter, vilken vill du skriva ut?: ");
		int val = scan.nextInt();
	
		String str = news.get(val-1).toString();
		return str;
	}
}
