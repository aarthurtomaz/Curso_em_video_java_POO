package Aula03;

public class caneta {
    public String modelo;
    public String cor;
    private Double ponta;
    protected Integer carga;
    protected Boolean tampada;

     public void status(){
         System.out.println("Modelo: " + this.modelo);
         System.out.println("Cor: " + this.cor);
         System.out.println("Ponta: " + this.ponta);
         System.out.println("Carga: " + this.carga + "%");
         System.out.println("Esta Tampada? " + this.tampada);
     }
    //método tampar
    private void tampar() {
        this.tampada = true;
    }

    // Método destampar
    private void destampar() {
        this.tampada = false;
    }
    //método rabiscar
    public void rabiscar(){
        if (tampada = false){
            System.out.println("Então você  rabisca");
        } else System.out.println("Então você não rabisca");
    }
}
