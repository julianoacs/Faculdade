public class Exercicio6 {
    public static void main(String[] args){
        double precoOriginal = 150;
        double percentualDeDesconto = 10.0;
        double valorDesconto = (percentualDeDesconto/100) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto: R$" + novoPreco);
    }
}
