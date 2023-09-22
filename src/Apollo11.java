

	public class Apolo11 extends NaveEspacial {
		private String tipoCombustivel;
		
		public Apolo11(double velocidadeMaxima, String tipoCombustivel) {
		   super(velocidadeMaxima);
		   this.tipoCombustivel = tipoCombustivel;
		}
		
		public String getTipoCombustivel() {
		   return tipoCombustivel;
		}
		
		public void setTipoCombustivel(String tipoCombustivel) {
		   this.tipoCombustivel = tipoCombustivel;
		}
		
		public void viajarLua() {
		   System.out.println("A nave Apolo 11 est� viajando para a Lua.");
		}
		
		@Override
		public String toString() {
		   return super.toString() + "\nTipo de Combust�vel: " + tipoCombustivel;
		}
	}
