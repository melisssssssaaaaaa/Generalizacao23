package Xadrez;

	public class Rei extends Peca {
		public Rei(int linha, int coluna, boolean cor) {
			super(linha, coluna, cor);
		}
		
		public boolean mover(int linhaDestino, int colunaDestino) {
			return false;
		}
	}