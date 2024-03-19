import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("C++");
        lista.add("C#");
        lista.add("C");
        for (String listaLinguagens : lista){
            System.out.println("Linguagem: " + listaLinguagens);
        }
    }
}