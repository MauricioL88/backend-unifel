package oo.relacoes.associacao_simples;

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
    
    public void imprimirConta() {
        System.out.println("- Dados Cliente -");
        this.cliente.imprimirDados();
        System.out.println("- Dados da Conta -");
        System.out.println("Agencia: "+getAgencia());
        System.out.println("Conta: "+getConta());
        System.out.println("Saldo Atual: R$ "+getSaldo()+" reais.");
        System.out.println("\n");
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
