
public class Prato {
	
	private String nome = "";
	private double preco = 0.0;
	private String descricao = "";
	
	public Prato(String nome, double preco){
		this.SetNome(nome);
		this.SetPreco(preco);
	}
	
	public Prato(String nome, double preco, String descricao){
		this.SetNome(nome);
		this.SetPreco(preco);
		this.SetDescricao(descricao);
	}
	
	private void SetNome(String nome){
		this.nome = nome;
	}
	
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
