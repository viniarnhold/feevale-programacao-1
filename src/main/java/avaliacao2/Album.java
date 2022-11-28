package avaliacao2;

import java.util.List;

public class Album {
    private String titulo;
    private Integer anoDeLancamento;
    private List<Musica> musicas;

    public Album() {
    }

    public Album(String titulo, Integer anoDeLancamento, List<Musica> musicas) {
        this.titulo = titulo;
        this.anoDeLancamento = anoDeLancamento;
        this.musicas = musicas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(Integer anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public void printarMusicas(){
        System.out.println("-------- ALBUM --------");
        System.out.println("Titulo: " + this.titulo );
        System.out.println("Ano de Lancamento: " + this.anoDeLancamento);
        System.out.println("------- MUSICAS -------");
        int numeroMusica = 1;
        for(Musica musica : this.musicas){
            System.out.println(numeroMusica + " - " + musica);
            numeroMusica++;
        }
        System.out.println();
    }
}
