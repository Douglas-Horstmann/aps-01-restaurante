
public class Pedido {
		
	private double totalPreco = 0.0;	
	private Prato[] prato = new Prato[3];
				
	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public void AdicionarPrato(Prato prato){
		
		for(int i=0;i<this.prato.length;i++){
			if(this.prato[i] == null){
				this.prato[i] = prato;
				totalPreco += prato.GetPreco();
				System.out.println("*** Adicionado o prato: " + prato.GetNome() + " ***");
				break;
			}
		}
	}
	
	public double GetTotal(){
		return this.totalPreco;
	}

}
