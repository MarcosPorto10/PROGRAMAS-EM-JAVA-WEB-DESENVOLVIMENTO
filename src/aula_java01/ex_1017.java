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
public class ex_1017 {
    public static void main(String[] args) {
        double litros=12,th,vm,total;
        
        Scanner entrada =new Scanner(System.in);
        th=entrada.nextDouble();
        vm=entrada.nextDouble();
        
        total=(th*vm)/litros;
        
        System.out.printf("%.3f\n", total);
        
        
    }
}
