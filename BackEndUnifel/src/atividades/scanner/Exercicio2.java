package atividades.scanner;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Celsius: ");
        double tempC = entrada.nextDouble();
        
        double tempF = (1.8 * tempC) + 32;
        
        System.out.println("\nA temperatura em Fahrenheit: "+tempF+" F");
        
        entrada.close();
    }
}
