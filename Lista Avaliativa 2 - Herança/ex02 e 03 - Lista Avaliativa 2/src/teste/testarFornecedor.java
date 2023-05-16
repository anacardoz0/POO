package teste;

import classes.Fornecedor;

/**
 *
 * @author ana.cardoz
 */
public class testarFornecedor {
    public static void main(String[] args) {
 
        Fornecedor fornecedor1 = new Fornecedor("João", "Masculino", 30, 5000.0, 2000.0);
        
        System.out.println("Nome: " + fornecedor1.getNome());
        System.out.println("Sexo: " + fornecedor1.getSexo());
        System.out.println("Idade: " + fornecedor1.getIdade());
        

        System.out.println("Valor do Crédito: " + fornecedor1.getValorCredito());
        System.out.println("Valor da Dívida: " + fornecedor1.getValorDivida());
        System.out.println("Saldo: " + fornecedor1.obterSaldo());
        

        fornecedor1.setValorCredito(6000.0);
        fornecedor1.setValorDivida(4000.0);
        
        System.out.println("Saldo atualizado: " + fornecedor1.obterSaldo());
        
    }
}