/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_java01;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ex_1010 {
    public static void main(String[] args) {
        double  peca1,numero_pecas1,valor_pecas1,pecas2,numero_pecas2,valor_pecas2,valor;
        
        Scanner entrada = new Scanner(System.in);
        
        peca1 = entrada.nextDouble();
        numero_pecas1 = entrada.nextDouble();
        valor_pecas1= entrada.nextDouble();
        
        pecas2 = entrada.nextDouble();
        numero_pecas2 = entrada.nextDouble();
        valor_pecas2= entrada.nextDouble();
        
        valor= (numero_pecas1*valor_pecas1+numero_pecas2*valor_pecas2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);
        
        
    }
    
}
