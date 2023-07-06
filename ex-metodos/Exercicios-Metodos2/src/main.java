/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 02*/
public class main {
    public static void main(String[] args) {
       
    Livros livro1 = new Livros("Antes que o café esfrie", 19.80, "Toshikazu Kawaguchi");
    CD cd1 = new CD("Coldplay - Music Of The Spheres", 34.56, 12);
    DVD dvd1 = new DVD("A Pequena Sereia Edição Diamante", 28.00, 83);
    Livros livro2 = new Livros("Harry Potter e a Pedra Filosofal", 39.99, "J.K. Rowling");
    CD cd2 = new CD("Universal Music Sour", 128.42, 11);
    DVD dvd2 = new DVD("Barbie E O Castelo De Diamante", 29.99, 78);
        
        System.out.println(livro1);
        System.out.println(cd1);
        System.out.println(dvd1);
        System.out.println(livro2);
        System.out.println(cd2);
        System.out.println(dvd2);
        
    }
    
}