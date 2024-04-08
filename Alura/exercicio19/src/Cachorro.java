public class Cachorro extends Animal{
    private String nome;

    public Cachorro(String nome){
        this.nome = nome;
    }

    public Cachorro() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}