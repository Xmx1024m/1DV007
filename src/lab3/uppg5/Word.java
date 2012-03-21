package lab3.uppg5;


public class Word implements Comparable<Word> {
	private String word;

	public Word(String str) {
		word = str;
	}
	
	/* Override Object methods */
	public int hashCode() { // Skapar ett hash-värde för order.
		int hash = 0;
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			hash += Character.getNumericValue(c);
		}
		return hash;
	}
	
	public boolean equals(Object other) { // Sant om de båda orden är lika.
		if(word.hashCode() == other.hashCode()) {
			return true;
		}
		else { return false; }
	}
	
	public String toString() { //	" returns same string if two word are equals () "
		return word.toString();
	}
	
	/* Implement Comparable */
	public int compareTo(Word w) { //Jämför två ord
		if(word.hashCode() == w.hashCode()) {
			return 1;
		}
		else { return -1; }
	}
}