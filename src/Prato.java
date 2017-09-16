
public class Prato {
	
	private String nome = "";
	private double preco = 0.0;
	private String descricao = "";
	private Ingrediente[] ingrediente = new Ingrediente[3];
	
	public Prato(String nome, double preco){
		this.nome = nome;
		this.SetPreco(preco);
	}
	
	public Prato(String nome, double preco, String descricao){
		this.nome = nome;
		this.SetPreco(preco);
		this.SetDescricao(descricao);
	}
	
	public void SetIngrediente(Ingrediente ingrediente){
		for(int i=0;i<this.ingrediente.length;i++){
			if(this.ingrediente[i] == null){
				this.ingrediente[i] = ingrediente;
			}
		}
	}
	
	/*
	public Ingrediente[] GetIngrediente(){
		return this.ingrediente;
	}
	*/
	
	public void SetPreco(double preco){
		this.preco = preco;
	}
	
	public void SetDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public String GetNome(){
		return this.nome;
	}
	
	public double GetPreco(){
		return this.preco;
	}
	
	public String GetDescricao(){
		return this.descricao;
	}

}
