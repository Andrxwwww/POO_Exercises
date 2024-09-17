import java.util.Comparator;

public class ComparatorDisciplinas implements Comparator<Disciplina>{
    public int compare(Disciplina a, Disciplina b){
        if(a.getVagas() == b.getVagas()){
            return String.CASE_INSENSITIVE_ORDER.compare(a.getNome(), b.getNome());
        }else{
            return b.getVagas()-a.getVagas();
        }
    }
}
