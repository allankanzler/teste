package encapsulamento;


public class NotaFiscal {
	
	private int numero;
	private Data data;

	private Vendedor vendedor;
	private Produto[] produtos;

	public NotaFiscal(int numero, Data data, Vendedor vendedor) {
		produtos = new Produto[3];
		this.numero = numero;
		this.data = data;
		this.vendedor = vendedor;
	}


	public boolean adicionarProdutos(Produto produto){
		if(existeEspacoNoVetor()){			
			if(produtoJaExiste(produto)==false){				
				produtos[lugarVazio()] = produto;
			}
		}
		return false;
		
	}

	
	private int lugarVazio(){
		int lugar = -1;
		for(int i = 0; i<3; i++){
			if(produtos[i]==null){
				lugar = i;
				break;
			}			
		}	
		return lugar;
	}
	
	
	private boolean produtoJaExiste(Produto produto) {
		Produto temporario = null;
		for(int i = 0; i< 3; i++){
			temporario = produtos[i];
			if(temporario!=null)
				if(temporario.getCodigo()==produto.getCodigo())
					return true;
		}
		return false;
	}

	
	private boolean existeEspacoNoVetor() {
		
		for(int i = 0; i< 3; i++){
			if(produtos[i]==null)
				return true;
		}
		return false;
	}

	
	public double somarProdutos(){
		double soma = 0;
		for(int i =0; i< 3;i++)
			if (produtos[i] == null)
				break;
			else
				soma = soma + produtos[i].getPreco();
		
		return soma;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	private int numero;
	private String data;
	
	private Vendedor vendedor; //nome,cpf
	private Produto[] produtos = new Produto[10]; //10 no máximo
	
	
	//construtor
	
	public NotaFiscal(int numero, String data, Vendedor vendedor){
		this.numero = numero;
		this.data = data;
		this.vendedor = vendedor;
	}
	
	//getters and setters
	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}
	
	public int getNumero() {
		return numero;
	}

	public String getData() {
		return data;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}
	

	//metodo adicionar produtos, faz a verificação pelo codigo se o
	//produto já existe. Estre metodo deve retornar um booleano
	
	public boolean adicionarProdutos (Produto produto){
		int i=0;
				
		if(this.existeEspacoNoVetor(produto)){
			if (this.verificarProduto(produto)==false){
				for (i=0;i<10;i++){
					if (produtos[i] ==null){
						produtos[i] = produto;
						return true;
					}						
				}
			}
		}			
		return false;
		
	}
	
	
	private boolean existeEspacoNoVetor(Produto produto){
		
		for (int i=0;i<10;i++){
			if (this.produtos[i]==null)
				return true;
		}
		return false;
	}
		
	private boolean verificarProduto(Produto produto){
		boolean naoRepetido = false;
		String temp;
		
		for (int i=0;i<10;i++){
			
			if (this.produtos[i]==null)
				temp = "0";
			else
				temp = this.produtos[i].getCodigo();
			
			if(temp.equals(produto.getCodigo()) ){
			naoRepetido = true;
			}
		}	
			
		return naoRepetido;
	}
		
	
	//metodo chamado calcularTotal que retorna o valor total da nota
	
	public double calcularValor(){
		double total=0;
		
		for(int i=0;i<10;i++)
			if (this.produtos[i]!=null)
				total += this.produtos[i].getPreco();
			else
				break;
		return total;
	}
	*/

}
