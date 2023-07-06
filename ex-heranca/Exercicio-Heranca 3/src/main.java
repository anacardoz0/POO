/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 03*/
public class main {
    public static void main(String[] args) {
        
        CarroPasseio carro = new CarroPasseio();
        
        System.out.println("Inserir dados do Carro de Passeio:");
        carro.insertDados();
        
        System.out.println("\nDados do Carro de Passeio:");
        carro.print();
        
        System.out.println("-------------------------");
        
        Caminhao caminhao = new Caminhao();
        
        System.out.println("Inserir dados do Caminhão:");
        caminhao.insertDados();
        
        System.out.println("\nDados do Caminhão:");
        caminhao.print();
        
    }
    
}
