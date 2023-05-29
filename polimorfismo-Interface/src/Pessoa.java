/**
 *
 * @author ana.cardoz
 */
public abstract class Pessoa {
    private String nome;
    double salario;
    
    public Pessoa(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void salario();

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario < 1000.0){
            System.out.println("Valor minimo invalido!");
        } else{
            this.salario = salario;   
        }
    }
    
    @Override
    public String toString(){
        return "\nNome: " + getNome()
               + "\nSalario: " + getSalario();
    }
}
