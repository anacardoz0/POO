
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ana.cardoz
 */
public class Disciplina {
    
    private String nome;
    private List<Aluno> alunos;
    
    public Disciplina(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
     public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }
    
}
