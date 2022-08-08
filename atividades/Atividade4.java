package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        
        System.out.println("Informe o valor de A: ");
        a = sc.nextInt();
        
        System.out.println("Informe o valor de B: ");
        b = sc.nextInt();
        
        if (a == b){
            c = a + b;
            System.out.println(c);;
        } else {
            c = a * b;
            System.out.println(c);
        }
    }
}