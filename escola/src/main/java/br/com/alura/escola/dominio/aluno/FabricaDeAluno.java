package br.com.alura.escola.dominio.aluno;

// classe para facilitar a construção do objeto aluno.
// onde ela ja busca todas as informações desse aluno.
// o proprio método void foi substituido pelo proprio.
// método FabricaDeAluno ou seja o nome da classe virou um método.

public class FabricaDeAluno {

	private Aluno aluno;

	public FabricaDeAluno comNomeCPFEmail(String nome, String cpf, String email) {
		this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
		return this;

	}

	public FabricaDeAluno comTelefone(String ddd, String numero) {
		this.aluno.adicionarTelefone(ddd, numero);
		return this;

	}
 // Aqui eu criei o método para retornar um aluno.  
	public Aluno criar() {
		return this.aluno;
	}
// E aqui o método main de exemplo onde eu criei um objeto aluno
// e posso adicionar varios telefones.
// e por ultimo o método criar.	
	
	public static void main(String[] args) {
		FabricaDeAluno fabrica = new FabricaDeAluno();
		Aluno aluno2 = fabrica.comNomeCPFEmail("", "", "")
		.comTelefone("", "")
		.comTelefone("", "")
		.criar();
	}

}
