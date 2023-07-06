import java.time.LocalDate;

/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 01*/
public class Pessoa {
    private String nome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private int idade;
    
    public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.idade = 0;
}


public void calcularIdade(int diaAtual, int mesAtual, int anoAtual) {
        LocalDate dataNascimento = LocalDate.of(this.anoNascimento, this.mesNascimento, this.diaNascimento);
        LocalDate dataAtual = LocalDate.of(anoAtual, mesAtual, diaAtual);
        this.idade = dataAtual.getYear() - dataNascimento.getYear();
        
        if (dataAtual.getMonthValue() < dataNascimento.getMonthValue() ||
            (dataAtual.getMonthValue() == dataNascimento.getMonthValue() && dataAtual.getDayOfMonth() < dataNascimento.getDayOfMonth())) {
            this.idade--;
        }
    }
    
    public int informarIdade() {
        return this.idade;
    }
    
    public String toString() {
        return "Nome: " + this.nome + ", Idade: " + this.idade;
    }
}