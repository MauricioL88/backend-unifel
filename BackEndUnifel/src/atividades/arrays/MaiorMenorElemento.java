package atividades.arrays;

public class MaiorMenorElemento {

    public static void main(String[] args) {
        int[] numeros = {10, 100, 30, 3500, 4, 2, 1000};
        int maior = 0, menor = 100;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            } else if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Maior numero: " + maior + " e Menor numero: " + menor);
    }
}
