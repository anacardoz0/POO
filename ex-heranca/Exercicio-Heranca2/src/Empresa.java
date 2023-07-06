
import java.util.Scanner;

/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 02*/
public class Empresa {
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String fone;
    
    public Empresa() {
    }
    
    public Empresa(String nome, String endereco, String cidade, String estado, String cep, String fone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.fone = fone;
    }
    
    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        this.nome = scanner.nextLine();
        System.out.print("Endereço: ");
        this.endereco = scanner.nextLine();
        System.out.print("Cidade: ");
        this.cidade = scanner.nextLine();
        System.out.print("Estado: ");
        this.estado = scanner.nextLine();
        System.out.print("CEP: ");
        this.cep = scanner.nextLine();
        System.out.print("Fone: ");
        this.fone = scanner.nextLine();
    }
    
    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Estado: " + this.estado);
        System.out.println("CEP: " + this.cep);
        System.out.println("Fone: " + this.fone);
    }
}