package org.senai.exemplos;

public class Filme extends Produto {


    public Filme(String titulo, int anoLancamento, boolean incluidoPlano, double avaliacao, int somaAvaliacoes) {
        super(titulo, anoLancamento, incluidoPlano, avaliacao, somaAvaliacoes)

    }

    @Override
    public int getAnoLancamento(int anoLancamento) {
        return super.getAnoLancamento(anoLancamento);
    }

    @Override
    public void getAvaliacao(double nota) {
        super.getAvaliacao(nota);
    }

    @Override
    public String exibiMedia() {
        return super.exibiMedia();
    }

    @Override
    public String toString() {
        return "Filme{}";
    }
}
