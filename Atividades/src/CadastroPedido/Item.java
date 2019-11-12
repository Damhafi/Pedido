package CadastroPedido;

public class Item extends Produto{
	private int quantidade;
	
	public Item() {
	}	

	public Item(String nome_produto, double precounit, Produto p, int quantidade) {
		super(nome_produto, precounit);
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
