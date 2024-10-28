package atividades.arrays;

public class ElementoPresente {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean status = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 3) {
                status = true;
            }
        }

        if (status) {
            System.out.println("Numero esta presente.");
        } else {
            System.out.println("Nao esta presente.");
        }
    }
}
