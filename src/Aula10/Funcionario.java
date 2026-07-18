package Aula10;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public Funcionario(String setor, boolean trabalhando) {
        super();
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public Funcionario() {
        super();
    }

    public void trabalhando(){
        if (trabalhando = true){
            System.out.println("esta trabalhando");
        } else System.out.println("esta desempregado");
    }

    public void mudarTrabalho(){
        this.trabalhando = !this.trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
