
public class Teste {
public static void main(String[]args) {
	CardDeck d1= new CardDeck();
	CardDeck d2= new CardDeck(p->p.getNumero()!=Rank.Dez && p.getNumero()!=Rank.Nove && p.getNumero()!=Rank.Oito);
	//CardDeck<Card> iterable = new MyIterator<>(d2);
	System.out.println("Deck Normal:");
	for(Card c: d1) {
		System.out.println(c);
	}
	System.out.println("Deck Filtrado:");
	for(Card d : d2) {
		System.out.println(d);
	}
	}
}

