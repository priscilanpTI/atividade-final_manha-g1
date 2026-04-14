package modelo;

public class Livro extends Acervo {

    int paginas;

    public Livro(String titulo, String autor, int ano, int paginas) {
        super(titulo, autor, ano);
        this.paginas = paginas;
    }

    public void exibirDetalhes() {
        exibirInfo();
        System.out.println("Páginas: " + paginas);
    }

    public static void main(String[] args) {
        Livro livro = new Livro("Java básico", "Joao Silva", 2023, 300);
        livro.exibirDetalhes();
    }
}

