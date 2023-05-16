package classes;

/**
 *
 * @author ana.cardoz
 */
public class Peixe extends Animal{
    
    public String tipo_habitat;
    
    public Peixe(String nome, double peso, String tipo_habitat) {
        super(nome, peso);
        this.tipo_habitat = tipo_habitat;
    }
    

    public String getTipo_habitat() {
        return tipo_habitat;
    }

    public void setTipo_habitat(String tipo_habitat) {
        this.tipo_habitat = tipo_habitat;
    }

    @Override
    public String toString(){
        return "Dados do animal\nNome: " + nome
            + "\nPeso: " + peso
            + "\nHabitat: " + tipo_habitat;
    }
}

