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
public class ex_1016 {
    public static void main(String[] args) {
        
        int x=60;
        int y=90 , distancia , a;
        
        Scanner entrada = new Scanner(System.in);
        distancia=entrada.nextInt();
        a =(60*distancia)/30;
        System.out.printf("%d minutos\n", a);
    }
    
}
