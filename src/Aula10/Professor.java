package Aula10;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public Professor(String especialidade, int salario) {
        super();
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public Professor() {
        super();
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void aumento(float aum){
        this.salario = (salario + aum);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
