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
public class ex_1011 {
    public static void main(String[] args) {
        double raio,volume ;
        
        Scanner entrada = new Scanner(System.in);
        
        raio =entrada.nextDouble();
        volume =(4.0/3)* 3.14159 * (raio*raio *raio);
        
        System.out.printf("VOLUME = %.3f\n", volume);
        
    }
}
