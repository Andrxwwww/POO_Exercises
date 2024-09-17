import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Aluno {

    private int num; // numero de aluno
    private String nome; // nome do aluno

    public Aluno(int num, String nome){ // cria os dados asssociados ao aluno
        this.num = num;
        this.nome = nome;
    }

    public int getNum(){
        return num;
    }

    public String getNome(){
        return nome;
    }

    public String toString(){
        return num + " " + nome;
    }


    //exercicio 2.2

    public static ArrayList<Aluno> lerAlunos(String filename){

        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                int num = scanner.nextInt(); // le um int no ficheiro
                String nome = scanner.nextLine().trim(); // le uma string no ficheiro e guarda com os respetivos espacos em branco (Trim())
                alunos.add(new Aluno(num, nome));
            }
            scanner.close();
        } catch (FileNotFoundException e) { // se nao encontrar o ficheiro entao
            System.err.println("Erro: ficheiro " + filename + "não encontrado :(");
        }
        return alunos;
    }

    public static void main(String[] args) {
        ArrayList<Aluno> alunos = lerAlunos("Estudantes.txt");
        for (Aluno a : alunos) {
            System.out.println(a.num + " " + a.nome);
        }
    }

}
