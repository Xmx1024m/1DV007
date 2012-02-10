/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 * NewsAgency.java
 */
package lab1.uppg3;

import java.util.ArrayList;

public class NewsAgency {
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
			}
		}
	}
}