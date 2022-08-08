package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ma;
        
        System.out.println("Informe o numero de identificacao: ");
        int id = sc.nextInt();
        
        System.out.println("Informe a primeira nota: ");
        double nota1 = sc.nextDouble();
        
        System.out.println("Informe a segunda nota: ");
        double nota2 = sc.nextDouble();
        
        System.out.println("Informe a terceira nota: ");
        double nota3 = sc.nextDouble();
        
        System.out.println("Informe a media dos exercicios: ");
        double exercicios = sc.nextDouble();
        
        ma = (((nota1 + nota2) * 2) + ((nota3) * 3) + exercicios) / 7;
        
        if (ma >= 90){
            System.out.println(id + ", nota 1: " + nota1 + "nota 2: " + nota2 + "nota 3: " + nota3 + ", media dos exercicios: " + exercicios + ", media de aproveitamento: " + ma + ", conceito: A. Aprovado.");
        } else if (ma >= 75 & ma < 90){
            System.out.println(id + ", nota 1: " + nota1 + "nota 2: " + nota2 + "nota 3: " + nota3 + ", media dos exercicios: " + exercicios + ", media de aproveitamento: " + ma + ", conceito: B. Aprovado.");
        } else if (ma >= 60 & ma < 75){
            System.out.println(id + ", nota 1: " + nota1 + "nota 2: " + nota2 + "nota 3: " + nota3 + ", media dos exercicios: " + exercicios + ", media de aproveitamento: " + ma + ", conceito: C. Aprovado.");
        } else if (ma >= 40 & ma < 60){
            System.out.println(id + ", nota 1: " + nota1 + "nota 2: " + nota2 + "nota 3: " + nota3 + ", media dos exercicios: " + exercicios + ", media de aproveitamento: " + ma + ", conceito: D. Reprovado.");
        } else if (ma < 40){
            System.out.println(id + "; nota 1: " + nota1 + ", nota 2: " + nota2 + ", nota 3: " + nota3 + ", media dos exercicios: " + exercicios + ", media de aproveitamento: " + ma + ", conceito: E. Reprovado.");
        }
    }
}
