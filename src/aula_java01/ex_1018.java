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
public class ex_1018 {
    public static void main(String[] args) {
     int valor,n_100,n_50,n_20,n_10,n_5,n_2,n_1;
     
        Scanner entrada= new Scanner(System.in);
        valor=entrada.nextInt();
          System.out.printf("%d\n",valor);
        n_100=valor/100;
        valor= valor % 100;
        
        n_50 = valor/50;
        valor=valor % 50;
        
        n_20 =valor /20;
        valor=valor% 20;
        
        n_10 =valor /10;
        valor=valor %10;
        
        n_5 =valor /5;
        valor= valor %5;
        
        n_2 =valor/2;
        valor=valor % 2;
        
        n_1= valor;
        
       
        System.out.printf("%d nota(s) de R$ 100,00\n", n_100 );
        System.out.printf("%d nota(s) de R$ 50,00\n", n_50 );
        System.out.printf("%d nota(s) de R$ 20,00\n", n_20 );
        System.out.printf("%d nota(s) de R$ 10,00\n", n_10 );
        System.out.printf("%d nota(s) de R$ 5,00\n", n_5 );
        System.out.printf("%d nota(s) de R$ 2,00\n", n_2 );
        System.out.printf("%d nota(s) de R$ 1,00\n", n_1 );
       
        
        
                        
    }
    
}
