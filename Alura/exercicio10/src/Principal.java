public class Principal {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Juliano");
        pessoa1.setIdade(28);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Julia");
        pessoa2.setIdade(15);

        pessoa1.exibeDados();
        pessoa1.verificarIdade();

        pessoa2.exibeDados();
        pessoa2.verificarIdade();
    }
}