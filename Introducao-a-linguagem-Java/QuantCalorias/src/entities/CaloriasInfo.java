package entities;
/**
 *
 * @author ana.cardoz
 */

public class CaloriasInfo {
    
    public int calorias;
    private int prato;
    private int sobremesa;
    private int bebida;
    private int totalCalorias;
    
    public void setcalorias (int calorias){
        this.calorias = calorias;
    }
    public int getcalorias(){
        return calorias;
    }

    public int getPrato() {
        return prato;
    }
    public void setPrato(int prato) {
        if(prato == 1){ 
       calorias = 180;
       prato = calorias;
    }else{
       if(prato == 2){
           calorias = 230;
           prato = calorias;
       }else{
           if(prato == 3){
               calorias = 250;
               prato = calorias; 
           }else{
               if(prato == 4){
                   calorias =350;
                   prato = calorias;
               }
           }
        }
    }
        this.prato = prato;
    }

    public int getSobremesa() {
        return sobremesa;
    }
    public void setSobremesa(int sobremesa) {
        if(sobremesa == 1){
       calorias= 75;
       sobremesa = calorias;
    }else{
        if(sobremesa == 2){
            calorias = 110;
            sobremesa = calorias;
        }else{ 
           if(sobremesa == 3){
               calorias = 170;
               sobremesa = calorias;
           }else{
                if(sobremesa == 4){
                    calorias = 200;
                    sobremesa = calorias;
                }
           }
        }
    }
        this.sobremesa = sobremesa;
    }

    public int getBebida() {
        return bebida;
    }
    public void setBebida(int bebida) {
         if(bebida == 1){
       calorias = 20;
       bebida = calorias;
    }else{
         if(bebida == 2){
           calorias = 70;
           bebida = calorias;
        }else{
           if(bebida == 3){
               calorias = 100;
               bebida = calorias;
           }else{
                   if(bebida == 4){
                   calorias = 65;
                   bebida = calorias;
                }
            }
        } 
    }
        this.bebida = bebida;
    }

    public int getTotalCalorias() {
        return totalCalorias = prato + sobremesa + bebida;
    }
    public void setTotalCalorias(int totalCalorias) {
        this.totalCalorias = totalCalorias;
    } 
}
