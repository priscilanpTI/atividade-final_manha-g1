package modelo;

public class Livro extends Acervo {

    String autor;
    int paginas;

    public Livro(String titulo, int ano, String autor, int paginas) {
        super(titulo, ano);
        this.autor = autor;
        this.paginas = paginas;
    }

    public void exibirDetalhes() {
        exibirInfo();
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }

    public static void main(String[] args) {
        Livro livro = new Livro("Java Básico", 2020, "João Silva", 300);
        livro.exibirDetalhes();
    }
}