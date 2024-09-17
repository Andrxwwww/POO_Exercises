
public enum Rank {
Dois,
Tres,
Quatro,
Cinco,
Seis,
Sete,
Oito,
Nove,
Dez,
Valete,
Dama,
Rei,
Às;

public boolean contains(Rank r) {
	switch(r) {
	case Rei:
		return true;
	case Às:
		return true;
	case Sete:
		return true;
	case Valete:
		return true;
	case Dama:
		return true;
	default: 
		return false;
	}
}
	
public int cardValues(Rank r) {
	switch(r) {
		case Rei:
			return 4;
		case Às:
			return 11;
		case Sete:
			return 10;
		case Valete:
			return 3;
		case Dama:
			return 2;
		default: 
			return 0;
	}
}

Rank getNumero() {
	// TODO Auto-generated method stub
	return null;
}

}
