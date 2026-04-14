package teste;

import modelo.Livro;

public class Main {
    public static void main(String[] args) {
        //comentario
        Livro livro1 = new Livro("Título", 2024, "Autor", 100);
        Livro livro2 = new Livro("Outro Título", 2025, "Outro Autor", 120);

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}
