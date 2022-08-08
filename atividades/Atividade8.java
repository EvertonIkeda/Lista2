package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j, a;
        int num[] = new int[5];
        
        System.out.println("Informe o primeiro valor: ");
        num[0] = sc.nextInt();
        
        System.out.println("Informe o segundo valor: ");
        num[1] = sc.nextInt();
        
        System.out.println("Informe o terceiro valor: ");
        num[2] = sc.nextInt();
        
        System.out.println("Informe o quarto valor: ");
        num[3] = sc.nextInt();
        
        System.out.println("Informe o quinto valor: ");
        num[4] = sc.nextInt();
        
        for (int i = 0; i < 4; i++) {
            j = i;
            for (j = i; j < 5; j++) {
               if (num[j] < num[i] ) {
                   a = num[j];
                   num[j] = num[i];
                   num[i] = a;
               }
            }
        }
        
        System.out.println(num[0] + ", " + num[1] + ", " + num[2] + ", " + num[3] + ", " + num[4]);
    }
}