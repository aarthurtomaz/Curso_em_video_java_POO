package Aula04;

public class A04 {

    public static void main(String[] args) {
       Caneta c1 = new Caneta("Nick", 0.6f,"Amarelo");
       c1.status();
    }
}

        //métodos especiais(com nomes especificos)

        /*metodos acessores (Getters)
        -aquele que pega aquela informação
        --------------------------------------------
        Getters
        e = new estante;
        t =e.GetTotDoc()
         -------------------------------------------
         Métodos modificadores (Setters)
         Setters
         e = new estante;
         e.setTotDoc (auquilo que esta sendo entregado)
         */


class Caneta {
    public String modelo;
    private double ponta;
    private String cor;
    private boolean tampada;


    public Caneta(String m, float p, String c){ //metodo construtor = mesmo nome da classe
        this.cor = c;
        this.modelo = m;
        this.ponta = p;
        this.tampar();
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }

    public double getPonta() {
        return this.ponta;
    }
    public void setPonta(double p) {
        this.ponta = p;
    }

    public boolean tampar(){
        this.tampada = true;
        return true;
    }

    public boolean destampar(){
        this.tampada = false;
        return false;
    }

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("modelo: "+ this.getModelo());
        System.out.println("ponta: "+ this.getPonta());
        System.out.println("Cor:"+ this.cor);
    }
}

