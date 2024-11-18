package oo.relacoes.composicao;

public class Revista {
    public static int num = 1;
    private Integer codigo;
    private String nome;
    private String tipo;
    private Edicao edicao;
    
    public Revista() {
        this.codigo = Revista.num++;
        this.edicao = new Edicao();
    }    
    
    public Revista(Integer numEdicao, Integer anoEdicao, String titulo) {
        this.codigo = Revista.num++;
        this.edicao = new Edicao(numEdicao, anoEdicao, titulo);
    }
    
    public Revista(String nome, String tipo,Integer numEdicao, Integer anoEdicao, String titulo) {
        this.codigo = Revista.num++;
        this.nome = nome;
        this.tipo = tipo;
        this.edicao = new Edicao(numEdicao, anoEdicao, titulo);
    }
    
    public String getEdicao() {
        return "Revista: "+this.getNome()+" | "+this.edicao.getEdicao();
    }   
    
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getTipo() {
        return this.tipo;
    }
}
