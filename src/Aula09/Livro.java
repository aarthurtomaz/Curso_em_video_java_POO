package Aula09;

public class Livro {
    public String titulo;
    public String autor;
    public Integer totPaginas;
    public Integer pagAtual;
    public Boolean aberto;
    public Pessoa leitor;

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", totPaginas=" + totPaginas +
                ", pagAtual=" + pagAtual +
                ", aberto=" + aberto +
                ", leitor=" + leitor +
                '}';
    }

    //construtor
    public Livro(String titulo, String autor, Integer totPaginas, Integer pagAtual, Boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }

    //metodos
    public void abrir(){
        this.aberto = true;
        System.out.println("O livro foi Aberto");
    }
    public void fechar(){
        this.aberto = false;
        System.out.println("O livro foi fechado");
    }

    public void folhear(int p){
        this.pagAtual = p;
    }
    public void avancarPag(){
        this.pagAtual++;
    }
    public void voltarPag(){
        this.pagAtual--;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(Integer totPaginas) {
        this.totPaginas = totPaginas;
    }

    public Integer getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(Integer pagAtual) {
        this.pagAtual = pagAtual;
    }

    public Boolean getAberto() {
        return aberto;
    }

    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

}
