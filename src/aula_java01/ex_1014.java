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
public class ex_1014 {
    public static void main(String[] args) {
        double km,gasolina,media;
        
        Scanner entrada = new Scanner(System.in);
        
        km=entrada.nextDouble();
        gasolina=entrada.nextDouble();
        
        media =km/gasolina;
        
        System.out.printf(String.format  ( "%.3f km/l\n",media));
    
                }
}
