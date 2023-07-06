/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 02*/
public class CD {
    
    private String nome;
    private double preco;
    private int numFaixas;
    
    public CD(String nome, double preco, int numFaixas) {
        this.nome = nome;
        this.preco = preco;
        this.numFaixas = numFaixas;
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

    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }
    
    @Override
    public String toString() {
        return "\n\nCD: " + nome + "\nPreço: " + preco + "\nNúmero de Faixas: " + numFaixas;
    }
    
}
