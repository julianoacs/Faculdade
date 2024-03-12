public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numeroDeAvaliacoes;

    void avalia(double nota){
        avaliacao += nota;
        numeroDeAvaliacoes++;
    }

    double pegaMedia(){
        return avaliacao / numeroDeAvaliacoes;
    }

    void exibeFichaTecnica(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lancamento: " + anoDeLancamento);
        System.out.println("Avaliacao: " + pegaMedia());
    }

}
