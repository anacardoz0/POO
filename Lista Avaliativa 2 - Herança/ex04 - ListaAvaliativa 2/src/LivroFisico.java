/**
 *
 * @author ana.cardoz
 */
public class LivroFisico extends Livro {
    private int numPag;
    private double peso;
    private String tipoCapa;

    public LivroFisico(String titulo, String autor, String editora, int anoPubli, double preco, int numPag, double peso, String tipoCapa) {
        super(titulo, autor, editora, anoPubli, preco);
        this.numPag = numPag;
        this.peso = peso;
        this.tipoCapa = tipoCapa;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipoCapa() {
        return tipoCapa;
    }

    public void setTipoCapa(String tipoCapa) {
        this.tipoCapa = tipoCapa;
    }
    
    @Override
    public String toString(){
        return "Nome: " + titulo
                + "\nAutor: " + autor
                + "\nEditora: " + editora
                + "\nAno da Publicacao: " + anoPubli
                + "\nPreço: " + preco
                + "\nNumero de paginas: " + numPag
                + "\nPeso: " + peso
                + "\nTipo de Capa: " + tipoCapa;
    }
    
}
