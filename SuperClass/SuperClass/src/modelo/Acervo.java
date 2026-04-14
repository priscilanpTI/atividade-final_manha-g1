package modelo;

public class Acervo {
    String autor;
    String titulo;
    int ano;

    public Acervo(String titulo, int ano){
        this.titulo = titulo;
        this.ano = ano;
    }

    public Acervo(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public Acervo() {
    }

    public void exibirInfo () {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
    }
}


