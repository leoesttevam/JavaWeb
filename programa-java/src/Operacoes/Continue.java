package Operacoes;

public class Continue {

	public static void main(String[] args) {
		
		
		//Estrutura de repeti��o FOR e CONTINUE
		for(int numero = 0; numero <= 10; numero++) {
			System.out.println("N�mero atual �: " + numero);
			if(numero == 9 || numero == 3 || numero == 5) {
				System.out.println("Obaaaa, encontrei o n�mero " + numero);
				continue;
			}
			
			System.out.println(" Processando la�o de repeti��o");
		}
	}
}
