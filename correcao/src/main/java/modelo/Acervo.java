package modelo;

public abstract class Acervo {

    String titulo;
    int ano;

    public Acervo(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + ano);
    }
}