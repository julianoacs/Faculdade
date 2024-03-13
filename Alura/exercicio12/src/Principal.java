public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setTitulo("Código Limpo");
        livro.setAutor("Robert Cecil Martin");

        livro.exibirDetalhes();

    }
}