import java.util.Comparator;
public class CompareNome implements Comparator<Disciplina>{
    public int compare(Disciplina a, Disciplina b){
        return String.CASE_INSENSITIVE_ORDER.compare(a.getNome(), b.getNome());
    }

}
