
import java.util.Scanner;

/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 02*/
public class Restaurante extends Empresa{
    
    private String tipoComida;
    private double precoMedioPrato;
    
    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String fone, String tipoComida, double precoMedioPrato) {
        super(nome, endereco, cidade, estado, cep, fone);
        this.tipoComida = tipoComida;
        this.precoMedioPrato = precoMedioPrato;
    }
    
    public void insertDados() {
        super.insertData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tipo de Comida: ");
        this.tipoComida = scanner.nextLine();
        System.out.print("Preço Médio de um Prato: ");
        this.precoMedioPrato = scanner.nextDouble();
    }
    
    public void print() {
        super.print();
        System.out.println("Tipo de Comida: " + this.tipoComida);
        System.out.println("Preço Médio de um Prato: " + this.precoMedioPrato);
    }
}