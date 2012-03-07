/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 * PrintJavaMain.java
 */
package lab2.uppg3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PrintJavaMain {
	
	public static void main(String[] args) {
		
		File dir = new File("C:\\Users\\Hero");
		
		if (dir.exists())
			System.out.println("Start: " +dir);
		
		else 
			System.out.println("Hittar inte katalogen: " + dir);
		
		visitSub(dir);

	}
	
	
	private static int depth = 1;
	private static void visitSub (File file) {
		
		if (file.isDirectory()) {
			printDir(file);
			depth++;
			File[] subs = file.listFiles();
			
			for (File f : subs)
				visitSub(f);
			
			depth--;
		}
	}
	
	private static int count = 0;
	private static void printDir (File file) {
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < depth; i++)
			sb.append("---");
		System.out.println((++count) + sb.toString() +">" + file.getName());
	}

}
