import java.util.Comparator;

public class CompareAlunos implements Comparator<Alunos> {
    public int compare(Alunos a, Alunos b) {
        if (a.getAnoNascimento() == b.getAnoNascimento()) {
            if(a.getAnoMatricula() == b.getAnoMatricula()) {
                return String.CASE_INSENSITIVE_ORDER.compare(a.getNome(), b.getNome());
            }else{
                return a.getAnoMatricula()- b.getAnoMatricula();
            }
        } else {
            return a.getAnoNascimento() - b.getAnoNascimento();
        }
    }
}
