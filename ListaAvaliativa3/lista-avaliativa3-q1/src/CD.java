
import java.util.Scanner;

/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 01*/
public class CD extends Midia{
    
    private int numMusicas;
    
    public CD(int  codigo, double preco, String nome, int numMusicas) {
        super(codigo, preco, nome);
        this.numMusicas = numMusicas;
    }

    public int getnumMusicas() {
        return numMusicas;
    }

    public void setnumMusicas(int numMusicas) {
        this.numMusicas = numMusicas;
    }
    
    @Override
    public String getTipo() {
        return "CD";
    }
    
    @Override
    public String getDetalhes() {
        return super.getDetalhes() + "\nNúmero de Musicas: " + numMusicas;
    }
    
    @Override
    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero de Musicas: ");
        setnumMusicas(scanner.nextInt());
        numMusicas = scanner.nextInt();
    }
    
}
