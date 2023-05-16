package classes;

/**
 *
 * @author ana.cardoz
 */
public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public Administrador(String nome, String sexo, int idade, double salario, String matricula, 
    double salarioBase, int codSetor, double ajudaDeCusto) {
        super(nome, sexo, idade, salario, matricula, salarioBase, codSetor); 
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
     public double calcularSalario() {
        return calcularSalario() + ajudaDeCusto;
    }
    
     @Override
    public String toString() {
        return "Nome: " + nome
                + "\nIdade: " + idade
                + "\nSexo: " + sexo
                + "\nSalario: " + salario
                + "\nMatricula: "  + matricula
                + "\nSalario Base: " + salarioBase
                + "\nCodigo do Setor: " + codSetor
                + "\nAjuda de Custo: " + ajudaDeCusto;
    }
}