package encapsulamento;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		if (dia>0 && dia<32)
			this.dia = dia;
		if (mes>0&&mes<13)
			this.mes = mes;
		if (ano >0 && (int) Math.log10(ano) + 1==4)
			this.ano = ano;
		else
			System.out.println("erro no ano");
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia>0 && dia<32)
			this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes>0&&mes<13)
			this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano >0 && (int) Math.log10(ano) + 1==4)
			this.ano = ano;
	}
	
	public String imprimir(){
		String hoje = getDia() +" de "+getMes()+" de "+getAno();
		
		return hoje;
	}

}
