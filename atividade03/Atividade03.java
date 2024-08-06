package com.mycompany.atividade03;

import java.util.Scanner;

public class Atividade03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int x = scan.nextInt();
        
        System.out.println("Digite outro numero: ");
        int y = scan.nextInt();
        
        Mod modulo = new Mod();
        
        modulo.modulo(x, y);
        
        System.out.println("Modulo = " + modulo.resultado);
    }
}
