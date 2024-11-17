package oo.associacao.simples;

public class Cliente {
    public static int num = 1;
    
    private Integer id;
    private String nome;
    private String cpf;
    private Integer anoNascimento;
    private String email;
    
    public Cliente(String nome, String cpf, Integer anoNascimento, String email) {
        this.id = Cliente.num++;
        this.nome = nome;
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
        this.email = email;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Cliente.num = num;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(Integer anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
