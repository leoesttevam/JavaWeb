package Operacoes;

public class For {
	
	public static void main(String[] args) {
		
		//Estrutura de repeti��o FOR E CONTINUE
		
		for(int numero = 0; numero <= 10; numero++) {
			System.out.println("N�mero atual �: " + numero);
			if(numero == 7) {
				System.out.println("Obaaaa, encontrei o n�mero 7");
				System.out.println("Estou parando de executar...");
				break;
			}
		}
	}
}
