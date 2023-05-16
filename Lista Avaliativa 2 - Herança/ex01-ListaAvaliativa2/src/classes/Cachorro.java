package classes;

/**
 *
 * @author ana.cardoz
 */
public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    @Override
    public String toString(){
        return "\nDados do animal\nNome: " + nome
            + "\nPeso: " + peso
            + "\nRaça: " + raca;
    }
}
