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
public class ex_1015 {
    public static void main(String[] args) {
        
        double x1,x2,y1,y2,distancia;
        
        Scanner entrada = new Scanner(System.in);
        x1=entrada.nextDouble();
        y1=entrada.nextDouble();
        x2=entrada.nextDouble();
        y2=entrada.nextDouble();
        
        distancia=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        distancia = Math.sqrt(distancia);
        
        System.out.printf("%.4f\n",distancia);
        
        
    }
    
}
