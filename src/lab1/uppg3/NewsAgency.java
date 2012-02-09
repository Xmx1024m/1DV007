/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 * NewsAgency.java
 */
package lab1.uppg3;

import java.util.ArrayList;

public class NewsAgency {
	
	private String name = "";
	private ArrayList<NewsPaper> newsArchive = new ArrayList<NewsPaper>();		// Vart vi sparar våra tidningar
	
	// Skapar vår nyhetsbyrå samt ger den ett namn
	public NewsAgency (String n) {
		name = n;
	}
	
	// Lägger till en tidning till våran nyhetsbyrå
	public void addNewspaper (NewsPaper p) {
		newsArchive.add(p);
	}
	
	// Skriver ut vilka tidningar som är reggade med byrån
	public String listNewsPapers () {
		
		String str = "";
		
		for (int i = 0; i < newsArchive.size(); i++) {
			str += newsArchive.get(i).getName() + "\n";
		}
		
		return str;
	}
	
	public void shareNews () {
		// TODO Loopa igenom alla nyheter vi har och dela ut dem till de tidningar som saknar dem
		
		String str = "";
		
		// Sparar alla nyheter samlade
		for (int i = 0; i < newsArchive.size(); i++) {
			str += newsArchive.get(i).getNews(i);
			
			// Tittar om samma nyhet (sekvens av tecken) är lika, om det inte är lika, lägger till nyhet
			if (newsArchive.get(i).getNews(i).toString().compareTo(str) == 0)
				System.out.print("Don't add");
		}
		
	}
}