public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setAluno("Juliano");
        aluno.setNota1(5);
        aluno.setNota2(8);
        aluno.setNota3(10);

        aluno.exibeInformacoes();
    }
}