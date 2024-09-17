import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Iterator;

public class Filter {
	
	
	static <T> Iterable<T> select(Iterable<T> iterable, Predicate<T> pred){
		ArrayList<T> alunos = new ArrayList();
		for (T a : iterable) {
			if(pred.test(a)) {
				alunos.add(a);
			}
		}
		return alunos;
	}
	
	
	
	
	

	@Override
	public String toString() {
		return "Filter []";
	}
	
	
	
}
