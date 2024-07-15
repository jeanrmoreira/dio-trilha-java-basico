public class Livros {

    private String titulo;
    private String autor;
    private int ano;

    public Livros(int ano, String autor, String titulo) {
        this.ano = ano;
        this.autor = autor;
        this.titulo = titulo;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livros [titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + "]";
    }
    
}
