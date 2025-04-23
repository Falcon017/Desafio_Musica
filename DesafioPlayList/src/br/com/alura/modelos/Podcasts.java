package br.com.alura.modelos;

public class Podcasts extends Audio {
    private String convidado;

    public void exibirFichaTecnica() {
        super.exibirFichaTecnica();
        System.out.println("Convidado: " + convidado);
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    @Override
    public int getClassificacao() {
        if(this.getCurtidas() > 100){
            return 10;
        }else{
            return 8;
        }

    }
}
