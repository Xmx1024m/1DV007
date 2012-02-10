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
	public NewsAgency (String n) { name = n; }
	
	// Lägger till en tidning till våran nyhetsbyrå
	public void addNewspaper (NewsPaper p) { newsArchive.add(p); }
	
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
		
		ArrayList<String> sNews = new ArrayList<String>();
		
		for (int i = 0; i < newsArchive.size(); i++) {
			sNews.addAll(newsArchive.get(i).getNews());
		}
		
		for (int k = 0; k < sNews.size(); k++) {
			
			if (newsArchive.get(k).getSpecificNews(k) != sNews.get(k))
				newsArchive.get(k).addNews(sNews.get(k));
		}
	}
}