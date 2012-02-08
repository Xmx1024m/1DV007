/*
 * Författare: Simon Metsi & Mathias Andreasen
 * NewsPaper.java
 */
package lab1.uppg3;

import java.util.ArrayList;
import java.util.Scanner;

public class NewsPaper {
	
	private String name = ""; // namnet på nyhetstidningen
	private ArrayList<String> news = new ArrayList<>();
	private Scanner scan = new Scanner(System.in);
	private NewsAgency rAt;

	// Simpel konstruktor som instansierar ett nytt NewsPaper objekt och ger det ett namn
	public NewsPaper (String n) {
		name = n;
	}
	
	public void reggedAt(NewsAgency n) { // Nyhetsbyrå som tidningen är registrerad på
		rAt = n;
	}
	
	// Lägger till nyheter i vår ArrayList "news"
	public void addNews(String s) {
		news.add(s);
		shareNews();
	}
	
	private void shareNews() { // Dela nyheter hos nyhetsbyrå
		rAt.addNews(news.get(news.size()-1));
	}
	
	// Låter användaren välja vilken nyhet som ska skrivas ut
	public String printNews() {
		
		System.out.print("Just nu finns det " + news.size() + "st nyheter, vilken vill du skriva ut?: ");
		news.toString();
		int val = (scan.nextInt() - 1);
		
		String newsPrint = news.get(val).toString();
		
		return newsPrint;
	}
	
}
