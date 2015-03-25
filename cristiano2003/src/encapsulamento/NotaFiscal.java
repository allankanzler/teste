package encapsulamento;


public class NotaFiscal {
	
	private int numero;
	private Data data;

	private Vendedor vendedor;
	private Produto[] produtos;

	public NotaFiscal(int numero, Data data, Vendedor vendedor) {
		produtos = new Produto[10];
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
		for(int i = 0; i<10; i++){
			if(produtos[i]==null){
				lugar = i;
				break;
			}			
		}	
		return lugar;
	}
	
	
	private boolean produtoJaExiste(Produto produto) {
		Produto temporario = null;
		for(int i = 0; i< 10; i++){
			temporario = produtos[i];
			if(temporario!=null)
				if(temporario.getCodigo()==produto.getCodigo())
					return true;
		}
		return false;
	}

	
	private boolean existeEspacoNoVetor() {
		
		for(int i = 0; i< 10; i++){
			if(produtos[i]==null)
				return true;
		}
		return false;
	}

	
	public double somarProdutos(){
		double soma = 0;
		for(int i =0; i< 10;i++)
			if (produtos[i] == null)
				break;
			else
				soma = soma + produtos[i].getPreco();
		
		return soma;
	}
	
}
