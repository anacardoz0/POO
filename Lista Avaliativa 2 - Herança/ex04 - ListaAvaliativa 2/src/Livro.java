/**
 *
 * @author ana.cardoz
 */
public class Livro {

    String titulo;
    String autor;
    String editora;
    int anoPubli;
    double preco;
    
    public Livro (String titulo, String autor, String editora, int anoPubli, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPubli = anoPubli;
        this.preco = preco;
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

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPubli() {
        return anoPubli;
    }

    public void setAnoPubli(int anoPubli) {
        this.anoPubli = anoPubli;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
   
    
}
