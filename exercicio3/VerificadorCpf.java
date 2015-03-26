import java.util.Scanner;

public class VerificadorCpf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cpf;
        int i, j;
        int cpfInt[] = new int[11];
        int x = 0, y = 0;
        float resto;

        System.out.print("Digite o CPF: ");
        cpf = input.next();

        for (i = 0; i < 9; i++) {
            char caracter = cpf.charAt(i);
            cpfInt[i] = Character.getNumericValue(caracter);
        }

        for (i = 8, j = 2; i >= 0; i--, j++) {
            x = cpfInt[i] * j + x;
        }
        if( x%11<2){
            cpfInt[9] = 0;
        }else{
            cpfInt[9] = (11-(x%11));
        }
        
        for (i = 9, j = 2; i >= 0; i--, j++) {
            y = cpfInt[i] * j + y;
        }
        if( y%11<2){
            cpfInt[10] = 0;
        }else{
            cpfInt[10] = (11-(y%11));
        }
        System.out.print("O CPF é: ");
        for( i=0; i<11; i++){
            System.out.print(cpfInt[i]);
        }
            
        
    }

}
