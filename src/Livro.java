
public class Livro {

		private String autor;
		
		public Livro(int codigo, String descricao, String autor) {
			super(codigo, descricao);
			this.autor = autor;
		}
		
		@Override
		public String toString() {
			return super.toString() + "\nAutor: " + autor;
		}
	}
