import java.util.ArrayList;

/**
 *
 * @author ana.cardoz
 */
public class Aluno extends Pessoa{
    private Curso curso;
    private ArrayList<Double>notas;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
    
    public double calcularMedia(){
        double soma = 0;
        for(double nota : getNotas()){
            soma += nota;
        }
        double media = soma / notas.size();
        return media;
    }
    
    public void imprimir(){
        System.out.println("\n-----DADOS ALUNOS-----\n");
        super.imprimir();
        getCurso().imprimirCurso();
        for(int i = 0; i < getNotas().size(); i++){
            System.out.println(getNotas().get(i).toString());
        }
        System.out.println("\nMedia Final--> " + calcularMedia());
    }
}