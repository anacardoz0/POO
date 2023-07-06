/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 01*/
public class main {
    public static void main(String[] args) {
   
        Pessoa Einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa Newton = new Pessoa("Isaac Newton", 4, 1, 1643);
        
        int diaAtual = 6;
        int mesAtual = 7;
        int anoAtual = 2023;
        
        Einstein.calcularIdade(diaAtual, mesAtual, anoAtual);
        Newton.calcularIdade(diaAtual, mesAtual, anoAtual);
        
        System.out.println("Idade de Einstein: " + Einstein.informarIdade());
        System.out.println("Idade de Newton: " + Newton.informarIdade());
    }
    
}
