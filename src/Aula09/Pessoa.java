package Aula09;
public class Pessoa {
    //atributo
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    //método
    public void fazerAniversario(){
        this.idade++;
        System.out.println("Parabens, agora você tem "+idade+" anos!!");
    }

    public void status(){
        System.out.println("______Apresentação_____");
        System.out.println("nome: "+this.getNome());
        System.out.println("tem "+this.getIdade()+" anos");
        System.out.println("é um(a) "+this.getSexo()+".");
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
