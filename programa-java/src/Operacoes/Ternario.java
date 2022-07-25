package Operacoes;

public class Ternario {

	public static void main(String[] args) {
		
		int nota1 = 10;
		int nota2 = 8;
		int nota3 = 6;
		int nota4 = 6;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		//Condi��es l�gica com IF e ELSE.
		if(media >= 7) {
			System.out.println("Aluno Aprovado: " + media);
		} else if(media >= 5 && media <= 6) {
			System.out.println("Aluno em recupera��o: " + media);
		}else {
			System.out.println("Aluno reprovado: " + media);
		}
		
		//Operador tern�rio s�o para micro valida��es.
		String resultado;
		
		resultado = media >= 7 ? "Aluno aprovado" : (media >= 5 && media <= 6) ? "Aluno em recupera��o" : "Aluno reprovado";
		
		System.out.println(resultado);
		
	}
}
