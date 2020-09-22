
package aula_java01;

import java.util.Scanner;


public class ex_1004 {
    
    public static void main(String[] args) {
        
        int a ,b , prod ;
        
        Scanner entrada = new Scanner (System.in) ;
        
        a =entrada.nextInt();
        b =entrada.nextInt();
        
        prod= (a * b);
        
        System.out.printf ("PROD = %d\n",prod);
        
                
    }
    
}
