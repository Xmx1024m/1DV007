package lab3.word_uppg;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordCountMain {

	public static FileReader fr;		// Filläsare som fileToString använder
	public static String s = "";		// Vart vi sparar allt text från Filläsaren ovan
	private static TreeSet<String> tree = new TreeSet<String>();
	private static Set lehash = new HashSet();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		File read_file = new File("C:\\Users\\Metzzarn\\Documents\\Eclipse\\1DV007\\src\\lab3\\word_uppg\\ord.txt");
		String fil_in_String = IdentifyWordsMain.fileToString(read_file);
		
		StringTokenizer tokenizer = new StringTokenizer(fil_in_String);
		while(tokenizer.hasMoreTokens()) {

			System.out.println(tokenizer.countTokens());
			Word word = new Word(tokenizer.nextToken());
			tree.add(word.toString());
			lehash.add(word);
			
		}
		
		System.out.println("TreeSet: " + "\n");
		Iterator iter = tree.iterator();
		
	    while(iter.hasNext()) {
	    	Object o1 = iter.next();
	    	System.out.println(o1);
	    }
		
		      

		    System.out.println(lehash.size() + " distinct words detected : " + lehash );
		
	}

}
