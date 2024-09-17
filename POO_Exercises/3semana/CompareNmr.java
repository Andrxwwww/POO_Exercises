import java.util.Comparator;
public class CompareNmr implements Comparator<Disciplina> {
    public int compare(Disciplina a,Disciplina b){
        return b.getVagas()-a.getVagas();
    }

}
