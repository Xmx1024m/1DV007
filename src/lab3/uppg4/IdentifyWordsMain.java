package lab3.uppg4;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentifyWordsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Pattern f�r att ta bort siffror och punkter samt "-"
		Pattern p = Pattern.compile("[^-^0-9^.]");
		
		String input = "Vi drack 72 liter";
		
		Scanner sc = new Scanner(input);
		Matcher m = p.matcher(input);
		String s = "";
		
		for (int i = 0; i < input.length(); i++) {
			if (m.find())
				s += m.group();
		}
		
		System.out.println(s);
			
	}

}
	
	public static FileReader fr;		// Filll�sare som fileToString anv�nder
	public static String s = "";		// Vart vi sparar allt text fr�n Fill�saren ovan
	
	/*
	 *  Creative.commons.IO har ett v�ldigt fiffigt och snyggt s�tt att g�ra str�ngar av filer (FileUtils.fileToString(File f, String s))
	 * som vi t�nkte anv�nda h�r, dock buggade skiten n�gon fruktansv�rt s� l�sningen nedan �r en "ripp-off" av samma funktion.
	 */
	public static String fileToString(File f) throws IOException {
		
		fr = new FileReader(f);
		
		try {
			int c = fr.read();
			/*
			 * fr.read() returnerar en Integer som representerar ett tecken.
			 * Nedan l�ter vi loopen k�ras s� l�nge v�r int c inte blir -1, allts� d� vi n�tt slutet av filen.
			 * S� l�nge while-loopen k�rs, l�gger vi till det typkonverterade v�rdet p� c till f�r String s
			 */
			while (c != -1) {
				c = fr.read();
				s += (char) c;
			}
		} catch (IOException e) {		// F�nga ev. exceptions
			e.printStackTrace();
		}
		
		return s;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		File fil_in = new File("C:\\Users\\Mathias\\workspace\\1DV007\\src\\lab3\\uppg4\\Champagne.txt");		// Fil att l�sa fr�n
		File fil_out = new File("C:\\Users\\Mathias\\workspace\\1DV007\\src\\lab3\\uppg4\\ord.txt");			// Fil att skriva till
		FileWriter wr = new FileWriter(fil_out);																// Filskrivare f�r att skriva till filer
		
		String fil_in_String = fileToString(fil_in);
		
		Pattern p = Pattern.compile("[^-^0-9^.]");		// Pattern f�r att ta bort siffror och punkter samt "
		
		Matcher m = p.matcher(fil_in_String);
		
		/*
		 * S� l�nge v�r matcher hittar n�got ord som st�mmer �verens med v�rt pattern ovan skriver den just den gruppen 
		 * till f�r fil_out
		 */
		while (m.find()) {
			wr.write(m.group());
		}
		wr.close();			// gl�m inte att st�nga filen n�r vi har skrivit klart
	}
}
