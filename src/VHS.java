
public class VHS {
		private String titulo;
		
		public VHS(int codigo, String descricao, String gravadora, float duracao, String titulo) {
			super(codigo, descricao, gravadora, duracao);
			this.titulo = titulo;
		}

		@Override
		public String toString() {
			return super.toString() + "\nT�tulo: " + titulo;
		}
	}
