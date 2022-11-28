package avaliacao2;

public class Musica {
    private String titulo;
    private Integer duracao;
    private String qualidadeDeGravacao;
    private Integer anoDeGravacao;

    private Interprete interprete;

    public Musica() {
    }

    public Musica(String titulo, Integer duracao, String qualidadeDeGravacao,
                                Integer anoDeGravacao, Interprete interprete) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.qualidadeDeGravacao = qualidadeDeGravacao;
        this.anoDeGravacao = anoDeGravacao;
        this.interprete = interprete;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String getQualidadeDeGravacao() {
        return qualidadeDeGravacao;
    }

    public void setQualidadeDeGravacao(String qualidadeDeGravacao) {
        this.qualidadeDeGravacao = qualidadeDeGravacao;
    }

    public Integer getAnoDeGravacao() {
        return anoDeGravacao;
    }

    public void setAnoDeGravacao(Integer anoDeGravacao) {
        this.anoDeGravacao = anoDeGravacao;
    }

    public Interprete getInterprete() {
        return interprete;
    }

    public void setInterprete(Interprete interprete) {
        this.interprete = interprete;
    }

    @Override
    public String toString() {
        return "Título: " + titulo +
                ". Interpretada por: " + interprete +
                ". Qualidade: " + qualidadeDeGravacao +
                ". " + anoDeGravacao + " - " +  duracao + " segundos";
    }
}
