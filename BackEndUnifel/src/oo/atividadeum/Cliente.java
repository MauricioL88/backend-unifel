package oo.atividadeum;

public class Cliente extends PessoaJuridica{
    private Double limite_credito;
    private Endereco endereco_cobranca;
    
    public Cliente() {
        super();
        endereco_cobranca = new Endereco();
        this.limite_credito = 10_000.00;
    }
    
    @Override
    public void entrar() {
        super.entrar();
        System.out.println("- Endereco de Cobranca -");
        
    }

    public Double getLimite_credito() {
        return limite_credito;
    }

    public void setLimite_credito(Double limite_credito) {
        this.limite_credito = limite_credito;
    }

    public Endereco getEndereco_cobranca() {
        return endereco_cobranca;
    }

    public void setEndereco_cobranca(Endereco endereco_cobranca) {
        this.endereco_cobranca = endereco_cobranca;
    }    
}
