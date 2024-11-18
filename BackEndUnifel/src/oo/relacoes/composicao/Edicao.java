package oo.relacoes.composicao;

public class Edicao {
    private Integer numEdicao;
    private Integer anoEdicao;
    private String titulo;
    
    public Edicao() {
        
    }
    
    public Edicao(Integer numEdicao, Integer anoEdicao, String titulo) {
        this.numEdicao = numEdicao;
        this.anoEdicao = anoEdicao;
        this.titulo = titulo;
    }
    
    public String getEdicao() {
        return "Numero da Edicao: "+getNumEdicao()+" | Ano da Edicao: "+getAnoEdicao()+
                " | Titulo da edicao: "+getTitulo();
    }

    public Integer getNumEdicao() {
        return numEdicao;
    }

    public Integer getAnoEdicao() {
        return anoEdicao;
    }

    public String getTitulo() {
        return titulo;
    }
    
}
