package modelo;
import modelo.Acervo;
public class Livro {
    String titulo;
    int paginas;

    public Livro(String JavaB, int p) {
        this.JavaB = titulo;
        this.p = paginas;
    }

    public void exibirDetalhes() {
        exibirDetalhes();
        System.out.println("Título: " + titulo);
        System.out.println("paginas: " + paginas);
    }

    public static void main(String[] args) {
        Livro livro = new Livro("Java Básico", 200);
        Livro.exibirDetalhes();
    }
}
