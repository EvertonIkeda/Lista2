package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado0, lado1, lado2;
        
        System.out.println("Informe o primeiro lado do triangulo: ");
        lado0 = sc.nextDouble();
        
        System.out.println("Informe o segundo lado do triangulo: ");
        lado1 = sc.nextDouble();
        
        System.out.println("Informe o terceiro lado do triangulo: ");
        lado2 = sc.nextDouble();
        
        if (lado0 + lado1 < lado2 | lado0 + lado2 < lado1 | lado1 + lado2 < lado0){
            System.out.println("Os valores informados nao formam um triangulo");
        } else if (lado0 == lado1 & lado1 == lado2){
            System.out.println("O triangulo é equilatero.");
        } else if (lado0 == lado1 | lado0 == lado2 | lado1 == lado2){
            System.out.println("O triangulo é isosceles.");
        } else{
            System.out.println("O triangulo é escaleno.");
        }
    }
}
