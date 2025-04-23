package br.com.alura.modelos;

public class Musicas extends Audio {
    private String album;
    private int anoDeLancamento;

    public void exibirFichaTecnica() {
        super.exibirFichaTecnica();
        System.out.println("Álbum: " + album);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalDeReproducoes() > 200) {
            return 10;
        }else{
            return 7;
        }
     }
}
