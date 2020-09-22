
package aula_java01;

import java.util.Scanner;


public class ex_1002 {
   
    //public static void main(String[] args)
    
    public static void main(String[] args) {
        // real
        double raio,area;
   
        Scanner entrada = new Scanner(System.in);
        
        raio = entrada.nextDouble ();
        
        area =3.14159 * (raio * raio );
        
        System.out.printf("A=%.4f\n;" , area );
    
    }
         
        
}
// teste
