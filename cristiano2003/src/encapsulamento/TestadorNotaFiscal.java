package encapsulamento;

public class TestadorNotaFiscal {

	public static void main (String[]args){
		
		Produto maca = new Produto("001","fruta",1.5);
		Produto pao = new Produto ("002","padaria",0.60);
		Produto cuca = new Produto ("003","padaria",5);
		Produto pera = new Produto ("003", "fruta", 1.20);
		
		
		Data data1 = new Data (15,12,2015);
		data1.setMes(3);
		data1.setDia(25);
		System.out.println(data1.imprimir());
		
		Vendedor allan = new Vendedor("Allan","5555");
		
		NotaFiscal nota1 = new NotaFiscal(1, data1, allan);
		
		nota1.adicionarProdutos(maca);
		
		nota1.adicionarProdutos(pao);
		nota1.adicionarProdutos(maca);
		nota1.adicionarProdutos(cuca);
		nota1.adicionarProdutos(pera);
		
		System.out.println(nota1.somarProdutos());
		
	}
}
