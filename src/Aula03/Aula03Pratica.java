package Aula03;

import Aula03.caneta;

public class Aula03Pratica {
    static void main(String[] args) {
        caneta c1 = new caneta();
        c1.modelo = "bic crystal";
        c1.cor = "rosa";
        //c1.ponta = 0.3;
        c1.carga = 80;
        c1.tampada = true;
        c1.status();
        c1.rabiscar();
    }
}
