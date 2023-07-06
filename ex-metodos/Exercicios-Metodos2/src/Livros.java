/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 02*/
public class Livros {
    
    private String nome;
    private double preco;
    private String autor;
    
    public Livros (String nome, double preco, String autor) {
        this.nome = nome;
        this.preco = preco;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    @Override
    public String toString() {
        return "\n\nLivro: " + nome + "\nPreço: " + preco + "\nAutor: " + autor;
    }
    
}
