

package modelo;

public class LivroAcervo {
    String titulo;
    int ano;
    String autor;


    public LivroAcervo(String titulo, int ano, String autor, int paginas) {
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;

    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + ano);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }

    public static void main(String[] args) {
        LivroAcervo livro = new LivroAcervo("Java Básico", 2020, "João Silva", 300);
        livro.exibirDetalhes();
    }
}
esse ok