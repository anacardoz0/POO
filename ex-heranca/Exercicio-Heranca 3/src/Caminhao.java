
import java.util.Scanner;

/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 03*/
public class Caminhao extends Veiculo{
    
    private int toneladas;
    private int alturaMax;
    private int comprimento;
    
    public Caminhao() {
        this.toneladas = 0;
        this.alturaMax = 0;
        this.comprimento = 0;
    }
    
    public Caminhao(int numCilindro, int potencia, int peso, int velocMax, float preco, int toneladas, int alturaMax, int comprimento) {
        super(numCilindro, potencia, peso, velocMax, preco);
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }
    
    public void insertDados() {
        super.insertDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Toneladas: ");
        this.toneladas = scanner.nextInt();
        System.out.print("Altura Máxima: ");
        this.alturaMax = scanner.nextInt();
        System.out.print("Comprimento: ");
        this.comprimento = scanner.nextInt();
    }
    
    public void print() {
        super.print();
        System.out.println("Toneladas: " + this.toneladas);
        System.out.println("Altura Máxima: " + this.alturaMax);
        System.out.println("Comprimento: " + this.comprimento);
    }
    
}