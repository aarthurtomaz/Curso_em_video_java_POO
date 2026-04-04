package Aula02;

public class A02{
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
