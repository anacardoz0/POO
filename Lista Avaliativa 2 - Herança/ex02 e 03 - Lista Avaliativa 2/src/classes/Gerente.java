package classes;

/**
 *
 * @author ana.cardoz
 */
public class Gerente extends Empregado{
    private String nomeGerencia;

    public Gerente(String nome, String sexo, int idade, double salario, String matricula, 
    double salarioBase, int codSetor, String nomeGerencia) {
        super(nome, sexo, idade, salario, matricula, salarioBase, codSetor);
        this.nomeGerencia = nomeGerencia;
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
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
                +"\n Nome da Gerencia: " +nomeGerencia;
}
    
}