package classes;

/**
 *
 * @author ana.cardoz
 */
public class Empregado extends Pessoa{
    double salario;
    double salarioBase;
    String matricula;
    int codSetor;
    

    public Empregado(String nome, String sexo, int idade, double salario, String matricula, 
    double salarioBase, int codSetor) {
        super(nome, sexo, idade);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public double valorINSS(){
        return salario * 0.11;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getCodSetor() {
        return codSetor;
    }

    public void setCodSetor(int codSetor) {
        this.codSetor = codSetor;
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome
                +"\nIdade: " + idade
                +"\nSexo: " + sexo
                +"\nSalario: " + salario
                +"\nMatricula: "  + matricula
                +"Codigo do Setor: " + codSetor
                +"Salario Base: " + salarioBase;
}
    
}
