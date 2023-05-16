package application;
import classes.Pessoa;
import classes.Cliente;
import classes.Empregado;
import classes.Gerente;
import classes.Vendedor;
import classes.Administrador;
import classes.Operador;
/**
 *
 * @author ana.cardoz
 */
public class main {
    public static void main(String[] args) {
        Pessoa cliente = new Cliente("Maria", "Feminino", 20, 1000, 2003);
        System.out.println("---------------\nDADOS CLIENTE\n---------------\n" + cliente.toString());
        
        Empregado gerente = new Gerente("Bruna","Feminino", 28, 5000, "2098788", 
        2500, 2,"Vendas");
        double inss = gerente.valorINSS();
        System.out.println("---------------\nDADOS GERENTE\n---------------\n" + gerente.toString());
        System.out.println("Valor do INSS: " + inss);
        
        Empregado vendedor = new Vendedor("Heitor","Masculino", 23, 2500, "2134009", 
        1400, 4, 2600, 10 );
        System.out.println("---------------\nDADOS VENDEDOR\n---------------\n" + vendedor.toString());
        
        Empregado admin = new Administrador("Marcia", "Feminino", 20, 5000, 
        "23097890", 2500, 5, 1000);
        System.out.println("---------------\nDADOS ADMIN\n---------------\n" + admin.toString());
        
        Empregado operador = new Operador("Victor", "Masculino", 25, 3000, "2245678", 
        2000, 3, 1500, 500);
        System.out.println("---------------\nDADOS OPERADOR\n---------------\n" + operador.toString());
        
    }
    
}
