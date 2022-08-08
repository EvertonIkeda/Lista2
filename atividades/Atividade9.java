package com.mycompany.atividades;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        String genero = new String();
        
        System.out.println("M - Masculino");
        System.out.println("F - Feminino");
        System.out.println("Informe o sexo: ");
        genero = sc.nextLine();
        
        System.out.println("Informe a altura (m):");
        double altura = sc.nextDouble();
        
        if (genero.equals("M") | genero.equals("m")){
            System.out.println("Seu peso ideal é " + df.format((72.7 * altura) - 58));
        } else if (genero.equals("F") | genero.equals("f")){
            System.out.println("Seu peso ideal é " + df.format((62.1 * altura) - 44.7));
        }
    }
}