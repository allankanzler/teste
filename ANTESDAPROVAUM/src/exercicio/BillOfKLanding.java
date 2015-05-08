package exercicio;

import java.util.ArrayList;
import java.util.Collections;

public class BillOfKLanding {

	private int numeroDoBL;
	private String descricao;
	private String agente;
	Container[] containerBL = new Container[10];

	public BillOfKLanding(int numeroDoBL, String descricao, String agente) {
		super();
		this.numeroDoBL = numeroDoBL;
		this.descricao = descricao;
		this.agente = agente;
	}

	//retorna os containers da BL em ordem crescente de lacre.
	public String listarBL() {
		ArrayList<String> lista = ordenarBL();

		String msg = "\nLista de containeirs BL :" + numeroDoBL + "\n"
				+ lista.toString();

		return msg;
	}

	
	//Ordena a BL para impressão de containers em ordem crescente.
	private ArrayList<String> ordenarBL() {
		ArrayList<String> lista = new ArrayList<String>();

		for (int i = 0; i < 10; i++)
			if (containerBL[i] != null) {
				lista.add(containerBL[i].getLacre()+" "+containerBL[i].toString()+"\n");
			} else
				break;

		Collections.sort(lista);

		return lista;
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
				+ descricao + ", agente=" + agente + ", " + "]";
	}

	
	
	//Adicionar containers a BL
	public void adicionarContainer(Container container) {
		for (int i = 0; i < 10; i++)
			if (containerBL[i] != null) {
				if (container.lacre.equals(containerBL[i].lacre)) {
					System.out.println("Container Já Adicionado.");
					break;
				}
			} else {
				containerBL[i] = container;
				System.out.println("Container adicionado ao BL.");
				break;
			}
	}

}
