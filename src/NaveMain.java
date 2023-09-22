
public class NaveMain {

		public static void main(String[] args) {
			Apolo11 apolo11 = new Apolo11(39.0, "Hidrog�nio");
			MillenniumFalcon falcon = new MillenniumFalcon(75.0, "Quadranium", 0.5f);
			
			apolo11.setVelocidadeMaxima(42.0);
			falcon.setTipoCombustivel("C�lulas de Energia");
			
			System.out.println("Informa��es da Apolo 11:\n" + apolo11);
			System.out.println("\nInforma��es da Millennium Falcon:\n" + falcon);
			
			apolo11.viajarLua();
			falcon.fazerCorridaKessel();
		}

}
