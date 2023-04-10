package application;

import entities.empregado;
import java.util.Scanner;

/**
 *
 * @author ana.cardoz
 */
public class EmpregadoTest {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    empregado empregado1 = new empregado("Daniel", "Rock", 1500);
    empregado empregado2 = new empregado("Vick", "Ferraz", 1700.5);
    
    System.out.println();
       String nome = sc.nextLine();
       empregado1.setnome(nome);
       empregado2.setnome(nome);
       
       System.out.println();
       String sobrenome = sc.nextLine();
       empregado1.setsobrenome(sobrenome);
       empregado2.setsobrenome(sobrenome);
       
       System.out.println();
       double salary = sc.nextDouble();
       empregado1.setsalary(empregado1.getsalary() + empregado1.getsalary() * 10); 
       empregado2.setsalary(empregado1.getsalary() + empregado1.getsalary() * 10);
       
       System.out.println("\n\n->Salário com acrécimo 10%: \n"
               + "***Empregado 1***"
               + "\nNome Completo: " + empregado1.getnome()
               + " " + empregado1.getsobrenome() 
               + "Salário" + empregado1.getsalary());
       
       System.out.println("\n\n->Salário com acrécimo 10%: \n"
               + "***Empregado 2***"
               + "\nNome Completo: " + empregado2.getnome()
               + " " + empregado2.getsobrenome() 
               + "Salário" + empregado2.getsalary());
       
    }   
}