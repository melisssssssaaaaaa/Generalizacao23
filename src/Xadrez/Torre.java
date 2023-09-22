package Xadrez;


	public class Torre extends Peca {
		public Torre(int linha, int coluna, boolean cor) {
			super(linha, coluna, cor);
		}
		
		@Override
		public boolean mover(int linhaDestino, int colunaDestino) {
			return false;
		}
	}