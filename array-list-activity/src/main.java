import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ana.cardoz
 */
public class main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       
       Pessoa p = new Pessoa();
       System.out.println("Digite seu nome: ");
       /*String nome = sc.nextLine();
       p1.setNome(nome);*/
       
       p.setNome(sc.nextLine()); 
       
       ArrayList<Telefone> telefone = new ArrayList<>();
       System.out.println("----------\nTELEFONES\n---------- ");
       for(int i = 0; i < 2; i++){
       Telefone t = new Telefone();
       System.out.println("Digite o numero: ");
       t.setNumero(sc.nextLine());
       //adiciona o telelfone na lista a cada interacao
       
       telefone.add(t);
       }
       p.setTel(telefone);
       p.imprimirPessoa();
    }
    
}