package modelo;

public class Livro extends Acervo {
    private String autor;
    private int paginas;

    public Livro(String titulo, int ano, String autor, int paginas) {
        super(titulo, ano);
        this.autor = autor;
        this.paginas = paginas;
    }


    public boolean exibirDetalhes() {
        exibirInfo();
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        return false;
    }

    public static void main(String[] args) {

    }
}