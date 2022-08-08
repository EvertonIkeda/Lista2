package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double delta, raiz1, raiz2;
        
        System.out.println("Informe o valor de a: ");
        int a = sc.nextInt();
        
        System.out.println("Informe o valor de b: ");
        int b = sc.nextInt();
        
        System.out.println("Informe o valor de c: ");
        int c = sc.nextInt();
        
        delta = (b * b) - (4 * a * c);
        
        System.out.println(delta);
        if (a == 0){
            System.out.println("A equacao nao é do segundo grau");
        } else if (delta < 0){
            System.out.println("A equacao possui raizes nao reais");
        } else if (delta == 0){
            System.out.println("A equacao possui apenas uma raiz real");
        } else if (delta > 0){
            raiz1 = (-1 * b + Math.sqrt(delta)) / (2 * a);
            raiz2 = (-1 * b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raizes sao: " + raiz1 + " e " + raiz2);
        }
    }
}