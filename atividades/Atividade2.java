package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = new String();
        String genero = new String();
        String estadoCivil = new String();
        
        System.out.println("Informe o nome: ");
        nome = sc.nextLine();
        
        System.out.println("M - Masculino");
        System.out.println("F - Feminino");
        System.out.println("Informe o genero: ");
        genero = sc.nextLine();
        
        System.out.println("S - Solteiro(a)");
        System.out.println("C - Casado(a)");
        System.out.println("Informe o estado civil: ");
        estadoCivil = sc.nextLine();
        
        if ("F".equals(genero) | "f".equals(genero) && "C".equals(estadoCivil) | "c".equals(estadoCivil)){
            System.out.println("Informe quantos anos esta casada: ");
            int anos = sc.nextInt();
        }
    }
}
