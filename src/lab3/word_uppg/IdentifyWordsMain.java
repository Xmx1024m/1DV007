<<<<<<< HEAD:src/lab3/uppg4/IdentifyWordsMain.java
package lab3.uppg4;

import java.util.Scanner;
=======
package lab3.word_uppg;


>>>>>>> fa0fa415fce6842f421a7261647d16a2c2642d18:src/lab3/word_uppg/IdentifyWordsMain.java
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentifyWordsMain {
	
	public static FileReader fr;		// Fillläsare som fileToString använder
	public static String s = "";		// Vart vi sparar allt text från Filläsaren ovan
	
	/*
	 *  Creative.commons.IO har ett väldigt fiffigt och snyggt sätt att göra strängar av filer (FileUtils.fileToString(File f, String s))
	 * som vi tänkte använda här, dock buggade skiten någon fruktansvärt så lösningen nedan är en "ripp-off" av samma funktion.
	 */
	public static String fileToString(File f) throws IOException {
		
		fr = new FileReader(f);
		
		try {
			int c = fr.read();
			/*
			 * fr.read() returnerar en Integer som representerar ett tecken.
			 * Nedan låter vi loopen köras så länge vår int c inte blir -1, alltså då vi nått slutet av filen.
			 * Så länge while-loopen körs, lägger vi till det typkonverterade värdet på c till får String s
			 */
			while (c != -1) {
				c = fr.read();
				s += (char) c;
			}
		} catch (IOException e) {		// Fånga ev. exceptions
			e.printStackTrace();
		}
		
		return s;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		File fil_in = new File("C:\\Users\\Metzzarn\\Documents\\Eclipse\\1DV007\\src\\lab3\\uppg4\\Champagne.txt");		// Fil att läsa från
		File fil_out = new File("C:\\Users\\Metzzarn\\Documents\\Eclipse\\1DV007\\src\\lab3\\uppg4\\ord.txt");			// Fil att skriva till
		FileWriter wr = new FileWriter(fil_out);																// Filskrivare för att skriva till filer
		
		String fil_in_String = fileToString(fil_in);
		
		Pattern p = Pattern.compile("[^-^0-9^.]");		// Pattern för att ta bort siffror och punkter samt "
		
		Matcher m = p.matcher(fil_in_String);
		
		/*
		 * Så länge vår matcher hittar något ord som stämmer överens med vårt pattern ovan skriver den just den gruppen 
		 * till vår fil_out
		 */
		while (m.find()) {
			wr.write(m.group());
		}
		wr.close();			// glöm inte att stänga filen när vi har skrivit klart
	}
}
