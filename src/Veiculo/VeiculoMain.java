package Veiculo;

	public class VeiculoMain {
		public static void main(String[] args) {
		   Caminhao caminhao = new Caminhao();
		   caminhao.setMotor(true);
		   caminhao.setEixos(8);
		
		   Carro carro = new Carro();
		   carro.setMotor(false);
		   carro.setPortas(2);
		
		   Moto moto = new Moto();
		   moto.setMotor(true);
		   moto.setCilindradas(500);
		
		   System.out.println("Informa��es do Caminh�o:\n" + caminhao);
		   System.out.println("\nInforma��es do Carro:\n" + carro);
		   System.out.println("\nInforma��es da Moto:\n" + moto);
		}
}
