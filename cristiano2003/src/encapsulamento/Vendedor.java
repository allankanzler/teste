package encapsulamento;

public class Vendedor {
	
	String nome;
	String cpf;
	
	public Vendedor (String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	

}
