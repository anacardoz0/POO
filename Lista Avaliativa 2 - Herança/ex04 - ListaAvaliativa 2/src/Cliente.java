/**
 *
 * @author ana.cardoz
 */
public class Cliente extends Livro{
    private String nomeC, endereco, telefone, email;

    public Cliente(String titulo, String autor, String editora, int anoPubli, double preco, int par2, int par3, String nome, String endereco, String telefone, String email) {
        super(titulo, autor, editora, anoPubli, preco);
        this.nomeC = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNomeC() {
        return nomeC;
    }

    public void setNomeC(String nomeC) {
        this.nomeC = nomeC;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
                
    
    @Override
    public String toString(){
        return "Nome: " + titulo
                + "\nAutor: " + autor
                + "\nEditora: " + editora
                + "\nAno da Publicacao: " + anoPubli
                + "\nPreço: " + preco
                + "\n---\nINF CLIENTES---\nNome Cliente: " + nomeC
                + "\nEndereco: " + endereco
                + "\nTelefone: " + telefone
                + "\nEmail: " + email;
                }
}
