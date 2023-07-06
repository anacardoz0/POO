
import java.util.Scanner;

/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 02*/
public class Carro extends Veiculo{
    
    private double km;
    
    public Carro(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
    
    public void insertDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Modelo: ");
        modelo = scanner.nextLine();
        System.out.print("Preço: ");
        preco = scanner.nextDouble();
        System.out.print("Quilometragem: ");
        km = scanner.nextDouble();
    }
    
}
