
public class Alunos {
	int numero;
	private String nome;
		
		public Alunos(int numero, String nome) {
			this.numero = numero;
			this.nome = nome;
		}

		public int getNumero() {
			return numero;
		}


		@Override
		public String toString() {
			return "Alunos [numero=" + numero + ", nome=" + nome + "]";
		}

		public String getNome() {
			return nome;
		}
		
}
