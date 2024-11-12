package oo.atividadeum;

import java.util.Scanner;

public class Endereco {
    private String logadouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
        
    public void entrar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o logadouro: ");
        setLogadouro(this.logadouro = entrada.nextLine());
        System.out.print("Digite o numero: ");
        setNumero(this.numero = entrada.nextLine());
        System.out.print("Digite o complemento: ");
        setComplemento(this.complemento = entrada.nextLine());
        System.out.print("Digite o bairro: ");
        setBairro(this.bairro = entrada.nextLine());
        System.out.print("Digite a cidade: ");
        setCidade(this.cidade = entrada.nextLine());
        System.out.print("Digite o estado: ");
        setEstado(this.estado = entrada.nextLine());
        System.out.print("Digite o CEP: ");
        setCep(this.cep = entrada.nextLine());
    }
    
    public void imprimir() {
        System.out.println("Logadouro: "+this.getLogadouro());
        System.out.println("Numero: "+this.getNumero());
        System.out.println("Complemento: "+this.getComplemento());
        System.out.println("Bairro: "+this.getBairro());
        System.out.println("Cidade: "+this.getCidade());
        System.out.println("Estado: "+this.getEstado());
        System.out.println("CEP: "+this.getCep());
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
