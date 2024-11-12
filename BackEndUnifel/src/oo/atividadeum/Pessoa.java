package oo.atividadeum;

import java.util.Scanner;

public abstract class Pessoa implements InterfaceCadastro {

    public static int num = 1;

    private Integer id;
    private String nome;
    private Endereco endereco;
    private Telefone telefone;
    private String email;

    public Pessoa() {
        this.id = Pessoa.num++;
        this.endereco = new Endereco();
        this.telefone = new Telefone();
    }

    @Override
    public void entrar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        setNome(this.nome = entrada.nextLine());
        this.endereco.entrar();
        this.telefone.entrar();
        System.out.print("Digite o seu email: ");
        setEmail(this.email = entrada.nextLine());
        entrada.close();
    }

    @Override
    public void imprimir() {
        System.out.println("\n- Dados -");
        System.out.println("Id: " + this.getId());
        System.out.println("Nome: " + this.getNome());
        System.out.println("- Endereco -");
        this.endereco.imprimir();
        System.out.println("- Telefone -");
        this.telefone.imprimir();
        System.out.println("Email: " + this.getEmail());
        System.out.println("\n");
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
