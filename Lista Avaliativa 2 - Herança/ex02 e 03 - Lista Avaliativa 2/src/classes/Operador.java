package classes;

/**
 *
 * @author ana.cardoz
 */
public class Operador extends Empregado{
    private double valorProducao, comissao;

    public Operador(String nome, String sexo, int idade, double salario, String matricula, 
    double salarioBase, int codSetor, double valorProducao, double comissao) {
        super(nome, sexo, idade, salario, matricula, salarioBase, codSetor);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    public double calcularSalario() {
        return (calcularSalario() + valorProducao * comissao);
    }

     @Override
    public String toString(){
        return "Nome: " + nome
                +"\nIdade: " + idade
                +"\nSexo: " + sexo
                +"\nSalario: " + salario
                +"\nMatricula: "  + matricula
                +"\nCodigo do Setor: " + codSetor
                +"\nSalario Base: " + salarioBase
                +"Valor da produção: " + valorProducao
                +"Comissao: " + comissao;
}
    
}
