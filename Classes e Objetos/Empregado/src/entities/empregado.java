package entities;

/**
 *
 * @author ana.cardoz
 */
public class empregado {

    public empregado(String daniel, String rock, double par) {
    }
    
    public String nome, sobrenome;
    public double salary;
    
    public void setnome(String nome){
        this.nome = nome;
    }
    public String getnome(){
        return nome;
    }
    
    public void setsobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getsobrenome(){
        return sobrenome;
    }
    
    public void setsalary(double salary){
        if(salary > 0){
        this.salary = salary;
        } else {
            System.out.println("Salário Inválido!");
        }
    }

    public double getsalary() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

