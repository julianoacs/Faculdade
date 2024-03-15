import java.util.Scanner;
public class ContaBancaria {
    public static void main(String[] args) {
        String nome = "Juliano Silva";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        System.out.println("************************");
        System.out.println("Dados da Conta");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo da Conta: R$ " + saldo);
        System.out.println("\n************************");

        String menu = """
                ** Digite sua opcao **
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                """;
        Scanner teclado = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = teclado.nextInt();

            if (opcao == 1){
                System.out.println("Saldo da Conta: R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir");
                double valor = teclado.nextDouble();
                if (valor >= saldo) {
                    System.out.println("Nao ha saldo para realizar a transferencia");
                } else {
                    saldo = saldo - valor;
                    System.out.println("Saldo da conta atualizado: R$ " + saldo);
                }
            } else if (opcao ==3) {
                System.out.println("Valor a receber: ");
                double valor = teclado.nextDouble();
                saldo = saldo + valor;
                System.out.println("Saldo da conta atualizado: R$ " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opcao Invalida");
            }
        }
    }
}
