/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 02*/
abstract class Veiculo  {
    
    String modelo;
    double preco;
    
    public Veiculo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
     public void printDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: R$ " + preco);
    }
    
}
