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
public class ex_1019 {
    public static void main(String[] args) {
        int valor,h,rh,m,rm,s;
        
        Scanner entrada = new Scanner(System.in);
        
        valor=entrada.nextInt();
        
        h=valor/3600;
        rh=valor%3600;
        
        m=rh/60;
        rm=rh%60;
        
        
        s=rm;
        
        System.out.printf("%d:%d:%d\n",h,m,s);
        
        
                
    }
    
}
