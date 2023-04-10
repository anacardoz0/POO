package application;

import entities.carRevendedora;
import java.util.Scanner;

/**
 *
 * @author maura
 */

public class Revendendora {
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);

carRevendedora revender = new carRevendedora();

    System.out.println("Informe o salario base do vendedor: ");
       float salarioBase = sc.nextFloat();
       revender.setSalarioBase(salarioBase);
        
    System.out.println("Informe o valor da comissao por carro vendido: ");
       float valorComissao = sc.nextFloat();
       revender.setValorComissao(valorComissao);
       
    System.out.println("Informe o total de carros vendidos: ");
       float totalCarrosVendidos = sc.nextFloat();
       revender.setTotalCarrosVendidos(0);
       
    System.out.println("Informe o total de vendas: ");
       float totalVendas = sc.nextFloat();
       revender.setTotalVendas(totalVendas);
      
    System.out.println("\nSalário final do vendedor: " + revender.getTotalSalario());
       
    }
}
