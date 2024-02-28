public class Main {
    public static void main(String[] args) {

        //Crie uma classe Calculadora com um método que recebe um número como
        //parâmetro e retorna o dobro desse número.

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(20);
        System.out.println(resultado);
    }
}