package Operacoes;

public class Logicos {

	public static void main(String[] args) {
		
		int nota1 = 6;
		int nota2 = 5;
		int nota3 = 6;
		int nota4 = 8;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		//Opra��es L�gicas aninhada: s�o pera��es dentro de opera��es.
		
		if(media >= 5) {
			if(media >= 7) {
				System.out.println("Aluno est� aprovado direto");
			}else {
				System.out.println("Aluno est� em recupera��o");
			}
		}else {
			System.out.println("Aluno reprovado");
		}
		
	}
}
