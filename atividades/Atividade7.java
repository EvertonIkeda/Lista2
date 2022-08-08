package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um valor: ");
        double num = sc.nextDouble();
        
        num = num + 5;
        
        if (num % 2 == 1){
            System.out.println(num + 8);
        } else {
            System.out.println(num);
        }
    }
}