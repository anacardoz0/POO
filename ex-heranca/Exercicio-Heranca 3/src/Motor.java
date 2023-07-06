
import java.util.Scanner;

/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 03*/
public class Motor {
    
     private int numCilindro;
    private int potencia;
    
    public Motor() {
        this.numCilindro = 0;
        this.potencia = 0;
    }
    
    public Motor(int numCilindro, int potencia) {
        this.numCilindro = numCilindro;
        this.potencia = potencia;
    }
    
    public void insertDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de Cilindros: ");
        this.numCilindro = scanner.nextInt();
        System.out.print("Potência: ");
        this.potencia = scanner.nextInt();
    }
    
    public void print() {
        System.out.println("Número de Cilindros: " + this.numCilindro);
        System.out.println("Potência: " + this.potencia);
    }
}