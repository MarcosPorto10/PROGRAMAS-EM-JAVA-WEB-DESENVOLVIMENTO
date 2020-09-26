package aula_java01;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class ex_1013 {
    public static void main(String[] args) {
        int  a,b,c, m_ab,m_abc;
        
        Scanner entrada = new Scanner(System.in);
        
        a=entrada.nextInt();
        b=entrada.nextInt();
        c=entrada.nextInt();
        
        m_ab= (a+b+Math.abs(a-b))/2;
        m_abc=(m_ab+c+Math.abs(m_ab-c))/2;
        
        System.out.printf(m_abc + " eh o maior\n");
        
        
        
    }
    
}
