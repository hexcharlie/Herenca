package Atv2;

public class Vendedor extends Funcionario {
	
	private String Setor;
	private int ID;
	
		public Vendedor(String nome, int idade, String cargo, double salario, double aumento, String setor, int iD) {
		super(nome, idade, cargo, salario, aumento);
		Setor = setor;
		ID = iD;
	}

		public String getSetor() {
			return Setor;
		}

		public void setSetor(String setor) {
			Setor = setor;
		}

		public int getID() {
			return ID;
		}

		public void setID(int iD) {
			ID = iD;
		}
		public void mostrarArea1() {
			System.out.println("\n O vendedor "+getNome()+" trabaha no setor "+Setor+"\n E sua ID de trabalho é: "+ID);
		}
	

}
