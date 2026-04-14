package teste;

import modelo.Acervo;
import modelo.Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("O Rei Matheus", 2025, "Matheus Gustavo", 10);

        livro.exibirDetalhes();
    }
}
