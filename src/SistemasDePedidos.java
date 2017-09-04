
public class SistemasDePedidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prato prato1 = new Prato("Lasanha", 25.90);
		Prato prato2 = new Prato("Pizza", 45.90);
		Prato prato3 = new Prato("Churrasco", 35.00);		

	    Restaurante restaurante = new Restaurante();
	    restaurante.SetPratos( new Prato[] { prato1, prato2, prato3 });
	    restaurante.MostrarCardapio();		
	}

}
