package Aula01;

class caneta{
     String modelo;
     String cor;
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
}
public class A01{
    static void main(String[] args) {
        caneta c1 = new caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5;
        c1.tampada = false;
        c1.rabiscar();


        caneta c2 = new caneta();
        c2.cor = "Vermelho";
        c2.ponta = 1.0;
        c2.tampada = false;
        c2.tampar();
    }
}
