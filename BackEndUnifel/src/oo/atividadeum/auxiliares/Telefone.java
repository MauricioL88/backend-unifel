package oo.atividadeum.auxiliares;

import java.util.Scanner;

public class Telefone {

    private Integer ddd;
    private Long numero;

    public void entrar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o DDD: ");
        setDdd(this.ddd = entrada.nextInt());
        System.out.print("Digite o telefone: ");
        setNumero(this.numero = entrada.nextLong());
    }

    public void imprimir() {
        System.out.println("("+getDdd()+") "+getNumero());
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

}
