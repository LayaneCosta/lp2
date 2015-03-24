public class Aluno {

	String nome;
	String numeroMatricula;
	int idade;

	public void imprimirDadosCadastrais(){
	
		System.out.println("Nome: " +this.nome);
		System.out.println("Idade: " +this.idade);
		System.out.println("Numero Matricula: " +this.numeroMatricula);
			
	}
	public static void main (String [] args){
	Aluno estudante1 = new Aluno();
	Aluno estudante2 = new Aluno();
	Aluno estudante3 = new Aluno();
	Aluno estudante4 = new Aluno();	


	estudante1.nome = "Layane";
	estudante1.idade = 17;
	estudante1.numeroMatricula = "201318110173";
	
	estudante1.imprimirDadosCadastrais();


	estudante2.nome = "Amanda";
	estudante2.idade = 17;
	estudante2.numeroMatricula = "201318110025";
	
	estudante2.imprimirDadosCadastrais();

	
	estudante3.nome = "Helder";
	estudante3.idade = 17;
	estudante3.numeroMatricula = "201318110181";
	
	estudante3.imprimirDadosCadastrais();
	
	
	estudante4.nome = "Brenda";
	estudante4.idade = 17;
	estudante4.numeroMatricula = "201318110041";
	
	estudante4.imprimirDadosCadastrais();


	}

}
