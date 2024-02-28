public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Número de avaliações: " + numAvaliacoes);
    }

    void avaliarMusica(double nota) {
        avaliacao = (avaliacao * numAvaliacoes + nota) / (numAvaliacoes + 1);
        numAvaliacoes++;
    }

    double calcularMediaAvaliacoes() {
        return avaliacao;
    }
}
