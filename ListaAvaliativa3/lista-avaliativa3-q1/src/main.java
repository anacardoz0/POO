/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 01*/
public class main {
    public static void main(String[] args) {
        
        CD cd = new CD(719945882, 29.99, "Coldplay", 12);
        DVD dvd = new DVD(909998891, 39.99, "Barbie: Vida de Sereia 2", 2);
        
        cd.printDados();
        System.out.println("--------------------");
        dvd.printDados();
        
        System.out.println("--------------------");
        
        CD novoCD = new CD(0, 0.0, "", 0);
        System.out.println("Inserir dados do novo CD:");
        novoCD.inserirDados();
        
        System.out.println("--------------------");
        
        System.out.println("Detalhes do novo CD: ");
        novoCD.printDados();
        
    }
    
}
