package Aula11;

public class Bolsista extends Aluno{
    private float bolsa;

    public void renovBolsa(){
        System.out.println("Bolsa renovada");
    }

    @Override
    public void pagMensalidade() {
        System.out.println("mensalidade paga");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
