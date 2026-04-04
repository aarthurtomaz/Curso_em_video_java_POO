package Aula02;

public class caneta{
     public String modelo;
     public String cor;
     Double ponta;
     Integer carga;
     Boolean tampada;

    //método tampar
    public void tampar() {
        this.tampada = true;
    }

    // Método destampar
    public void destampar() {
        this.tampada = false;
    }
    //método rabiscar
    public void rabiscar(){
        if (tampada = false){
            System.out.println("erro");
        } else System.out.println("rabisca");
    }

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Tampada: " + this.tampada);
    }
}
