/**
 *
 * @author ana.cardoz
 */
public class Gerente extends Funcionario{
    
    public Gerente(String nome, double salario, double SalarioFamilia, String matricula) {
        super(nome, salario, SalarioFamilia, matricula);
    }
    
    @Override
    public double salario(double salario){
        double gratificacao = 0.10;
        return salario + (salario + gratificacao);
    }
    
    public String toString(){
        return "\nFuncionario: " + super.toString()
             + "\nSalario do Gerente: " + getSalario();
    }
}
