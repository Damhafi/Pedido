package CadastroPedido;

public class Produto {
	private String nome_produto;
	private double precounit;
	private int codigo1;
	
	public Produto() {
		
	}
	
	public Produto(String nome_produto, double precounit) {
		this.nome_produto = nome_produto;
		this.precounit = precounit;
	}

	public String getNome_produto() {
		return nome_produto;
	}
	
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;		
	}	

	public double getPrecounit() {
		return precounit;
	}

	public void setPrecounit(double precounit) {
		this.precounit = precounit;
	}

	public int getCodigo1() {
		return codigo1;
	}

	public void setCodigo1(int codigo1) {
		this.codigo1 = codigo1;
	}
	
}
