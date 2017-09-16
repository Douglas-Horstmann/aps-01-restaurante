
public class Ingrediente {

	private TipoIngrediente Tipo;
	private boolean Opcional;
	
	public Ingrediente(TipoIngrediente tp, boolean opcional){
		this.Tipo = tp;
		this.Opcional = opcional;
		System.out.println("Adicionando ingrediente: " + this.Tipo + " - Opcional: " + this.Opcional);
	}
	
	public void SetTipo(TipoIngrediente tp){
		this.Tipo = tp;
	}
	
	public void SetOpcional(boolean opcional){
		this.Opcional = opcional;
	}
	
}


