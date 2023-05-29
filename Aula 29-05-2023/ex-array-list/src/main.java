import java.util.ArrayList;

/**
 *
 * @author ana.cardoz
 */
public class main {
    public static void main(String[] args) {
        
        //instância da lista do tipo array list
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(1.0);
        lista.add(20.0);
        lista.add(15.0);

        /*verifica se a lista está vazia -->
        System.out.println(lista.isEmpty());*/ 
        
        /*apresenta o elemento do indice -->
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));*/
        
        //pecorre a lista
        for(int i = 0; i < lista.size(); i++){ //size() apresenta o tamanho da lista
            System.out.println(lista.get(i));
        }
        
        //apresenta o indice do elemento
        System.out.println(lista.indexOf(20.0));
        
        lista.clear(); //limpar lista
        
        System.out.println(lista.isEmpty());
        
        lista.add(36.0);
        lista.add(21.0);
        
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        
        lista.remove(1); //remove o elemento do indice 
          for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        
       lista.set(0, 15.0);
         for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
    
}
