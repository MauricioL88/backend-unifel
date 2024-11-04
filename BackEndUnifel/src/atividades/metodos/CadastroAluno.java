package atividades.metodos;

import java.util.HashMap;
import java.util.Scanner;

public class CadastroAluno {

    private static Scanner scanner = new Scanner(System.in);
    private static HashMap<String, Integer> cadastro = new HashMap<>();

    public static void main(String[] args) {

        menuCadastro();

        scanner.close();
    }

    public static void cadastrarAluno() {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.next().toLowerCase().trim();

        System.out.print("Digite a idade do aluno(a): ");
        Integer idade = scanner.nextInt();

        cadastro.put(nome, idade);
        System.out.println("");
    }

    public static void mostrarIdade() {
        System.out.print("Digite o nome do aluno(a): ");
        String nome = scanner.next().toLowerCase().trim();
        Integer idade = cadastro.get(nome);
        if (idade != null) {
            System.out.println("Aluno(a) cadastado(a)!\nIdade: " + idade);
        } else {
            System.out.println("Aluno(a) nao cadastrado(a)!");
        }
        System.out.println("");
    }

    public static void menuCadastro() {
        Boolean noMenu = true;

        while (noMenu) {
            System.out.print("1 - Cadastrar | 2 - Consultar | 3 - Sair: ");
            Integer escolha = scanner.nextInt();
            System.out.println("\n");
            switch (escolha) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    mostrarIdade();
                    break;
                case 3:
                    System.out.println("\nSaindo...");
                    noMenu = false;
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }
}
