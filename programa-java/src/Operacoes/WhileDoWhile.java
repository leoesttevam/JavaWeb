package Operacoes;

public class WhileDoWhile {

	public static void main(String[] args) {
		
		int numero = 0;
		
		//Estrutura de repeti��o while
		while(numero <= 3) { //Verifica e depois executa o c�digo
			System.out.println("O n�mero atual �: " + numero);
			numero++;
		}
		
		int numero2 = 0;
		do {//Primeiro executa e depois verifica
			
			System.out.println("O n�mero atual �: " + numero2);
			numero2++;
		}while(numero2 <= 10);
	}
}
