package atividades.metodos;

public class DivisivelPorNove {

    public static void main(String[] args) {
        System.out.println("A soma dos numeros divisiveis por 9: " + divisivelPorNove(100, 250));
    }

    public static Integer divisivelPorNove(Integer inicio, Integer fim) {
        Integer soma = 0;
        for (int i = inicio; i <= fim; i++) {
            if (i % 9 == 0) {
                soma += i;
            }
        }
        return soma;
    }
}
