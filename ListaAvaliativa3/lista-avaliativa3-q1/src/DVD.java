
import java.util.Scanner;

/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 01*/
public class DVD extends Midia{
    
    private int numFaixas;
    
    public DVD(int  codigo, double preco, String nome, int numFaixas) {
        super(codigo, preco, nome);
        this.numFaixas = numFaixas;
    }

    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }
    
    @Override
    public String getTipo() {
        return "DVD";
    }
    
    @Override
    public String getDetalhes() {
        return super.getDetalhes() + "\nNumero de Faixas: " + numFaixas;
    }
    
    @Override
    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero de Faixas: ");
        setNumFaixas(scanner.nextInt());
        numFaixas = scanner.nextInt();
    }
}