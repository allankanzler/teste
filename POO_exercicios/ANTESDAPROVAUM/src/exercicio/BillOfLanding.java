package exercicio;

import java.util.ArrayList;

public class BillOfLanding {

	private int numeroDoBL;
	private String descricao;
	private String agente;
	ArrayList<Container> containerBL = new ArrayList<Container>();
	private Ordenador ordenador;

	public BillOfLanding(int numeroDoBL, String descricao, String agente) {
		super();
		this.numeroDoBL = numeroDoBL;
		this.descricao = descricao;
		this.agente = agente;
		ordenador = new Ordenador();
	}

	//retorna os containers da BL em ordem crescente de lacre.
	public String listarBL() {
		ordenador.ordenarBL(containerBL);
			String msg = "\n" + toString()
				+ "\nLista de containeirs: \r\n"				
				+ containerBL.toString();

		return msg;
	}
	
	public int getNumeroDoBL() {
		return numeroDoBL;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAgente() {
		return agente;
	}

	public void setAgente(String agente) {
		this.agente = agente;
	}

	@Override
	public String toString() {
		return "BillOfKLanding [numeroDoBL=" + numeroDoBL + ", descricao="
				+ descricao + ", agente=" + agente + ", " + "]\r\n";
	}
	
	//Adicionar containers a BL
	public void adicionarContainer(Container container) {
		try{	
			verificarLacre(container);
				containerBL.add(container);
				System.out.println("Container "+container.getLacre()+" adicionado ao BL.");	
		}catch(ContainerJaAdicionadoException e){
			e.printStackTrace();
			
		}
	}
	
	private void verificarLacre(Container container) throws ContainerJaAdicionadoException{
	
		for (Container c : containerBL){
			if (container.lacre.equals(c.lacre)) {	
				throw new ContainerJaAdicionadoException();			
			}
		}
		
	}
}
