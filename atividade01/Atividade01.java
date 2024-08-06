package com.mycompany.atividade01;

import java.util.Scanner;
import java.util.Stack;

public class Atividade01 {

    public static void main(String[] args) {
        Recursividade fun = new Recursividade();
        Stack pilha = new Stack();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma sequencia de numeros sem espaco: ");
        String[] N = scan.nextLine().split("");
        System.out.println("Digite um numero de 0 a 9: ");
        String K = scan.nextLine();

        for (int i = 0; i < N.length; i++) {
            pilha.add(N[i]);
        }
        
        fun.recursivo(pilha, K);
        System.out.println(fun.getContagem());
    }
}