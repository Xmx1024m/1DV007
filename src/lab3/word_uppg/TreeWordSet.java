package lab3.word_uppg;

import java.util.Iterator;

public class TreeWordSet implements WordSet {
	
	private BinTree root = null;						// roten p� v�rt bin�ra s�ktrad
	private int size = 0;								// nuvarande storleken
	private String str = "";							// anv�nds i toString()
	
	private class BinTree { // private inner-klass, liknar v�ldigt mkt noder fr�n HashWordSet.java
		Word value;
		BinTree left = null, right = null;				// v�ra f�rgreningar �t h�ger och v�nster
		
		BinTree(Word w) { value = w; }					// hur vi skapar nya ord i tr�det
		
		/*
		 * Tittar om ordet �r st�rre/mindre �n v�rt ord value,
		 * och letar sig ner rekursivt till den plats d�r ordet "w"
		 * ska l�ggas, efter�t l�gger vi till +1 p� size
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
			size++;										// �ka storleken
		}
		
		/*
		 * Likt ovanst�ende metod, fast h�r slutar vi d� vi
		 * kommit fram till ordet vi s�ker efter
		 */
		boolean containts(Word w) {
			if (w.compareTo(value) < 0) {				// leta i v�nster f�regrerning
				if (left == null) 
					return false;
				else return left.containts(w);
			}
			else if (w.compareTo(value) > 0) {			// leta i h�ger f�rgrerning
				if (right == null) 
					return false;
				else return right.containts(w);	
			}
			return true;								// hittade ordet w
		}
		
		void print() {
			if (left != null)							// vi tittar i v�nstra ledet
				left.print();
			
			str += " " + value.toString();
			
			if (right != null)							// vi tittar i h�gra ledet
				right.print();
			
		}
	}

	@Override
	public Iterator<Word> iterator() {
		return null;
	}
	

	/*
	 * Om tr�det �r tomt l�gger vi till ordet "word"
	 * som root, annars kallar vi den rekursiva metoden add inuti
	 * v�r privata klass BinTree
	 */
	public void add(Word word) {
		if (root == null)
			root = new BinTree(word);
		else
			root.add(word);
	}

	// Stort s�tt likadan som ovanst�ende metod
	public boolean contains(Word word) {
		if (root == null) 
			return false;
		else return root.containts(word);
	}

	@Override
	public int size() { return size; }					// returnerar nuvarande storlek
	
	public String toString() {
		root.print();									// anropar den rekursiva metoden i BinTree som
		return str;										// som skriver ut alla v�rden
	}


}
