package teste;

import modelo.Acervo;
import modelo.Livro;

public class Main {
    public static void main(String[] args) {

        Acervo revista1 = new Acervo("TI SENAI", "Gustavo Alves", 2020);
        Livro revista2 = new Livro("Java Básico", "João Silva", 2023, 300);

        revista1.exibirInfo();
        revista2.exibirDetalhes();
    }
}
