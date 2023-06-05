import java.util.ArrayList;

/**
 *
 * @author ana.cardoz
 */
public class Professor extends Pessoa{
    private String titulacao;
    private double salario;
    private ArrayList<Curso> curso;

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<Curso> getCurso() {
        return curso;
    }

    public void setCurso(ArrayList<Curso> curso) {
        this.curso = curso;
    }

    public void imprimir(){
        System.out.println("\n-----DADOS PROFESSOR-----\n");
        super.imprimir();
        System.out.println( "Titulacao--> " + getTitulacao()
                          + "\nSalario--> " + getSalario());
        for(int i = 0; i < getCurso().size(); i++){
            getCurso().get(i).imprimirCurso();
        }
    }    
}
