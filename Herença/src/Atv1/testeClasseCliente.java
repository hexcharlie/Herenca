package Atv1;

public class testeClasseCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PessoaFisica nome1 = new PessoaFisica("Pedro Pascal","Rua Daddy, 119",48,"pedro@gmail.com","Chile","13547123417");
		PessoaJuridica nome2 = new PessoaJuridica("Oscar Isaac","Rua Daddy, 223",44,"oscar@gmail.com","Guatemala","901273910273");
		
		System.out.println("\nDados do cliente 1: ");
		nome1.mostrarinfo();
		nome1.mostrarCPF();
		System.out.println("\nDados do cliente 2: ");
		nome2.mostrarinfo();
		nome2.mostrarCNPJ();
		
	}

}
