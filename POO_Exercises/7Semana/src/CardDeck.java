import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class CardDeck implements Iterable<Card>{
private ArrayList<Card> molho = new ArrayList();	
	
	public CardDeck(Predicate<Card> p) {
		for(int i = 0; i!=Suit.values().length;i++) {
			for(int j = 0; j!= Rank.values().length;j++) {
			Card c = new Card(Suit.values()[i],Rank.values()[j]);	
			if(p.test(c)) {
				molho .add(c);
			}
			}
		}
	}
	
	public CardDeck() {
		for(int i = 0; i!=Suit.values().length;i++) {
			for(int j = 0; j!= Rank.values().length;j++) {
				molho.add( new Card(Suit.values()[i],Rank.values()[j]));
			}
		}
	}

	@Override
	public Iterator<Card> iterator() {
		return new MyIterator();
	}

	public class MyIterator implements Iterator<Card>{
		 int position = 0;
		 @Override
		 public boolean hasNext() {
			 return position+1<= molho.size();
		 }
		 
		 @Override
		 public Card next() {
			 position ++;
			 return molho.get(position-1);
		 }
		 
	 }
}
