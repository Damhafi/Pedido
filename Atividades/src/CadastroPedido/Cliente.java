package CadastroPedido;

public class Cliente{
	private String nome;
    private int codigo2;
        
	public Cliente() {
	}

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

        public int getCodigo2() {
            return codigo2;
        }

        public void setCodigo2(int codigo2) {
            this.codigo2 = codigo2;
        }	
}
