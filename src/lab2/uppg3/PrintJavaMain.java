/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 * PrintJavaMain.java
 */
package lab2.uppg3;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;

public class PrintJavaMain {
	
	public static void main(String[] args) throws Exception {
		
		// Katalogen vi vill börja från
		File dir = new File("/home/mathias/workspace/1DV007/src/");
		
		if (!dir.exists())
			throw new Exception("Katalogen finns inte: " + dir.toString());
	
			System.out.println("Start: " +dir);
	
			visitSub(dir);
		
	}
	
	private static int indent = 1;									// Startvärdet för utskriftens indentering
	
	private static void visitSub (File file) {
		
		if (file.isDirectory()) {
			printDir(file);													// Skriver ut katalogen vi är i
			indent++;
			File[] subs = file.listFiles();								// Sparar alla kataloger i en array subs[]
			
			File[] files = file.listFiles();								// Lägger alla filer i den nuvarande katalogen i en array[]
			printFiles(files);
			
			
			for (File f : subs)
				visitSub(f);
			
			indent--;															// Minskar med indenteringen för att visa att vi gått "bakåt" ett steg
		}
		
	}
	
	// Skriver ut alla .java filer som finns inuti katlogen vi befinner oss i, lägger också in indentering
	private static void printFiles(File[] files) {
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < indent; i++)
			sb.append("   ");
		
		// Skriver ut alla filer i vår array = files som innehåller .java filer
		for (File f : files) {
			if (f.getName().endsWith(".java"))
				System.out.println(sb.toString() + f.getName() + " : " + getSize(f));
		}		
	}
	
	// Returnerar filens storlek med två decimalers nogrannhet
	private static String getSize(File files) {
		
		String fmt = "0.##";
		DecimalFormat dc = new DecimalFormat(fmt);
		
		double size =  (double) files.length() / 1024;
		
		String str = dc.format(size) + " KB";
		return str;
		
	}

	private static int count = 0;		// Numrering på raderna
	
	// Skriver ut alla katloger med indentering
	private static void printDir (File file) {
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < indent; i++)
			sb.append("---");
		System.out.println("\n" + (++count) + sb.toString() +">" + file.getName() + "\n");
	}

}
