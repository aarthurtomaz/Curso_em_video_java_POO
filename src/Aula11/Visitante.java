package Aula11;

public class Visitante extends Pessoa{
    static void main() {
        Visitante v1 = new Visitante();
        v1.setNome("PODECRE");
        v1.setIdade(7);
        v1.setSexo("minutozz");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("AHAM");
        a1.setMatricula(7777777);
        a1.setCurso("UIEEEEE");
        a1.setIdade(77);
        a1.setSexo("M");
        a1.pagMensalidade();
    }
}
