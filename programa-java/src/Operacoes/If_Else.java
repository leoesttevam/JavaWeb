package Operacoes;

public class If_Else {
	
	//Main � um metodo auto executavel em Java.
	public static void main(String[] args) {
		
		int mediaAluno = 70;
		String nome = "Leonardo";
		
		if(mediaAluno >= 70 && nome.equals("Leonardo")) {
			System.out.println("Parabens voc� est� aprovado!");
		}
		else if(mediaAluno < 70) {
			System.out.println("Voc� est� reprovado!");
		}else {
			System.out.println("Aluno n�o encontrado");
		}
	}
}
