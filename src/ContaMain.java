
public class ContaMain {
	
		public static void main(String[] args) {
			ContaSimples contaSimples = new ContaSimples("Banco Ita�", 1234, 55555, 1000.0, 500.0);
			ContaEspecial contaEspecial = new ContaEspecial("Banco Bradesco", 0322, 51521, 2000.0, 30, 1000.0);
			
			contaSimples.deposito(200.0);
			contaSimples.saque(50.0);
			contaEspecial.deposito(300.0);
			contaEspecial.saque(1500.0);
			
			System.out.println("Informa��es da Conta Simples:\n" + contaSimples);
			System.out.println("\nInforma��es da Conta Especial:\n" + contaEspecial);
		}
	
}
