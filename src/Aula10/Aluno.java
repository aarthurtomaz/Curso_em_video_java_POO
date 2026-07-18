package Aula10;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String sexo, int idade, String nome) {
        super();
    }

    public Aluno() {

    }
    //metodo
    public void cancMatricula(){
        System.out.println("Matricula será Cancelada");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
