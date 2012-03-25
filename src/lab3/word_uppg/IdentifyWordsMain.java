
package lab3.word_uppg;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentifyWordsMain {
	
	public static FileReader fr;		// Filllï¿½sare som fileToString anvï¿½nder
	public static String s = "";		// Vart vi sparar allt text frï¿½n Fillï¿½saren ovan
	
	/*
	 *  Creative.commons.IO har ett vï¿½ldigt fiffigt och snyggt sï¿½tt att gï¿½ra strï¿½ngar av filer (FileUtils.fileToString(File f, String s))
	 * som vi tï¿½nkte anvï¿½nda hï¿½r, dock buggade skiten nï¿½gon fruktansvï¿½rt sï¿½ lï¿½sningen nedan ï¿½r en "ripp-off" av samma funktion.
	 */
	public static String fileToString(File f) throws IOException {
		
		fr = new FileReader(f);
		
		try {
			int c = fr.read();
			/*
			 * fr.read() returnerar en Integer som representerar ett tecken.
			 * Nedan lï¿½ter vi loopen kï¿½ras sï¿½ lï¿½nge vï¿½r int c inte blir -1, alltsï¿½ dï¿½ vi nï¿½tt slutet av filen.
			 * Sï¿½ lï¿½nge while-loopen kï¿½rs, lï¿½gger vi till det typkonverterade vï¿½rdet pï¿½ c till fï¿½r String s
			 */
			while (c != -1) {
				c = fr.read();
				s += (char) c;
			}
		} catch (IOException e) {		// Fï¿½nga ev. exceptions
			e.printStackTrace();
		}
		
		return s;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		File fil_in = new File("C:\\Users\\Metzzarn\\Documents\\Eclipse\\1DV007\\src\\lab3\\word_uppg\\Champagne.txt");		// Fil att läsa från
		File fil_out = new File("C:\\Users\\Metzzarn\\Documents\\Eclipse\\1DV007\\src\\lab3\\word_uppg\\ord.txt");			// Fil att skriva till
		FileWriter wr = new FileWriter(fil_out);																// Filskrivare för att skriva till filer
		
		String fil_in_String = fileToString(fil_in);
		
		Pattern p = Pattern.compile("[^-^0-9^.^,^-]");		// Pattern för att ta bort siffror och punkter samt "
		
		Matcher m = p.matcher(fil_in_String);
		
		/*
		 * Så länge vår matcher hittar något ord som stämmer överens med vårt pattern ovan skriver den just den gruppen 
		 * till vår fil_out
		 */
		while (m.find()) {
			wr.write(m.group());
		}
		wr.close();			// glï¿½m inte att stï¿½nga filen nï¿½r vi har skrivit klart
	}
}
