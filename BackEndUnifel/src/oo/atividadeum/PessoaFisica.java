package oo.atividadeum;

public abstract class PessoaFisica extends Pessoa {
    private String cpf;
    private String rg;
    private String emissor;
    
    @Override
    public void entrar() {
        super.entrar();
        System.out.print("Digite o CPF: ");
        setCpf(this.cpf = entrada.nextLine());
        System.out.print("Digite o RG: ");
        setRg(this.rg = entrada.nextLine());
        System.out.print("Digite o emissor do RG: ");
        setEmissor(this.emissor = entrada.nextLine());
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("CPF: "+getCpf());
        System.out.println("RG: "+getRg());
        System.out.println("Emissor do RG: "+getEmissor());
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }
}
