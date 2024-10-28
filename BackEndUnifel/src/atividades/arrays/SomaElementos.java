package atividades.arrays;

public class SomaElementos {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int somaNum = 0;
        
        for(int i = 0; i < num.length; i++) {
            somaNum += num[i];
        }
        
        System.out.println("Resultado da soma: "+somaNum);
    }
}
