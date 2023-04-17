package classes;
//superclasse, classe generalista, classe pai
/**
 *
 * @author ana.ccardozo
 */
public class Funcionario {
    public String name, ct;
    public double salario, porcetagemComissao;
    public double totalVendas;
    
    //construtores
    public Funcionario(String name, String ct, double salario, double porcetagemComissao){
        setSalario(salario);
        this.name = name;
        this.ct = ct;
        this.porcetagemComissao = porcetagemComissao;
    }
    
    //metodo setters(modificadores) e getters(modificadores)
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 1400.0){
            System.out.println("Valor do salario INVALIDO!");
        }
        this.salario = salario;
    }

    public double getPorcetagemComissao() {
        return porcetagemComissao;
    }

    public void setPorcetagemComissao(double porcetagemComissao) {
        this.porcetagemComissao = porcetagemComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
    
    public double rendimento(){
        return salario + (totalVendas * porcetagemComissao);
    }
   
    //sobrescrita do método toString
    @Override
    public String toString(){
        return "--Dados Funcionario-- \nNome:" + name
              + "\nCarteira Trabalho: " + ct
              + "\nSalario: " + salario
              + "\nPorcentagem de Comissao: " + porcetagemComissao
              + "\nTotal de vendas: " + totalVendas ; 
    }
    
}
