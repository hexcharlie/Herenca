package Atv1;

public class PessoaJuridica extends classeCliente {
	
	
	private String CNPJ;

	public PessoaJuridica(String nome, String endereco, int idade, String email, String nacionalidade, String cNPJ) {
		super(nome, endereco, idade, email, nacionalidade);
		CNPJ = cNPJ;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	public void mostrarCNPJ() {
		System.out.println("\nPessoa Juridica.\nCPF: "+CNPJ);
		
	}		

}
