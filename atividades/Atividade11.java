package com.mycompany.atividades;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o preço a pagar: ");
        double preco = sc.nextDouble();
        
        System.out.println("1 - A vista em dinheiro ou cheque, recebe 10% de desconto");
        System.out.println("2 - A vista no cartão de crédito, recebe 15% de desconto");
        System.out.println("3 - Em duas vezes, preço normal de etiqueta sem juros");
        System.out.println("4 - Em duas vezes, preço normal de etiqueta mais juros de 10%");
        int condicao = sc.nextInt();
        
        if (condicao == 1){
            System.out.println("O valor a pagar é: " + df.format(preco * 0.9));
        } else if (condicao == 2){
            System.out.println("O valor a pagar é: " + df.format(preco * 0.85));
        } else if (condicao == 3){
            System.out.println("O valor a pagar é: " + preco);
        } else if (condicao == 4){
            System.out.println("O valor a pagar é: " + df.format(preco * 1.1));
        }
    }
}
