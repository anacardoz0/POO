/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 02*/
public class main {
    public static void main(String[] args) {
        
       Restaurante restaurante = new Restaurante();
        
        System.out.println("Inserir dados do Restaurante:");
        restaurante.insertDados();
        
        System.out.println("\nDados do Restaurante:");
        restaurante.print(); 
        
    }
    
}
