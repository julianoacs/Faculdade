public class Aluno {
    private String aluno;
    private double nota1;
    private double nota2;
    private double nota3;

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calculaMedia(){
        return (nota1 + nota2 + nota3) / 3;
    }

    public void exibeInformacoes(){
        System.out.println("Nome: " + aluno);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 1: " + nota2);
        System.out.println("Nota 1: " + nota3);
        System.out.println("Media: " + calculaMedia());
    }
}
