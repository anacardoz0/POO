import java.util.ArrayList;

/**
 *
 * @author ana.cardoz
 */
public class Pessoa {
    private String nome, cpf, email;
    private ArrayList<Telefone> telefone;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(ArrayList<Telefone> telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
        public void imprimir(){
        System.out.println( "\n--------PESSOA\n--------\nNome--> " + getNome()
                          + "\nCPF--> " + getCpf()
                          + "\nEmail--> " + getEmail());
        getEndereco().imprimirEndereco();
        
        for(int i = 0; i < getTelefone().size(); i++){
            getTelefone().get(i).imprimirTelefone();
        }
    }
}