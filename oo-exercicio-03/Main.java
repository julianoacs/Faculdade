public class Main {
    public static void main(String[] args) {

        //Crie uma classe Musica com atributos titulo, artista, anoLancamento,
        //avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica,
        // avaliar a música e calcular a média de avaliações.

        Musica musica = new Musica();
        musica.titulo = "Bohemian Rhapsody";
        musica.artista = "Queen";
        musica.anoLancamento = 1975;
        musica.avaliacao = 5.0;
        musica.numAvaliacoes = 1;

        musica.exibirFichaTecnica();

    }
}