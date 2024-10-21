package atividades.switchCase;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o conceito da matéria, entre A - F: ");
        char conceito = entrada.next().toLowerCase().charAt(0);
        
        switch(conceito) {
            case 'a':
                System.out.println("Excelente");
                break;
            case 'b':
                System.out.println("Otimo");
                break;
            case 'c':
                System.out.println("Bom");
                break;
            case 'd':
                System.out.println("Regular");
                break;
            case 'e':
                System.out.println("Ruim");
                break;
            case 'f':
                System.out.println("Nos vemos ano que vem...");
                break;
            default:
                System.out.println("Digite um caractere valido!");
                break;
        }        
        entrada.close();
    }
}
