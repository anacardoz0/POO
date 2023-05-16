package classes;

/**
 *
 * @author ana.cardoz
 */
public class Cliente extends Pessoa {
    private  double valorDivida;
    private int anoNasc;

    public Cliente(String nome, String sexo, int idade, double valorDivida, int anoNasc) {
        super(nome, sexo, idade);
        this.valorDivida = valorDivida;
        this.anoNasc = anoNasc;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome
                +"\nIdade: " + idade
                +"\nSexo: " + sexo
                +"\nValor da divida: " + valorDivida
                +"\nAno do nascimento: " + anoNasc;
    }
    
}
