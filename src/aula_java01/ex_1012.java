
package aula_java01;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ex_1012 {
    public static void main(String[] args) {
      double a,b,c,tri,cir,tra,qua,ret;  
    
        Scanner entrada = new Scanner(System.in);
        a=entrada.nextDouble();
        b=entrada.nextDouble();
        c=entrada.nextDouble();
        
        tri=(a*c)/2;
        cir=3.14159*(c*c);
        tra=((a+b)*c)/2;
        qua=b*b;
        ret= a*b;
        
        System.out.printf("TRIANGULO: %.3f\n",tri);
        System.out.printf("CIRCULO: %.3f\n", cir);
        System.out.printf("TRAPEZIO: %.3f\n", tra);
        System.out.printf("QUADRADO: %.3f\n",qua );
        System.out.printf("RETANGULO: %.3f\n", ret);
    }   
}
