
public class Restaurante {
	
	private Prato[] pratos = new Prato[3];
	
	public void MostrarCardapio()
	{
		for(int i=0;i<pratos.length;i++)
		{
			if(!pratos[i].GetNome().isEmpty())
			{
				System.out.println("Nome do prato: " + pratos[i].GetNome());
				System.out.println("Pre�o do prato: " + pratos[i].GetPreco());
				System.out.println("Descri��o do prato: " + (pratos[i].GetDescricao().isEmpty() ? "Sem descri��o" : pratos[i].GetDescricao()));
			}			
		}
	}
	
}
