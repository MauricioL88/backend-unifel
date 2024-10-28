package atividades.switchCase;

import java.util.Scanner;

public class Exercicio1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o conceito da matéria, entre A - F: ");
        char conceito = entrada.next().toLowerCase().charAt(0);
        
        switch(conceito) {
            case 'a' -> System.out.println("Excelente");
            case 'b' -> System.out.println("Otimo");
            case 'c' -> System.out.println("Bom");
            case 'd' -> System.out.println("Regular");
            case 'e' -> System.out.println("Ruim");
            case 'f' -> System.out.println("Nos vemos ano que vem...");
            default -> System.out.println("Digite um caractere valido!");
        }        
        entrada.close();
    }
}
