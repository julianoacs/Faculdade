import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefao");
        meuFilme.setAnoDeLancamento (1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de Avaliacoes" + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpsodiosPorTemporada(10);
        lost.setMinutosPorEpsodio(50);
        System.out.println("Duracao em minutos: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

    }
}