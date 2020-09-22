package aula_java01;

import java.util.Scanner;

public class ex_1005 {

    public static void main(String[] args) {

        double a, b, media;

        Scanner entrada = new Scanner(System.in);

        a = entrada.nextDouble();
        b = entrada.nextDouble();

        media = ((a * 3.5) + (b * 7.5)) / (3.5 + 7.5);

        System.out.printf("SUA MEDIA :%.5f\n ", media);
    }
}
//teste
//teste