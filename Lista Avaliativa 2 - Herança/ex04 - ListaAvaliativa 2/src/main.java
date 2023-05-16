
/**
 *
 * @author ana.cardoz
 */
public class main {
    public static void main(String[] args) {
        Livro L = new LivroFisico("O Hobbit", "J.R.R Tolkien", "HarperCollins", 
        2019, 37.99, 336, 200, "Capa Dura");
        System.out.println("---------DADOS LIVRO FISICO---------\n" + L.toString());
        
        Livro D = new LivroDigital("1984", "George Orwell", "Excelsior",
        2021, 9.90, 320, "10155 kb", "Epub - Kindle");
        System.out.println("---\nDADOS LIVRO DIGITAL---\n" + D.toString());
        
        Livro cliente = new Cliente("A mandíbula de Caim", "Torquemada", "Intrínseca", 
        2022, 37.50, 216, 150, "Josy Pie", "Rua 30 QD 20 LT 56", "45 89776-0989", "josypie@gmail.com");
        System.out.println("---\nINF LIVRO---\n" + cliente.toString());
    }
    
}
