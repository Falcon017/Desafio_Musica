package br.com.alura.modelos;

public class Audio {
    private String titulo;
    private String autor;
    private double duracao;
    private String genero;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    public void exibirFichaTecnica(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Duração: " +duracao);
        System.out.println("Genero: " + genero);
    }

    public void curte(){
        this.curtidas++;
    }

    public void reproduz(){
        this.totalDeReproducoes++;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }

}
