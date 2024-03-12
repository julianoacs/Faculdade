public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.titulo = "It was a Good Day";
        musica.artista = "Ice Cube";
        musica.anoDeLancamento = 1992;

        musica.avalia(8);
        musica.avalia(5);
        musica.avalia(9);

        musica.exibeFichaTecnica();

    }
}