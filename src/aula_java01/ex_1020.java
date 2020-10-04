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
public class ex_1020 {
    
    public static void main(String[] args) {
        
        int idade ,ano,meses,dias,x;
        
        Scanner entrada = new Scanner(System.in);
        
        idade = entrada.nextInt();
        
        ano =idade/365;
        meses=(idade%365)/30;
        dias=(idade%365)%30;
        

        //dias=dias%;
        //x=dias%30;
        
        
        System.out.printf("%d ano(s)\n",ano);  
        System.out.printf("%d mes(es)\n",meses);
        System.out.printf("%d dias(s)\n",dias);
    }
}
