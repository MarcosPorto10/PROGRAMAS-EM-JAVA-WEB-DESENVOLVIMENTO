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
public class ex_1006 {
    
    public static void main(String[] args) {
           double a, b,c, media;

        Scanner entrada = new Scanner(System.in);

        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c= entrada.nextDouble();
        
        media = ((a * 2) + (b * 3)+(c*5)) / (2+3+5);

        System.out.printf("MEDIA = %.1f\n", media);
    }
    
}
