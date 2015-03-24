public class Calculadora{

	int variavel1;
	int variavel2;
	int soma;
	int subtracao;
	int multiplicacao;
	float divisao;

	public void soma(){
	
	soma = (variavel1 + variavel2);	

	System.out.println("A soma é " + this.soma);
	
	}
	
	public void subtracao(){
	
	subtracao = (variavel1 - variavel2);	

	System.out.println("A subtração é " + this.subtracao);
	
	}
	
	public void multiplicacao(){
	
	multiplicacao = (variavel1 * variavel2);	

	System.out.println("A multiplicação é " + this.multiplicacao);
	
	}
	
	public void divisao(){
	
	divisao = (variavel1 / variavel2);	

	System.out.println("A divisão é " + this.divisao);
	
	}
	
	public static void main (String [] args){
	
	Calculadora conta1 = new Calculadora();
	Calculadora conta2 = new Calculadora();
	Calculadora conta3 = new Calculadora();


	conta1.variavel1 = 6;
	conta1.variavel2 = 2;
	conta1.soma();
	conta1.subtracao();
	conta1.multiplicacao();
	conta1.divisao();

	conta2.variavel1 = 10;
	conta2.variavel2 = 2;
	conta2.soma();
	conta2.subtracao();
	conta2.multiplicacao();
	conta2.divisao();

	conta3.variavel1 = 15;
	conta3.variavel2 = 2;
	conta3.soma();
	conta3.subtracao();
	conta3.multiplicacao();
	conta3.divisao();


	}

}
