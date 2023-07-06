/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 02*/
public class DVD {
    
    private String nome;
    private double preco;
    private int duracao;
    
    public DVD(String nome, double preco, int duracao) {
        this.nome = nome;
        this.preco = preco;
        this.duracao = duracao;
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

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    @Override
    public String toString() {
        return "\n\nDVD: " + nome + "\nPreço: " + preco + "\nDuração: " + duracao;
    }
    
}