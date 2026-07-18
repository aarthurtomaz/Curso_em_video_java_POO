package Aula07;

public class A07 {
    static void main(String[] args) {
        Lutador[] L = new Lutador[]{
                new Lutador("Diddy boy", "França",67,1.50,69.0,11,4,9),
                new Lutador("Same", "Inferno", 24, 1.85, 84.29, 3,1,7),
                new Lutador("Sas", "Inter", 43, 1.70, 75.33, 6,6,6),
                new Lutador("Andre", "Cavalquante", 91, 1.63, 100.7, 5,5,7),
                new Lutador("capitãochupetão", "cucuias", 33, 1.97, 92.64, 10,1,0),
                new Lutador("paizao", "no seu coração", 19, 1.75, 54.1, 0,10,0),
        };

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(L[1], L[6]);
        UEC01.Lutar();
    }
}

class Lutador{
    //atributos
    private String nome;
    private String nacionalidade;
    private Integer idade;
    private Double altura;
    private Double peso;
    private String categoria;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;
//----------------------------------
    //metodos
    public void apresentar(){
        System.out.println("\\\\------------------||-----------------//");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: "  + this.getNacionalidade());
        System.out.println("Possui: "  + this.getIdade()  + " Anos");
        System.out.println("Altura: "  + this.getAltura() + "m");
        System.out.println("Pesando: " + this.getPeso()   + " kilos");
        System.out.println("Ganhou: "  + this.getVitorias());
        System.out.println("Perdeu: "  + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
        System.out.println("\\\\------------------||-----------------//");
    }
    public void status(){
        System.out.println(getNome());
        System.out.println("é um peso "  + getCategoria());
        System.out.println(getVitorias() + " vitorias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates()  + " empates");
    }
    public void ganharluta(){
        setVitorias(getVitorias() + 1);
        // ou this.vitorias = this.vitorias + 1;
    }
    public void perderluta(){
        setDerrotas(getDerrotas() + 1);
        // ou this.derrotas = this.derrotas + 1;
    }
    public void empatarluta(){
        setEmpates(getEmpates() + 1);
        // ou this.empates = this.empates + 1;
    }
    //--------------------------

    //metodos especiais
    public Lutador(String no, String na, Integer id, Double al, Double pe, Integer vi, Integer de, Integer em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (peso<52.2){
            categoria = "Invalida";
        } else if (peso <=70.3) {
            categoria = "Leve";
        } else if (peso <=83.9) {
            categoria = "Médio";
        } else if (peso <= 120.2) {
            categoria = "Peso pesado!";
        } else categoria ="Invalido";
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }


}

