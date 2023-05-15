/**
 *
 * @author ana.cardoz
 */
public class main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Endereco end = new Endereco();
        Telefone fone1 = new Telefone();
        Telefone fone2 = new Telefone();
        
        //inserido dados na classe pessoas
        p1.setNome("Victoria");
        p1.setIdade("20");
        end.setLogradouro("Qd 02");
        
        end.setCep("7000-000");
        end.setNumero("lt 20");
        end.setBairro("Barragem");
        
        fone1.setDdd("61");
        fone1.setTelefone("95003-2015");
        
        fone2.setDdd("62");
        fone2.setTelefone("95893-2135");
        
        Telefone[] tel = new Telefone[2]; //array
        tel[0] = fone1;
        tel[1] = fone2;
        
        p1.setEndereco(end); //linha de associação de tabelas 1:1
        p1.setTelefones(tel); //linha de associação de tabelas 1:N
        
        
        System.out.println("--Dados--\n\nNome: " + p1.getNome()
                          + "\nIdade: " + p1.getIdade()
                          + "\nLogadouro: " + end.getLogradouro()
                          + "\nCEP: " + end.getCep()
                          + "\nNumero: " + end.getNumero()
                          + "\nBairro: " + end.getBairro());
        
        /*for(Telefone f : p1.getTelefones()){
            System.out.println("\nTelefone: " + f.getDdd()
                              + " " + f.getTelefone());
        }*/
        for(int i = 0; i< tel.length; i++){
            System.out.println("\nTelefone: " + tel[i].getDdd()
                              + " " + tel[i].getTelefone());
        }
    }
    
}
