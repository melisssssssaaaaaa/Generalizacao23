
public class midia {
		private String gravadora;
		private float duracao;
		
		public midia(int codigo, String descricao, String gravadora, float duracao) {
			super(codigo, descricao);
			this.gravadora = gravadora;
			this.duracao = duracao;
		}
		
		@Override
		public String toString() {
			return super.toString() + "\nGravadora: " + gravadora + "\nDura��o: " + duracao + " minutos";
		}
	}
