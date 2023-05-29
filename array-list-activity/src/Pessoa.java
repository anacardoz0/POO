
import java.util.ArrayList;

/**
 *
 * @author ana.cardoz
 */
public class Pessoa {
    private String nome;
    private ArrayList<Telefone> tel = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Telefone> getTel() {
        return tel;
    }

    public void setTel(ArrayList<Telefone> tel) {
        this.tel = tel;
    }
    
    public void imprimirPessoa(){
        System.out.println("Nome: " + getNome());
        System.out.println("\nTelefones: ");
        for(int i = 0; i < getTel().size();){
            getTel().get(i).imprimirTelefone();
        }
    }
    
}