
public class Restaurante {
	
	private Prato[] pratos;
	
	public void MostrarCardapio()
	{
		for(int i=0;i<this.GetPratos().length;i++)
		{
			if(!this.GetPratos()[i].GetNome().isEmpty())
			{
				System.out.println("Nome do prato: " + this.GetPratos()[i].GetNome());
				System.out.println("Preço do prato: " + this.GetPratos()[i].GetPreco());
				System.out.println("Descrição do prato: " + (this.GetPratos()[i].GetDescricao().isEmpty() ? "Sem descrição" : this.GetPratos()[i].GetDescricao()));
			}			
		}
	}
	
	public void SetPratos(Prato[] pratos){
		this.pratos = pratos;
	}
	
	public Prato[] GetPratos(){
		return this.pratos;
	}
	
}
