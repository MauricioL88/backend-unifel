package oo.atividadeum;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String ie;
    private String contato;
        
    @Override
    public void entrar() {
        System.out.print("Digite o CNPJ: ");
        setCnpj(this.cnpj = entrada.nextLine());
        System.out.print("Digite a Inscricao Estadual: ");
        setIe(this.ie = entrada.nextLine());
        System.out.print("Digite o contato: ");
        setContato(this.contato = entrada.nextLine());
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
