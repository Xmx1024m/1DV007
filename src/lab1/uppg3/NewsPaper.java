/*
 * Författare: Simon Metsi & Mathias Andreasen
 * NewsPaper.java
 */
package lab1.uppg3;

import java.util.ArrayList;
import java.util.Scanner;

public class NewsPaper {
	
	private String name = "";				// namnet på nyhetstidningen
	private ArrayList<String> news = new ArrayList<String>();
	private Scanner scan = new Scanner(System.in);

	// Simpel konstruktor som instansierar ett nytt NewsPaper objekt och ger det ett namn
	public NewsPaper (String n) { name = n; }
	
	// Lägger till nyheter till en nyhetstidning och skickar den till vår nyhetsbyrå
	public void addNews (String s) { news.add(s); }
	
	// Returnerar namnet på nyhetstidningen
	public String getName () { return name; }
	
	// Hämtar en specifik nyhet
	public String getNews (int n) { 
		
		String str = news.get(n).toString();
		return str;
	}
	
	// Listar hur många nyheter vi har i vår tidning och låter användaren välja vilken som ska visas
	public String printNews () {
		
		System.out.print("Just nu har " + this.name + " " + news.size() + "st nyheter, vilken vill du skriva ut?: ");
		int val = scan.nextInt();
	
		String str = news.get(val-1).toString();
		return str;
	}
}
