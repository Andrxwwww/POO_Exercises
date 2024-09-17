import java.util.ArrayList;
import java.util.function.Predicate;

public class Teste2 {
	public static void main(String[] args) {
		Alunos a  = new Alunos(2,"Arancisco Delgado Oliveira Rodrigues dos Santos");
		Alunos b  = new Alunos(111015,"Brancisco Delgado Oliveira Rodrigues dos Santos");
		Alunos c  = new Alunos(3,"Arancisco Delgado Oliveira Rodrigues dos Santos");
		Alunos d  = new Alunos(111015,"Drancisco Delgado Oliveira Rodrigues dos Santos");
		//Alunos
		Predicate<Alunos> pred = str -> str.getNome().startsWith("A");
		ArrayList<Alunos> alunos = new ArrayList();
		alunos.add(a);
		alunos.add(b);
		alunos.add(c);
		alunos.add(d);
		
		Iterable<Alunos> i =  Filter.select(alunos, pred);
		System.out.println(i);
	
	
		//datas
		Date aa = new Date(24,10,2004);
		Date bb = new Date(24,10,2003);
		Date cc = new Date(24,11,2004);
		Date dd = new Date(24,12,2004);
		
		Predicate<Date> pred2 = v -> v.getMonth() == 10;
		ArrayList<Date> datas = new ArrayList();
		datas.add(aa);
		datas.add(bb);
		datas.add(cc);
		datas.add(dd);
		
		Iterable<Date> j = Filter.select(datas, pred2);
		System.out.println(j);

	
	}
}
