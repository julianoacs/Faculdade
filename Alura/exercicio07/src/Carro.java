public class Carro {
    String modelo;
    int ano;
    String cor;

    int idadeCarro(){
        return 2024 - ano;
    }

    void exibeFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Idade do Veiculo: " + idadeCarro());
    }
}
