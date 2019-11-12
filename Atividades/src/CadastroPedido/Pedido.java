package CadastroPedido;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido{
	private String data;
	private Cliente c;
	private int codigo1 = 0;
	private int codigo2 = 0;
	private int codigo3 = 0;
	private ArrayList <Produto> produtos 	= new ArrayList();
    private ArrayList <Cliente> clientes	= new ArrayList();
	private ArrayList <Item> 	itens 		= new ArrayList();        
	
	public Pedido() {
		int opcao = 1;
		while(opcao != 0) {
			opcao = menu();
			switch(opcao) {
			case 1:
				produtos();
				break;
			case 2:
				clientes();
				break;
			case 3:
				pedidos();
				break;
			case 0:
				System.out.println("Até logo!");
			}
		}
	
	int opcao2 = 1;
	
	while(opcao2 != 0) {
		opcao2 = produtos();
		switch(opcao2) {
		case 1:
			inserirprodutos();
                        break;
                case 2:
                        consultarprodutos();
                        break;
                case 3:
                        alterarprodutos();
                        break;
                case 4:
                        removerprodutos();
                        break;
                case 5:
                        menu();
                        break;
	 	}
	}
        
        int opcao3 = 1;
        while (opcao3 != 0){
            opcao3 = clientes();
            switch(opcao3){
                case 1:
                    inserirclientes();
                    break;
                case 2:
                    consultarclientes();
                    break;
                case 3:
                    alterarclientes();
                    break;
                case 4:
                    removerclientes();
                    break;
                case 5:
                    menu();
                    break;                    
            }
        }
    }
	
	public int menu() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Produtos");
		System.out.println("2 - Clientes");
		System.out.println("3 - Pedidos");
		System.out.println("0 - Sair");
		System.out.println();
		int opcao = teclado.nextInt();
		return opcao;
	}
	
	public int produtos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Inserir");
		System.out.println("2 - Consultar");
		System.out.println("3 - Alterar");
		System.out.println("4 - Remover");
		System.out.println("5 - Voltar");
		System.out.println();
		int opcao2 = teclado.nextInt();
		return opcao2;
	}
	
	public void inserirprodutos() {
		// 1- Capturar os dados		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite os dados");
		System.out.println("Nome do produto: ");
		String nome_produto = teclado.nextLine();
		System.out.println("Preçoo unitário: ");
		double precounit = teclado.nextDouble();
		Produto produto = new Item();
		// 2 - Inserir os dados no objeto
		this.codigo1++;
		produto.setNome_produto(nome_produto);
		produto.setPrecounit(precounit);
		produto.setCodigo1(codigo1);
		// 3 - Inserir o objeto na lista
		this.produtos.add(produto);
	}
        
        public void consultarprodutos(){
            System.out.println("--- Consulta ---");
		for(int i = 0; i<this.produtos.size(); i++) {
			System.out.println(this.produtos.get(i));
		}
        }
        
        public void alterarprodutos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("--- Alterar ---");
		System.out.println("Digite qual código do produto deseja alterar");
		int codigo1 = teclado.nextInt();
		teclado.nextLine();
		
		Produto p = new Produto();
		for (int i = 0; i< this.produtos.size(); i++) {
			if(codigo1 == this.produtos.get(i).getCodigo1()) {
				System.out.println("Digite os dados");
				System.out.println("Nome do produto: ");
				String nome_produto = teclado.nextLine();
				System.out.println("Preço unitário: ");
				double precounit = teclado.nextDouble();								
				p.setCodigo1(codigo1);
				p.setNome_produto(nome_produto);
                                p.setPrecounit(precounit);
				this.produtos.set(i, p);
                                
				return;
			}			
		}
		System.out.println("Produto não encontrado!!!");
	}
        
        public void removerprodutos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("--- Remover ---");
		System.out.println("Digite qual código do produto deseja remover");
		int codigo1 = teclado.nextInt();
		for (int i = 0; i<produtos.size(); i++) {
			if(codigo1 == produtos.get(i).getCodigo1()) {
				produtos.remove(i);
				return;
			}
		}
	}
        
	public int clientes() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Inserir");
		System.out.println("2 - Consultar");
		System.out.println("3 - Alterar");
		System.out.println("4 - Remover");
		System.out.println("5 - Voltar");
		System.out.println();
		int opcao3 = teclado.nextInt();
		return opcao3;
	}
        
        public void inserirclientes(){
           // 1- Capturar os dados		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite os dados");
		System.out.println("Nome do cliente: ");
		String nome_cliente = teclado.nextLine();
		
		Cliente c = new Cliente();
		// 2 - Inserir os dados no objeto
		this.codigo2++;
		c.setNome(nome_cliente);
		c.setCodigo2(codigo2);
		// 3 - Inserir o objeto na lista
		this.clientes.add(c);
        }
        
        public void consultarclientes(){
            System.out.println("--- Consulta ---");
		for(int i = 0; i<this.clientes.size(); i++) {
			System.out.println(this.clientes.get(i));
		}
        }
        
        public void alterarclientes(){
            Scanner teclado = new Scanner(System.in);
		System.out.println("--- Alterar ---");
		System.out.println("Digite qual código do cliente deseja alterar");
		int codigo2 = teclado.nextInt();
		teclado.nextLine();
		
		Cliente c = new Cliente();
		for (int i = 0; i< this.clientes.size(); i++) {
			if(codigo1 == this.clientes.get(i).getCodigo2()) {
				System.out.println("Digite os dados");
				System.out.println("Nome do cliente: ");
				String nome_cliente = teclado.nextLine();
				c.setCodigo2(codigo2);
				c.setNome(nome_cliente);;
				this.clientes.set(i, c);
                                
				return;
			}			
		}
		System.out.println("Cliente não encontrado!!!");
        }
        
        public void removerclientes(){
        Scanner teclado = new Scanner(System.in);
		System.out.println("--- Remover ---");
		System.out.println("Digite qual o código do cliente deseja remover");
		int codigo2 = teclado.nextInt();
		for (int i = 0; i<clientes.size(); i++) {
			if(codigo2 == clientes.get(i).getCodigo2()) {
				clientes.remove(i);
				return;
			}
		}
        }
        
	public int pedidos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Escolher Cliente");
		System.out.println("2 - Inserir Item");
		System.out.println("3 - Ver Pedido");
		System.out.println();
		int opcao4 = teclado.nextInt();
		return opcao4;
	}	
	
        public void escolhercliente(){
            
        }
        
        public void inserir_item(){
            
        }
        
        public void ver_pedido(){
            
        }
        
        public void escolher_produto(){
            
        }
        
        public void mostrar_itens(){
            
        }
	
	public Pedido(String data, Cliente c) {
		this.data = data;
		this.c = c;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}
	
}
