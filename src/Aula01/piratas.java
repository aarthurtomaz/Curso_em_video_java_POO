package Aula01;

class pirata{
    String nome;
    String raça;
    String rank;
    Integer recompensa;


    //metodos de rank
    public void rank(){
        if (this.recompensa <= 10000){
            this.rank = "Buxa";
        } else if (this.recompensa <= 50000) {
            this.rank = "Perigo";
        } else if (this.recompensa >= 100000) {
            this.rank = "Coisa ruim";
        }
    }

    //metodo status
    public void status(){
        System.out.println("______|Status do Pirata!|______");
        System.out.println("Pirata: "+nome);
        System.out.println("Ele é um "+raça);
        System.out.println("Recompensa de: "+recompensa+" Berrys!");
        System.out.println("Nivel de perigo: "+rank);
        System.out.println("_______________________________");
    }
}

public class piratas {
    static void main() {
        pirata teste = new pirata();
        teste.nome = "Luffy";
        teste.raça = "humano";
        teste.recompensa = 5000;
        teste.rank();
        teste.status();

        pirata teste2 = new pirata();
        teste2.nome = "Jinbe";
        teste2.raça = "Homem-Peixe";
        teste2.recompensa = 3000000;
        teste2.rank();
        teste2.status();
    }
}
