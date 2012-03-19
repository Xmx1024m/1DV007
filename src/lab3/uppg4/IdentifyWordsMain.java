package lab3.uppg4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentifyWordsMain {

	/**
	 * Nu ska det funka
	 */
	public static void main(String[] args) {
		
		// Pattern för att ta bort siffror och punkter samt "-"
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