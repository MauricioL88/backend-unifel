package atividades.arrays;

public class MediaElementos {

    public static void main(String[] args) {
        double[] num = {1.0, 2.9, 3.5, 4.45, 5.99};
        double somaNum = 0.0;

        for (int i = 0; i < num.length; i++) {
            somaNum += num[i];
        }

        double media = somaNum / num.length;
        System.out.printf("A media dos numeros eh: %.2f\n\n", media);
    }
}
