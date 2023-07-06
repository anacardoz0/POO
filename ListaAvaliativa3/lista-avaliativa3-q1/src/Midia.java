
import java.util.Scanner;

/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 01*/
public class Midia {
    
    private int codigo;
    private double preco;
    private String nome;
    
    public Midia(int  codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public int  getCodigo() {
        return codigo;
    }

    public void setCodigo(int  codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTipo() {
        return "Midia";
    }
    
    public String getDetalhes() {
        return "Codigo: " + codigo + "\nPreço: " + preco + "\nNome: " + nome;
    }
    
    public void printDados() {
        System.out.println("\nTipo: " + getTipo());
        System.out.println("\nDetalhes: " + getDetalhes());
    }
    
    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Codigo: ");
        codigo = scanner.nextInt();
        System.out.print("Preço: ");
        preco = scanner.nextDouble();
        System.out.print("Nome: ");
        nome = scanner.nextLine();
    }
    
}
