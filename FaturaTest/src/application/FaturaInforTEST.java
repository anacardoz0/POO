package application;

import java.util.Scanner;
import entities.FaturaInfo;

/**
 *
 * @author ana.cardoz
 */

public class FaturaInforTEST {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    FaturaInfo fatura = new FaturaInfo();

    System.out.println("Informe o número do pedido: ");
       String num = sc.nextLine();
       fatura.setnum(num);
       
       System.out.println("Digite a descrição do produto: ");
       String describe = sc.nextLine();
       fatura.setdescribe(describe);
       
       System.out.println("Informe a quantidade de itens: ");
       int quantCompradaItens = sc.nextInt();
       fatura.setquantCompradaItens(quantCompradaItens);
       
       System.out.println("Digite o preço:  ");
       double precoItem = sc.nextDouble();
       fatura.setprecoItem(precoItem);
       
        System.out.println(fatura);
    
}}

