/**
 *
 * @author ana.cardoz
 */
public class Funcionario extends Pessoa{
    private double SalarioFamilia;
    private String matricula;

    public Funcionario(String nome, double salario, double SalarioFamilia, String matricula) {
        super(nome, salario);
        this.SalarioFamilia = SalarioFamilia;
        this.matricula = matricula;
    }

    public double salario(double salario) {
        return salario + (super.getSalario() * SalarioFamilia); 
    }

    public double getSalarioFamilia() {
        return SalarioFamilia;
    }

    public void setSalarioFamilia(double SalarioFamilia) {
        if(SalarioFamilia < 0 ){
            System.out.println("Valor Invalido!");
        } else{
            this.SalarioFamilia = SalarioFamilia;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String toString(){
        return "--------------------\n| Matricula: " + getMatricula()
             + "|\n--------------------"
             + "\nFUNCIONARIO" + super.toString()
             + "\nSalario Familia: " + getSalarioFamilia()
             + "\nSalario: " + salario;
    }

    @Override
    public void salario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
