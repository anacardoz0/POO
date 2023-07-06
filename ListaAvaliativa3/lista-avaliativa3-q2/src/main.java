
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 02*/
public class main {
    public static void main(String[] args) {
        
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("CADASTRO DE VEÍCULOS");
        System.out.println("-------------------");
        
        int opcao;
        do {
            System.out.println("Selecione o tipo de veículo:");
            System.out.println("1 - Moto");
            System.out.println("2 - Carro");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            
            if (opcao == 1) {
                Moto moto = new Moto("", 0.0, 0);
                System.out.println("Inserir dados da moto:");
                moto.insertDados();
                veiculos.add(moto);
                System.out.println("Moto cadastrada com sucesso!");
                System.out.println("-------------------");
            } else if (opcao == 2) {
                Carro carro = new Carro("", 0.0, 0.0);
                System.out.println("Inserir dados do carro:");
                carro.insertDados();
                veiculos.add(carro);
                System.out.println("Carro cadastrado com sucesso!");
                System.out.println("-------------------");
            }
        } while (opcao != 0);
        
        System.out.println("RELATÓRIO DE VEÍCULOS CADASTRADOS");
        System.out.println("-------------------");
        for (Veiculo veiculo : veiculos) {
            veiculo.printDados();
            System.out.println("-------------------");
        }
        
        double totalPrecos = 0;
        
        for (Veiculo veiculo : veiculos) {
            totalPrecos += veiculo.getPreco();
        }
        
        System.out.println("Total de preços dos veículos: R$ " + totalPrecos);
        
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Moto && ((Moto) veiculo).getAno() >= 2008) {
                veiculo.setPreco(veiculo.getPreco() * 1.10);
            }
            if (veiculo instanceof Carro && ((Carro) veiculo).getKm() > 100000) {
                veiculo.setPreco(veiculo.getPreco() * 0.92);
            }
        }
        
        double novoTotalPrecos = 0;
        
        for (Veiculo veiculo : veiculos) {
            novoTotalPrecos += veiculo.getPreco();
        }
        
        System.out.println("Novo total de preços dos veículos: R$ " + novoTotalPrecos);
    }
       
    }
