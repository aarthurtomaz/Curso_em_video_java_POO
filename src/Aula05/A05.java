package Aula05;
public class A05 {
    static void main(String[] args) {
        Banco p1 = new Banco();
        p1.setNumConta(1212);
        p1.setDono("fulano");
        p1.abrirConta("CC");

        Banco p2 = new Banco();
        p2.setNumConta(3333);
        p2.setDono("Fulana");
        p2.abrirConta("CP");

        p1.depositar(634);
        p2.depositar(179);

        p1.estadoatual();
        p2.estadoatual();
    }
}

class Banco {
    //atributos
    public Integer numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private Boolean status;

    public void estadoatual(){
        System.out.println("=== ESTADO ATUAL DA CONTA ===");
        System.out.println("Número da Conta: " + this.getNumConta());
        System.out.println("Tipo de Conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$ " + this.getSaldo());
        System.out.println("Status: " + (this.getStatus() ? "Ativa" : "Inativa"));
        System.out.println("=============================");
    }

    //métodos personalizados
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")){
            this.setSaldo(50);
        } else if (t.equals("CP")){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não será fechada, pois ainda resta saldo");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta não será fechada, pois ainda resta saldo");
        } else{
            this.setStatus(false);
            System.out.println("Conta Fechada com sucesso!!");
        }
    }
    public void depositar(float v){
        if (this.getStatus()){
            //this.saldo = (int) (this.saldo + v);
            this.setSaldo((int) (this.getSaldo() + v));
            System.out.println("Deposito realizado com sucesso!");
        } else {
            System.out.println("impossivel depositar em uma conta fechada");
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >=v){
                this.setSaldo((int) (this.getSaldo() - v));
                System.out.println("Saque realizado na conta de"+ this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v =12;
        }else if (getTipo() == "CP"){
            v =20;
        }
        if (getStatus() == true){
            if (getSaldo() > v){
                setSaldo(getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso!");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel pagar");
        }
    }
    //métodos especiais
    public void ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    //getters e setters
    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
