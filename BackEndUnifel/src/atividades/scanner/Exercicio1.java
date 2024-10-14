package atividades.scanner;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        int num2 = entrada.nextInt();
        
        System.out.println("\nResultado da soma: "+ (num1 + num2));
        
        entrada.close();
    }
}
