package Atv1;

public class PessoaFisica extends classeCliente {
	
	private String CPF;

	public PessoaFisica(String nome, String endereco, int idade, String email, String nacionalidade, String cPF) {
		super(nome, endereco, idade, email, nacionalidade);
		CPF = cPF;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public void mostrarCPF() {
		System.out.println("\nPessoa Juridica.\nCPF: "+CPF);
		
	}
	
	

}
