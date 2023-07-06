
import java.util.Scanner;

/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 03*/
public class Veiculo extends Motor {
    
    private int peso;
    private int velocMax;
    private float preco;
    
    public Veiculo() {
        this.peso = 0;
        this.velocMax = 0;
        this.preco = 0.0f;
    }
    
    public Veiculo(int numCilindro, int potencia, int peso, int velocMax, float preco) {
        super(numCilindro, potencia);
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
    }
    
    public void insertDados() {
        super.insertDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Peso: ");
        this.peso = scanner.nextInt();
        System.out.print("Velocidade Máxima: ");
        this.velocMax = scanner.nextInt();
        System.out.print("Preço: ");
        this.preco = scanner.nextFloat();
    }
    
    public void print() {
        super.print();
        System.out.println("Peso: " + this.peso);
        System.out.println("Velocidade Máxima: " + this.velocMax);
        System.out.println("Preço: " + this.preco);
    
}
}