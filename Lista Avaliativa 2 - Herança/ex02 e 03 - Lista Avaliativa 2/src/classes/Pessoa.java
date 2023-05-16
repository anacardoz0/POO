package classes;

/**
 *
 * @author ana.cardoz
 */
public class Pessoa {
    public String nome, sexo;
    public int idade;
    
    public Pessoa(String nome, String sexo, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    @Override
    public String toString(){
        return "---------------\nDADOS\n---------------\n\nNome: " + nome
                + "\nIdade: " + idade
                + "\nSexo: " + sexo;
    }}