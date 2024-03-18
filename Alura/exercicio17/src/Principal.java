import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Batata", 10 , 50);
        Produto produto2 = new Produto("Tomate", 10 , 50);
        Produto produto3 = new Produto("Alface", 10 , 50);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println(listaDeProdutos.size());
        System.out.println(listaDeProdutos.get(1).getNome());

        for (Produto produto : listaDeProdutos) {
            System.out.println(produto);
        }

        System.out.println(produto1);
    }
}