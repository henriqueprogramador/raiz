
package raiz;

import java.util.Scanner;


public class Raiz {

    
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        
         int x;
        System.out.println("informe um numero: ");
        int op1 = entrada.nextInt();
        
            System.out.println("valor da raiz quadrada "+Math.sqrt(op1));
    }
    
}
