
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ana.cardoz
 */
public class Aluno {
    
    private String nome;
    private List<Disciplina> disciplinas;
    
    public Aluno(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
        disciplina.adicionarAluno(this);
    }
    
    public void removerDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
        disciplina.removerAluno(this);
    }
    
}
