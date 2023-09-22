package Xadrez;


	public class Bispo extends Peca {
		public Bispo(int linha, int coluna, boolean cor) {
			super(linha, coluna, cor);
		}
		
		public boolean mover(int linhaDestino, int colunaDestino) {
			return false;
		}
	}
