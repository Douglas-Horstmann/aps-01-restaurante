
public enum TipoIngrediente {
	
	CARNE("Carne"),
	LEGUME("Legume"),
	VERDURA("Verdura"),
	TEMPERO("Tempero"),
	ACOMPANHAMENTO("Acompanhamento");
	
	private String descricao;
	
	TipoIngrediente(String descricao){
		this.descricao = descricao;
	}
	
	public String GetDescricao(){
		return this.descricao;
	}
	
}
