/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 * NewsAgency.java
 */
package lab1.uppg3;

import java.util.ArrayList;

public class NewsAgency {
<<<<<<< HEAD
	private String name = ""; // Namnet p� nyhetsbyr�n
	private ArrayList<String> news = new ArrayList<>(); // Nyheter hos nyhetsbyr�n
	private ArrayList<NewsPaper> papers = new ArrayList<>(); // Registrerade tidningar
	
	public NewsAgency(String n) { // Namn p� nyhetsbyr�n
		name = n;
	}
	
	public void regNewsPaper(NewsPaper n) { // Registrera en tidning
		papers.add(n);
	}
	
	public void addNews(String s) {
		news.add(s);
	}
	
	private void shareNews() { // Dela nyheter med registrerade tidningar
		for (int i=0; i<papers.size(); i++) {
			for (int j=0; j<news.size(); j++) {
				papers.get(i).addNews(news.get(j));
=======
	
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
		
		for (int i = 0; i < (newsArchive.size()); i++) {
			sNews.addAll(newsArchive.get(i).getNews());
		}
		
		// Sparar varje nyhet i en sträng och tittar om den strängen inte finns i en viss tidning, och lägger till den 
		for (int j = 0; j < newsArchive.size(); j++) {
			for (int k = 0; k < sNews.size(); k++) {
				String str = sNews.get(k);
				
				if (!newsArchive.get(j).getNews().contains(str))
					newsArchive.get(j).addNews(str);
>>>>>>> origin/mathias
			}
		}
	}
}