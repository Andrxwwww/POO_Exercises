import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        Disciplina a = new Disciplina(1, "POO");
        Disciplina b = new Disciplina(4, "IP");
        Disciplina c = new Disciplina(2, "SO");
        Disciplina d = new Disciplina(8, "BD");
        Disciplina e = new Disciplina(8, "AED");

        List<Disciplina> lista = new ArrayList<Disciplina>();

        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);

        System.out.println(lista);

        //a) ordenar nmr de vagas
        lista.sort(new CompareNmr());
        System.out.println("Lista ordenada por numero: ");
        System.out.println(lista);
        //b) ordenar alfabetica por nome
        lista.sort(new CompareNome());
        System.out.println("Lista ordenada por nome: ");
        System.out.println(lista);
        //c) Ordenar uma lista de disciplinas por ordem decrescente de capacidade e, quando têm a mesma capacidade, ordenar por ordem alfabética.
        lista.sort(new ComparatorDisciplinas());
        System.out.println("Lista ordenada por capacidade, ordem alfabetica: ");
        System.out.println(lista);
    }
}

