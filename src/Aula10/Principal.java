package Aula10;

public class Principal{
    static void main() {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Funcionario p3 = new Funcionario();
        Professor p4 = new Professor();

        p1.setNome("fulano");
        p2.setNome("Sim");
        p3.setNome("sabio");
        p4.setNome("mur");

        p1.setSexo("F");
        p2.setSexo("M");
        p3.setIdade(23);

        p4.setSalario(2500);
        p4.aumento(244);

        p2.setCurso("ADS");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
