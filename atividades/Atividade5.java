package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um valor inteiro: ");
        int num = sc.nextInt();
        
        if (num >= 0){
            System.out.println(num * 2);
        } else {
            System.out.println(num * 3);
        }
    }
}