package oo.atividadeum;

public abstract class Financeiro implements InterfaceCadastro {

    public static int num = 1;
    private Integer id;
    private Integer numero;
    private String emissao;
    private String vencimento;
    private String pagamento;
    private Double valor;
    private Double juros;
    private Double multa;
    private Double desconto;
    private Double total;

    public Financeiro() {
        this.id = Financeiro.num++;
    }

    @Override
    public void entrar() {
        System.out.print("Digite o numero: ");
        setNumero(this.numero = entrada.nextInt());
        System.out.print("Digite a emissao: ");
        setEmissao(this.emissao = entrada.nextLine());
        System.out.print("Digite a data de vencimento: ");
        setVencimento(this.vencimento = entrada.nextLine());
        System.out.print("Digite a data de pagamento: ");
        setPagamento(this.pagamento = entrada.nextLine());
        System.out.print("Digite o valor: R$ ");
        setValor(this.valor = entrada.nextDouble());
        System.out.print("Digite a % de juros ao ano: ");
        setJuros(this.juros = entrada.nextDouble());
        System.out.print("Digite o valor da multa a pagar: R$ ");
        setMulta(this.multa = entrada.nextDouble());
        System.out.print("Digite o valor do desconto: R$ ");
        setDesconto(this.desconto = entrada.nextDouble());

    }

    @Override
    public void imprimir() {
        System.out.println("Numero: " + getNumero());
        System.out.println("Emissao: " + getEmissao());
        System.out.println("Vencimento: " + getVencimento());
        System.out.println("Pagamento: " + getPagamento());
        System.out.println("Juros: " + getJuros());
        System.out.println("Valor da multa: R$ " + getMulta());
        System.out.println("Valor do desconto: R$ " + getDesconto());
        System.out.println("Valor total: R$ " + getTotal());
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Financeiro.num = num;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmissao() {
        return emissao;
    }

    public void setEmissao(String emissao) {
        this.emissao = emissao;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getTotal() {
        this.total = ((this.valor + this.multa) * ((this.juros / 100.0) / 12)) - this.desconto;
        return total;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
