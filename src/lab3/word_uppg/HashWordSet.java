package lab3.word_uppg;

import java.util.Iterator;

public class HashWordSet implements WordSet {

	private int size = 0;					// nuvarande storleken
	private Node[] buckets = new Node[10];	// fr�n f�rel�sningarna
	
	private class Node { // private inner-klass fr�n f�rel�sn.
		Word value;
		Node next = null;
		
		public Node (Word w) { value = w; }
	}
	
	@Override
	public int size() {										// returnerar nuvarande storlek
		return size;
	}

	@Override
	public Iterator<Word> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Word word) {
		int pos = (word.hashCode() % buckets.length);		// simpel hash-funktion fr�n f�rel�sn-slides
		Node node = buckets[pos];							// f�rsta noden i listan
		
		while (node != null) {								// s�k genom listan
			if (node.value.equals(word))
				return;										// hittade elementet!
			else
				node = node.next;							// n�sta nod i listan
		}
		
		node = new Node(word);								// hittade inte, l�gg till ny node som f�rst
		node.next = buckets[pos];
		size++;												// �ka storleken
		if (size == buckets.length)
			rehash();										// rehash om det beh�vs
	}
	
	/*
	 * Om AntalElement = AntalBuckets m�ste vi �ka storleken
	 * p� antal buckets, detta g�rs via rehash();
	 * Som kopierar alla gamla buckets till en ny array av noder
	 * och �kar storleken p� buckets f�r att sedan l�gga tillbaka
	 * alla gamla v�rden 
	 */
	private void rehash() {
		Node[] tmp = buckets;								// kopiera gamla buckets
		buckets = new Node[2*tmp.length];					// nya tomma buckets med dubbel storlek
		size = 0;		
		
		for (Node n : tmp) {								// s�tt tillbaka gamla v�rden i nya buckets
			if (n == null) continue;						// tom bucket
			while (n != null) {
				add(n.value);								// l�gg till elementen igen
				n = n.next;
			}
		}
	}

	@Override
	public boolean contains(Word word) {
		int pos = (word.hashCode() % buckets.length);		// simpel hashning
		Node n = buckets[pos];
		
		while (n != null) {
			if (n.value.equals(word))
				return true; 								// word l�g i listan
			else
				n = n.next;									// stega fram i listan
		}
		return false;
	}
}
