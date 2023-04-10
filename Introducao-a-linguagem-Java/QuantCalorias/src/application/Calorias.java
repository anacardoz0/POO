package application;

import entities.CaloriasInfo;
import java.util.Scanner;

/**
 *
 * @author ana.cardoz
 */

public class Calorias {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    CaloriasInfo calorias = new CaloriasInfo();
    
    System.out.println("---PRATO---\n\n (01) - Vegetariano --> 180 cal\n (02) - Peixe --> 230 cal\n (03) - Frango --> 250 cal\n (04) - Carne --> 350 cal");
    System.out.println("Escolha um prato: ");
       int prato = sc.nextInt();
       calorias.setPrato(prato);
       
    System.out.println("---SOBREMESA---\n\n (01) - Abacaxi --> 75 cal\n (02) - Sorvete diet --> 110 cal\n (03) - Mouse diet --> 170 cal\n (04) - Mouse chocolate --> 200 cal");
    System.out.println("Escolha uma sobremesa: ");
       int sobremesa = sc.nextInt();
       calorias.setSobremesa(sobremesa);
              
     System.out.println("---BEBIDA---\n\n (01) - Chá --> 20 cal\n (02) - Suco de laranja --> 70 cal\n (03) - Suco de melão --> 100 cal\n (04) - Refrigerante diet --> 65 cal");
    System.out.println("Escolha uma bebida: ");
       int bebida = sc.nextInt();
       calorias.setSobremesa(sobremesa);
       
       System.out.println("Total de Calorias: " + calorias.getTotalCalorias());
       
    }  
}
