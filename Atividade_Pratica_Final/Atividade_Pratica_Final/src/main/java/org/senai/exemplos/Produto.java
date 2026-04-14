package org.senai.exemplos;

public abstract class Produto {
    private String titulo;
    private int anoLancamento;
    private boolean incluidoPlano;
    private double avaliacao;
    private int somaAvaliacoes;

    public Produto(String titulo, int anoLancamento, boolean incluidoPlano, double avaliacao, int somaAvaliacoes) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.incluidoPlano = incluidoPlano;
        this.avaliacao = avaliacao;
        this.somaAvaliacoes = somaAvaliacoes;
    }

    public int getAnoLancamento(int anoLancamento) {
        this.anoLancamento = "anoLancamento";
        return anoLancamento;
    }

    public void getAvaliacao(double nota) {
        somaAvaliacoes-=1;
        avaliacao += nota;
    }

    public String exibiMedia (){
        return "A média das avaliações é: " +  avaliacao + somaAvaliacoes;
    }

}
