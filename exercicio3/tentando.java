
import java.util.Scanner;

public class NumeroMuitoGrande {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n1;
        String n2;
        int i, j, k, vai, mult,fica;
        int r[] = new int[30];
        int x[] = new int[30];
        int y[] = new int[30];
        System.out.print("Primeiro Número Grande: ");
        n1 = input.next();
        System.out.print("Segundo Número Grande: ");
        n2 = input.next();

        for (i = 0; i < n1.length(); i++) {
            char caracter = n1.charAt(i);
            x[i] = Character.getNumericValue(caracter);
        }
        for (i = 0; i < n2.length(); i++) {
            char caracter = n2.charAt(i);
            y[i] = Character.getNumericValue(caracter);
        }
        for (i = 0; i <= 29; i++) {
            r[i] = -1;
        }
        vai = 0;
        for (i = 29; i >= 0; i--) {
            r[i] = (x[i] + y[i] + vai);
            if (r[i] > 9) {
                r[i] -= 10;
                vai = + 1;
                r[i-1] = vai;
                
            }
        }
        for (k = 0; k < 29; k++) {
            if (r[k] > 0) {
                System.out.print(r[k]);
            }
        }
        /*for (i = 29; i >= 0; i--) {
            for (j = 29; j >= 0; j--) {
                mult = (x[j]*y[i]);
                fica = mult%10;
                r[j] = (fica + vai);
                vai = mult/10;   
            }
           
        }*/
    }
}
