package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o valor de A: ");
        int a = sc.nextInt();
        
        System.out.println("Informe o valor de B: ");
        int b = sc.nextInt();
        
        System.out.println("Informe o valor de C: ");
        int c = sc.nextInt();
        
        if ((a+b) > c){
            System.out.println("A + B é maior que C");
        } else {
            System.out.println("A + B é menor que C");
        }
    }
}
