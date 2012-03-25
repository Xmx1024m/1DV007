package lab3.uppg6;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lab3.uppg4.IdentifyWordsMain;
import lab3.uppg5.Word;

public class WordCountMain {

	public static FileReader fr;		// Fillläsare som fileToString använder
	public static String s = "";		// Vart vi sparar allt text från Filläsaren ovan
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		File read_file = new File("C:\\Users\\Metzzarn\\Documents\\Eclipse\\1DV007\\src\\lab3\\uppg6\\ord.txt");
		String fil_in_String = IdentifyWordsMain.fileToString(read_file);
		
		
		Pattern p = Pattern.compile("[^-^0-9^.]");		// Pattern för att ta bort siffror och punkter samt "
		
		Matcher m = p.matcher(fil_in_String);
		
		while(m.find()) {
			Word word = new Word(m.group());
		}
	}

}
