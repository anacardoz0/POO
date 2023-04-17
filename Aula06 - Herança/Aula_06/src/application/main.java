package application;

import classes.Funcionario;

/**
 *
 * @author ana.cardoz
 */
public class main {
    public static void main(){
        
        //instacia dos objetos
        Funcionario f = new Funcionario ("Pedro", "123", 1000.0, 0.3);
        System.out.println("Inf obejto Funcionario", f.toString());
        
    }
}
