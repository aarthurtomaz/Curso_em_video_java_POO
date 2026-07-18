package Aula09;

public class Projetolivro {
    static void main() {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("fulano",22,"masculino");
        l[0] = new Livro("titulos insanos","autor mais ainda", 67, 1,false,p[0]);

        p[1] = new Pessoa("flunano",33,"a pensar");

    }
}
