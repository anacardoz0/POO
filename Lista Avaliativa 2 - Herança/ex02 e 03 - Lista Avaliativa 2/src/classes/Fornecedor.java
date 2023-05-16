package classes;

/**
 *
 * @author ana.cardoz
 */
public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String sexo, int idade, double valorCredito, double valorDivida) {
        super(nome, sexo, idade);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    public double obterSaldo(){
        return valorCredito - valorDivida;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome
                + "\nIdade: " + idade
                + "\nSexo: " + sexo
                + "\nValor de Crédito: " + valorCredito
                + "\nValor de Dívida: " + valorDivida;
    }
    
}
