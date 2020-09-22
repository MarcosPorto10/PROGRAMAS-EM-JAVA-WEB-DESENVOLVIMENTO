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
public class ex_1009 {
    public static void main(String[] args) {
        String vendedor;
        double salariof,vendas,total;
        
        Scanner entrada = new Scanner(System.in);
    vendedor =entrada.next();
    salariof =entrada.nextDouble();
    vendas =entrada.nextDouble();
    
    total= (vendas/100*15+salariof);
    
    System.out.printf("TOTAL = R$ %.2f\n", total);
    
    }
    
}
