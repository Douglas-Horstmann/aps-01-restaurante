import java.util.Scanner;

public class SistemasDePedidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner(System.in);
		
		/* Create all plates */								
		Prato prato1 = new Prato("Lasanha", 25.90);			    		
		Prato prato2 = new Prato("Pizza", 45.90);		
		Prato prato3 = new Prato("Churrasco", 35.00);
		
		/* Display menu options */
		Restaurante restaurante = new Restaurante();
	    restaurante.SetPratos( new Prato[] { prato1, prato2, prato3 });
	    restaurante.MostrarCardapio();	
		
		int qtdPrato = 0;		
		Pedido pedido = new Pedido();
		
		/* Display menu choice  */
		while(true){
			
			/*
			 * System.out.print("Escolha seu prato: ");
			 * String op = e.nextLine();
			 */
			
			String[] opcoes =  new String[4];
			opcoes[0] = "lasanha";
			opcoes[1] = "pizza";
			opcoes[2] = "churrasco";
			opcoes[3] = "sair";
			
			switch(opcoes[qtdPrato].toUpperCase()){
			case "LASANHA":
				pedido.AdicionarPrato(prato1);
				prato1.SetIngrediente(new Ingrediente(TipoIngrediente.CARNE, true));
				prato1.SetIngrediente(new Ingrediente(TipoIngrediente.LEGUME, false));
				prato1.SetIngrediente(new Ingrediente(TipoIngrediente.TEMPERO, false));
				qtdPrato++;
				break;
			case "PIZZA": 
				pedido.AdicionarPrato(prato2);
				prato2.SetIngrediente(new Ingrediente(TipoIngrediente.CARNE, true));
				prato2.SetIngrediente(new Ingrediente(TipoIngrediente.VERDURA, false));
				prato2.SetIngrediente(new Ingrediente(TipoIngrediente.ACOMPANHAMENTO, false));
				qtdPrato++;
				break;
			case "CHURRASCO":
				pedido.AdicionarPrato(prato3);
				prato3.SetIngrediente(new Ingrediente(TipoIngrediente.CARNE, true));
				prato3.SetIngrediente(new Ingrediente(TipoIngrediente.TEMPERO, false));
				prato3.SetIngrediente(new Ingrediente(TipoIngrediente.LEGUME, false));
				qtdPrato++;
				break;
			default:
				System.out.println("");
			}
			
			if(opcoes[qtdPrato].equalsIgnoreCase("SAIR") || qtdPrato > 3)
				break;
			
		}
		
		System.out.println("O valor total é de: " + pedido.GetTotal());
	}
}
