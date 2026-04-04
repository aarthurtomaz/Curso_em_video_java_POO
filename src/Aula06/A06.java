package Aula06;

public class A06 {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.play();
        c.maisVolume();
        c.abrirMenu();

    }
}
//encapsulamento
abstract class Controlador{
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}

class ControleRemoto extends Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public void Construtor(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

 //----------------------------------------------
    private int getVolume(){
        return volume;
    }
    private boolean getLigado(){
        return ligado;
    }
    private boolean getTocando(){
        return tocando;
    }
//-------------------------------------------------
    private void setVolume(int v){
        this.volume = v;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }

    private void setTocando(boolean t){
        this.tocando = t;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-------- MENU --------");
        System.out.println("esta ligado? " + this.getLigado());
        System.out.println("esta tocando? " + this.getTocando());
        System.out.println("volume: "+ this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.println("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getVolume() > 0 && this.getLigado()){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}
