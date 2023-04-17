package classes;
/**
 *
 * @author ana.cardoz
 */
public class Gerente extends Funcionario {
    
    private String departamento;
    private double bonus = 0.1;
    
    //construtor da subclasse

    public Gerente(String name, String ct, double salario, double porcetagemComissao, double totalVendas, String departamento) {
        super(name, ct, salario, porcetagemComissao);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //sobrescrits de métodos = forma de polimorfismo
    public double rendimento(){
        return salario + (salario * bonus);
    }
    
     public String toString(){
        return "--Dados Funcionario-- \nNome:" + name
              + "\nCarteira Trabalho: " + ct
              + "\nSalario: " + salario
              + "\nPorcentagem de Comissao: " + porcetagemComissao
              + "\nTotal de vendas: " + totalVendas ; 
    }
    }