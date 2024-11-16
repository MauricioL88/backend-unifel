package oo.associacao.simples;

public class Conta {
    public static int num = 1;
    
    private Integer conta;
    private String agencia = "0001";
    private Cliente cliente;
    private Double saldo;
    
    public Conta(Cliente cliente) {
        this.conta = Conta.num++;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public static int getNum() {
        return num;
    }

    public Integer getConta() {
        return conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }   
    
}
