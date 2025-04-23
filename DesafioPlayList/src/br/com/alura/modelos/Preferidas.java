package br.com.alura.modelos;

public class Preferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " possui classificação maxima,pelos ouvintes!");
        }else{
            System.out.println(audio.getTitulo() + " otima opção para ouvir mais tarde!");
        }
    }
}
