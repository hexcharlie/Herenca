package Atv2;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			Vendedor nome1 = new Vendedor("Maria",25,"Vendedor",2000.80,10,"Roupas para dormir",54);
			Gerente nome2 = new Gerente("José",32,"Gerente",50000,25,"Roupas Descoladas",78);
			
			
			System.out.println("\n");
			nome1.mostrarinf();
			nome1.mostrarArea1();
			nome1.aplicarAumento();
			
			System.out.println("\n");
			nome2.mostrarinf();
			nome2.mostrarArea();
			nome2.aplicarAumento();
		
		
	
		
	}

}
