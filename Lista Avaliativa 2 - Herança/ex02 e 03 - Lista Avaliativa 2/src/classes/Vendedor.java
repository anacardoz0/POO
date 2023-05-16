package classes;

/**
 *
 * @author ana.cardoz
 */
public class Vendedor extends Empregado{
    private double valorVendas;
    private int qntVendas;

    public Vendedor(String nome, String sexo, int idade, double salario, String matricula, 
    double salarioBase, int codSetor, double valorVendas, int qntVendas) {
        super(nome, sexo, idade, salario, matricula, salarioBase, codSetor);
        this.valorVendas = valorVendas;
        this.qntVendas = qntVendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
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
                +"\nValor de Vendas: " + valorVendas
                +"\nQuantidade de Vendas: " + qntVendas;
}
}