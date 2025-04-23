package br.com.alura.Principal;

import br.com.alura.modelos.Musicas;
import br.com.alura.modelos.Podcasts;
import br.com.alura.modelos.Preferidas;

public class Principal {
    public static void main(String[] args) {
        Musicas musica1 = new Musicas();

        System.out.println("***************************************************");
        System.out.println();
        musica1.setTitulo("Bohemian rhapsody");
        musica1.setAutor("Queen");
        musica1.setDuracao(5.54);
        musica1.setGenero("Rock");
        musica1.setAlbum("A Night at the Opera");
        musica1.setAnoDeLancamento(1975);
        musica1.exibirFichaTecnica();

        for (int i = 0; i < 500; i++){
            musica1.reproduz();
        }
        for (int i= 0; i < 300; i++){
            musica1.curte();
        }

        System.out.println();
        System.out.println("***************************************************");
        System.out.println();

        Musicas musica2 = new Musicas();
        musica2.setTitulo("Numb");
        musica2.setAutor("linkin park");
        musica2.setDuracao(3.08);
        musica2.setGenero("Rock");
        musica2.setAlbum("Meteora");
        musica2.setAnoDeLancamento(2004);
        musica2.exibirFichaTecnica();

        for (int i = 0; i < 250; i++){
            musica2.reproduz();
        }
        for (int i= 0; i < 200; i++){
            musica2.curte();
        }

        System.out.println();
        System.out.println("***************************************************");
        System.out.println();

        Musicas musica3 = new Musicas();
        musica3.setTitulo("Balada");
        musica3.setAutor("Gustavo Lima");
        musica3.setDuracao(3.22);
        musica3.setGenero("Sertanejo");
        musica3.setAlbum("Gusttavo Lima e Você");
        musica3.setAnoDeLancamento(2012);
        musica3.exibirFichaTecnica();

        for (int i = 0; i < 200; i++){
            musica3.reproduz();
        }
        for (int i= 0; i < 150; i++){
            musica3.curte();
        }

        System.out.println();
        System.out.println("***************************************************");
        System.out.println();

        Podcasts podcasts1 = new Podcasts();
        podcasts1.setTitulo("inteligência limitada");
        podcasts1.setAutor("Rogerio Vilela");
        podcasts1.setConvidado("Telma Rocha,Edu e Leandro");
        podcasts1.setDuracao(213);
        podcasts1.setGenero("True crime");
        podcasts1.exibirFichaTecnica();

        for (int i = 0; i < 450; i++){
            podcasts1.reproduz();
        }
        for (int i= 0; i < 390; i++){
            podcasts1.curte();
        }

        System.out.println();
        System.out.println("***************************************************");
        System.out.println();

        Podcasts podcasts2 = new Podcasts();
        podcasts2.setTitulo("Podpah");
        podcasts2.setAutor("Igão e Mitico");
        podcasts2.setConvidado("Bitelo e Fabio Giga");
        podcasts2.setDuracao(118);
        podcasts2.setGenero("Powerlifting");
        podcasts2.exibirFichaTecnica();

        for (int i = 0; i <250; i++){
            podcasts2.reproduz();
        }
        for (int i= 0; i < 190; i++){
            podcasts2.curte();
        }

        System.out.println();
        System.out.println("***************************************************");
        System.out.println();

        Podcasts podcasts3 = new Podcasts();
        podcasts3.setTitulo("Ticaracaticast");
        podcasts3.setAutor("Bola e Carioca");
        podcasts3.setConvidado("Matheus ceará");
        podcasts3.setDuracao(146);
        podcasts3.setGenero("Comedia");
        podcasts3.exibirFichaTecnica();

        for (int i = 0; i < 150; i++){
            podcasts1.reproduz();
        }
        for (int i= 0; i < 90; i++){
            podcasts1.curte();
        }

        System.out.println();
        System.out.println("***************************************************");
        System.out.println();

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(musica1);
        preferidas.inclui(musica2);
        preferidas.inclui(musica3);
        preferidas.inclui(podcasts1);
        preferidas.inclui(podcasts2);
        preferidas.inclui(podcasts3);

    }


}
