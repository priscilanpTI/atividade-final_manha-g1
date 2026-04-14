package teste;

import modelo.Acervo;
import modelo.Livro;

public class Main {
    public static void main(String[] args) {
        Livro revista1 = new Livro("Teste livro 1", 2026, "Natália", 2);
        Livro revista2 = new Livro("Teste livro 2", 2026, "Natália", 3);

        revista1.exibirDetalhes();
    }
}
