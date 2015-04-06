
import java.util.Scanner;

public class NumeroMuitoGrande {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n1;
        String n2;
        int i, j, k;
        int r[] = new int[30];
        int x[] = new int[30];
        int y[] = new int[30];
        System.out.print("Primeiro Número Grande: ");
        n1 = input.next();
        System.out.print("Segundo Número Grande: ");
        n2 = input.next();

        for (i = n1.length(), j=0; i >0; i--, j++) {
            char caracter = n1.charAt(j);
            x[i] = Character.getNumericValue(caracter);
        }
        for (i = n2.length(), j=0; i > 0; i--, j++) {
            char caracter = n2.charAt(j);
            y[i] = Character.getNumericValue(caracter);
        }
      
        for (i = 29; i >= 0; i--) {
            r[i] = (x[i] + y[i]);
            if (r[i] > 9) {
                r[i - 1] = (r[i] + 1);
                r[i] -= 10;
            }
        }
        for (k = 29; k >= 0; k--){
            if (r[k]>0)
            System.out.print(r[k]);
        
        
        }

    }

}
