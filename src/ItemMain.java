
public class ItemMain {
	
		public static void main(String[] args) {
			Livro livro = new Livro(1, "Horror C�smico", "Stephen King");
			CD cd = new CD(2, "Oitavo anjo", "Gravadora Racionais", 60.5f, "oitavo anjo, saudades", "509-E");
			VHS vhs = new VHS(3, "Filme Cl�ssico", "Est�dio Universal", 120.0f, "Poderoso Chef�o");
			
			System.out.println("Informa��es do Livro:\n" + livro);
			System.out.println("\nInforma��es do CD:\n" + cd);
			System.out.println("\nInforma��es do VHS:\n" + vhs);
		}
	}
