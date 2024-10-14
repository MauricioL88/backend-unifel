package atividades.scanner;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        String nome = entrada.next();
        
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        
        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();
        
        System.out.printf("\nOla %s! Voce tem %d anos e tem %.2f de altura.\n",nome, idade, altura);
        
        entrada.close();
    }
}
