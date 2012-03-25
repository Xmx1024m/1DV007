package lab3.word_uppg;

import java.util.Iterator;

public class HashWordSet implements WordSet {

	private int size = 0;					// nuvarande storleken
	private Node[] buckets = new Node[10];	// från föreläsningarna
	
	private class Node { // private inner-klass från föreläsn.
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
		int pos = (word.hashCode() % buckets.length);		// simpel hash-funktion från föreläsn-slides
		Node node = buckets[pos];							// första noden i listan
		
		while (node != null) {								// sök genom listan
			if (node.value.equals(word))
				return;										// hittade elementet!
			else
				node = node.next;							// nästa nod i listan
		}
		
		node = new Node(word);								// hittade inte, lägg till ny node som först
		node.next = buckets[pos];
		size++;												// öka storleken
		if (size == buckets.length)
			rehash();										// rehash om det behövs
	}
	
	/*
	 * Om AntalElement = AntalBuckets måste vi öka storleken
	 * på antal buckets, detta görs via rehash();
	 * Som kopierar alla gamla buckets till en ny array av noder
	 * och ökar storleken på buckets för att sedan lägga tillbaka
	 * alla gamla värden 
	 */
	private void rehash() {
		Node[] tmp = buckets;								// kopiera gamla buckets
		buckets = new Node[2*tmp.length];					// nya tomma buckets med dubbel storlek
		size = 0;		
		
		for (Node n : tmp) {								// sätt tillbaka gamla värden i nya buckets
			if (n == null) continue;						// tom bucket
			while (n != null) {
				add(n.value);								// lägg till elementen igen
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
				return true; 								// word låg i listan
			else
				n = n.next;									// stega fram i listan
		}
		return false;
	}
}
