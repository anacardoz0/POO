package application;

import classes.Animal;
import classes.Cachorro;
import classes.Peixe;

/**
 *
 * @author ana.cardoz
 */
public class main {
    public static void main(String[] args) {
        Animal P = new Peixe ("Luke", 0.5, "Ornamental");
        System.out.println("--Inf Peixe--\n\n " + P.toString());
        
        Animal C = new Cachorro ("Mel", 5.9, "Shitzu");
        System.out.println("--Inf Cachorro--\n\n " + C.toString());
    }
}