
public class Card {
	private static final Card[] cards;
	private Suit naipe;
	private Rank numero;
	static {
		cards = new Card[Suit.values().length * Rank.values().length];
		
		for(int i = 0; i!=Suit.values().length;i++) {
			for(int j = 0; j!= Rank.values().length;j++) {
				cards[i*Rank.values().length+j]= new Card(Suit.values()[i],Rank.values()[j]);
			}
		}
	}
	
	public Card(Suit naipe, Rank numero) {
		this.naipe=naipe;
		this.numero=numero;
	}
	
	public Rank getNumero() {
		return numero;
	}
	
	public Suit getNaipe() {
		return naipe;
	}

	@Override
	public String toString() {
		return "Card [naipe=" + naipe + ", numero=" + numero + "]";
	}
}
