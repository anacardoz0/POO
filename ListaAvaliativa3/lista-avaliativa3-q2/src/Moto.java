
import java.util.Scanner;

/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 02*/
public class Moto extends Veiculo{
    
    private int ano;
    
    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void insertDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Modelo: ");
        modelo = scanner.nextLine();
        System.out.print("Preço: ");
        preco = scanner.nextDouble();
        System.out.print("Ano: ");
        ano = scanner.nextInt();
    }
    
}
