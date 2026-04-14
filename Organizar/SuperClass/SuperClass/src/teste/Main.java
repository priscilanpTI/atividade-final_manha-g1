package teste;
import modelo.Livro;
import modelo.Acervo;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Java Básico", 200);
        Livro livro2 = new Livro("Java Básic", 201);

        System.out.println(Livro.exibirDetalhes());
    }
}
