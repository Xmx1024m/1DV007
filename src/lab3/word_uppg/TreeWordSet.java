package lab3.word_uppg;

import java.util.Iterator;

public class TreeWordSet implements WordSet {
	
	private BinTree root = null;						// roten på vårt binära söktrad
	private int size = 0;								// nuvarande storleken
	private String str = "";							// används i toString()
	
	private class BinTree { // private inner-klass, liknar väldigt mkt noder från HashWordSet.java
		Word value;
		BinTree left = null, right = null;				// våra förgreningar åt höger och vänster
		
		BinTree(Word w) { value = w; }					// hur vi skapar nya ord i trädet
		
		/*
		 * Tittar om ordet är större/mindre än vårt ord value,
		 * och letar sig ner rekursivt till den plats där ordet "w"
		 * ska läggas, efteråt lägger vi till +1 på size
		 */
		void add(Word w) {
			if (w.compareTo(value) < 0) {
				if (left == null) 
					left = new BinTree(w);
				else
					left.add(w); 
			}
			
			else if (w.compareTo(value) > 0) {
				if (right == null)
					right = new BinTree(w);
				else
					right.add(w);
			}
			size++;										// öka storleken
		}
		
		/*
		 * Likt ovanstående metod, fast här slutar vi då vi
		 * kommit fram till ordet vi söker efter
		 */
		boolean containts(Word w) {
			if (w.compareTo(value) < 0) {				// leta i vänster föregrerning
				if (left == null) 
					return false;
				else return left.containts(w);
			}
			else if (w.compareTo(value) > 0) {			// leta i höger förgrerning
				if (right == null) 
					return false;
				else return right.containts(w);	
			}
			return true;								// hittade ordet w
		}
		
		void print() {
			if (left != null)							// vi tittar i vänstra ledet
				left.print();
			
			str += " " + value.toString();
			
			if (right != null)							// vi tittar i högra ledet
				right.print();
			
		}
	}

	@Override
	public Iterator<Word> iterator() {
		return null;
	}
	

	/*
	 * Om trädet är tomt lägger vi till ordet "word"
	 * som root, annars kallar vi den rekursiva metoden add inuti
	 * vår privata klass BinTree
	 */
	public void add(Word word) {
		if (root == null)
			root = new BinTree(word);
		else
			root.add(word);
	}

	// Stort sätt likadan som ovanstående metod
	public boolean contains(Word word) {
		if (root == null) 
			return false;
		else return root.containts(word);
	}

	@Override
	public int size() { return size; }					// returnerar nuvarande storlek
	
	public String toString() {
		root.print();									// anropar den rekursiva metoden i BinTree som
		return str;										// som skriver ut alla värden
	}


}
