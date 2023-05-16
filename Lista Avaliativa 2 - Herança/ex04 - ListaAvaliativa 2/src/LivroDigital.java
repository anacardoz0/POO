/**
 *
 * @author ana.cardoz
 */
public class LivroDigital extends Livro{
    private int numPag;
    private String tamArquivo, formatArq;

    public LivroDigital(String titulo, String autor, String editora, int anoPubli, double preco,
    int numPag, String tamArquivo, String formatArq) {
        super(titulo, autor, editora, anoPubli, preco);
        this.numPag = numPag;
        this.tamArquivo = tamArquivo;
        this.formatArq = formatArq;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getTamArquivo() {
        return tamArquivo;
    }

    public void setTamArquivo(String tamArquivo) {
        this.tamArquivo = tamArquivo;
    }

    public String getFormatArq() {
        return formatArq;
    }

    public void setFormatArq(String formatArq) {
        this.formatArq = formatArq;
    }
    
    @Override
    public String toString(){
        return "Nome: " + titulo
                + "\nAutor: " + autor
                + "\nEditora: " + editora
                + "\nAno da Publicacao: " + anoPubli
                + "\nPreço: " + preco
                + "\nNumero de paginas: " + numPag
                + "\nTamanho do Arquivo: " + tamArquivo
                + "\nFormato do Arquivo: " + formatArq;
    }
    
}
