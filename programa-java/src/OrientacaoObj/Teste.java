package OrientacaoObj;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alex");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("42651de64141");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.mshMaiorDeIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println(aluno.salario());
		System.out.println(diretor.salario());
		System.out.println(secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa e demais= " + pessoa.getNome());
	}
}
