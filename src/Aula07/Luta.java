package Aula07;

import java.util.Random;

public class Luta {
    private Lutador Desafiante;
    private Lutador Desafiado;
    private int rounds;
    private boolean aprovado;

    //metodos tradicionais
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())
        && l1 != l2){
            this.aprovado = true;
            this.Desafiante = l1;
            this.Desafiado = l2;
        } else {
            this.aprovado = false;
            this.Desafiante = null;
            this.Desafiado = null;
        }
    }
    public void Lutar(){
        //atributos de batalha

        // === DESAFIANTE ===
        int pvDesafiante = (this.getDesafiante().getIdade() * 2);
           // Força baseada na Idade e Altura (Ex: 1.97 * 33 / 5 = ~13)
        int forcDesafiante = (int) ((this.getDesafiante().getAltura() * this.getDesafiante().getIdade()) / 5);
           // Defesa baseada levemente na Idade (Ex: 33 / 4 = ~8)
        int defDesafiante = (int) (this.getDesafiante().getIdade() / 4);

        // === DESAFIADO ===
        int pvDesafiado = (this.getDesafiado().getIdade() * 2);
        int forcDesafiado = (int) ((this.getDesafiado().getAltura() * this.getDesafiado().getIdade()) / 5);
        int defDesafiado = (int) (this.getDesafiado().getIdade() / 4);

        boolean turno = true;

        if (this.aprovado){
            System.out.println("DESAFIANTE!!");
            this.Desafiante.apresentar();
            System.out.println(this.Desafiante.getNome()+" tem um total de : "+ pvDesafiante+ "pontos de vida.");
            System.out.println("DESAFIADO!!!");
            this.Desafiado.apresentar();
            System.out.println(this.Desafiado.getNome()+" tem um total de : "+ pvDesafiado+ "pontos de vida.");

            Random d6 = new Random();
            int golpe, proteger,dano;

            while (pvDesafiado > 0 && pvDesafiante > 0) {
                //turno desafiado
                int luta = d6.nextInt(7);
                if (turno == true) {
                    switch (luta) {
                        case 6:
                            golpe = (int) ((luta + forcDesafiado) * 2);
                            System.out.println("um golpe critico!!");
                            break;
                        case 1:
                            golpe = (int) ((luta + forcDesafiado) / .2);
                            System.out.println("um golpe fraco");
                            break;
                        default:
                            golpe = luta + forcDesafiado;
                    }
                    switch (luta) {
                        case 6:
                            proteger = (int) ((luta + defDesafiante) * 2);
                            System.out.println("uma defesa critica!!");
                            break;
                        case 1:
                            proteger = (int) ((luta + defDesafiante) / .2);
                            System.out.println("uma defesa fraca");
                            break;
                        default:
                            proteger = luta + defDesafiante;
                    }

                    //interface de dano
                    dano = golpe - proteger;
                    if (dano > 0){
                        pvDesafiante -= dano;
                        System.out.println(this.Desafiado.getNome()+ " acertou um golpe!!!\n"+dano+" de dano!");
                        System.out.println(this.Desafiante.getNome()+" esta com "+pvDesafiante+" de vida");
                    } else {
                        System.out.println(this.Desafiado.getNome()+" tentou dar um golpe!");
                        System.out.println(this.Desafiante.getNome()+ " Desviou!!");
                    }
                     turno = false;
                } else {
                //turno desafiante
                   switch (luta){
                       case 6:
                           golpe = (int) ((luta + forcDesafiante) * 2);
                           System.out.println("um golpe critico!");
                           break;
                       case 1:
                           golpe = (int) ((luta + forcDesafiante) /.2);
                           System.out.println("um golpe fraco");
                           break;
                       default:
                           golpe = luta + forcDesafiante;
                   }
                   switch (luta){
                       case 6:
                           proteger = (int) ((luta + defDesafiado) * 2);
                           System.out.println("uma defesa critica!");
                           break;
                       case 1:
                           proteger = (int) ((luta + defDesafiado) /.2);
                           System.out.println("uma defesa fraca");
                           break;
                       default:
                           proteger = luta + defDesafiado;
                   }
                    //interface de dano
                    dano = golpe - proteger;
                    if (dano > 0){
                        pvDesafiado -= dano;
                        System.out.println(this.Desafiante.getNome()+ " acertou um golpe!!!\n"+dano+" de dano!");
                        System.out.println(this.Desafiado.getNome()+" esta com"+pvDesafiado+" de vida");
                    } else {
                        System.out.println(this.Desafiante.getNome()+" tentou dar um golpe!");
                        System.out.println(this.Desafiado.getNome()+ " Desviou!!");
                    }
                    turno = true;
                }
            }
             System.out.println("==========RESULTADO DA LUTA==========");
            //dados dos lutadores
            if (pvDesafiado <= 0){
                System.out.println("Vitoria de "+getDesafiante().getNome()+"!");
                this.getDesafiado().perderluta();
                this.getDesafiante().ganharluta();
                System.out.println("Atualizando status: ");
                this.getDesafiante().status();
            } else {
                System.out.println("Vitoria de "+getDesafiado().getNome()+"!");
                this.getDesafiante().perderluta();
                this.getDesafiado().ganharluta();
                System.out.println("Atualizando status: ");
                this.getDesafiado().status();
            }



            /*  switch (vencedor){
                case 0: //empate
                    System.out.println("EMPATE!!");
                    this.Desafiado.empatarluta();
                    this.Desafiante.empatarluta();
                    break;
                case 1: //desafiado vence
                    System.out.println("Vitoria do "+ this.Desafiado.getNome()+"!!");
                    this.Desafiado.ganharluta();
                    this.Desafiante.perderluta();
                    break;
                case 2: // desafiante vence
                    System.out.println("Vitoria do "+ this.Desafiante.getNome()+"!!");
                    this.Desafiante.ganharluta();
                    this.Desafiado.perderluta();
                    break;
            }*/
            System.out.println("==============================");
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }

    //metodos especiais
    public void setDesafiado(Lutador desafiado) {
        Desafiado = desafiado;
    }

    public Lutador getDesafiado() {
        return Desafiado;
    }

    public Lutador getDesafiante() {
        return Desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        Desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}

