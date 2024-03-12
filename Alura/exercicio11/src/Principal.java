public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Computador");
        produto.setPreco(10000);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preco R$ " + produto.getPreco());

        produto.aplicarDesconto(15);
        System.out.println("Valor com Desconto R$ " + produto.getPreco());
    }
}