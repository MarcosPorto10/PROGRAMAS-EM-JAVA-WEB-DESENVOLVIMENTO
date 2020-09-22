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
public class ex_1008 {
    public static void main(String[] args) {
        float funcionario,ht,vh,valor;
        
        Scanner entrada= new Scanner(System.in);
        
        funcionario = entrada.nextFloat(); 
        ht = entrada.nextFloat();
        vh = entrada.nextFloat();
        valor =(ht* vh);
         System.out.printf("NUMBER = %.0f\n", funcionario);
         System.out.printf("SALARY = U$ %.2f\n",valor);
                    
        
    }
}
