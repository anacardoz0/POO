/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 01*/
public class main {
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle();
        
        System.out.println("Comprimento inicial: " + rectangle.getLength());
        System.out.println("Largura inicial: " + rectangle.getWidth());
        System.out.println("Perímetro inicial: " + rectangle.calcularPerimetro());
        System.out.println("Área inicial: " + rectangle.calcularArea());
        
        rectangle.setLength(5.0);
        rectangle.setWidth(4.0);
        
        System.out.println("Comprimento atualizado: " + rectangle.getLength());
        System.out.println("Largura atualizada: " + rectangle.getWidth());
        System.out.println("Perímetro atualizado: " + rectangle.calcularPerimetro());
        System.out.println("Área atualizada: " + rectangle.calcularArea());
        
    }
    
}
