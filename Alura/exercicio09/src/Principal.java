public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(1);
        conta.setSaldo(1000);
        conta.titular = "Juliano";

        conta.exibeDados();
    }
}