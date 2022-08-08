package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, num3, a;
        
        System.out.println("Informe o primeiro valor: ");
        num1 = sc.nextDouble();
        
        System.out.println("Informe o segundo valor: ");
        num2 = sc.nextDouble();
        
        System.out.println("Informe o terceiro valor: ");
        num3 = sc.nextDouble();
        
        if (num1 < num3){
            a = num1;
            num1 = num3;
            num3 = a;
        }
        if (num1 < num2){
            a = num1;
            num1 = num2;
            num2 = a;
        }
        if (num2 < num3){
            a = num2;
            num2 = num3;
            num3 = a;
        }
        
        System.out.println(num1 + ", " + num2 + ", " + num3);
    }
}