package entities;
/**
 *
 * @author ana.cardoz
 */

public class FaturaInfo {
    public String num;
    public String describe;
    public int quantCompradaItens;
    private double precoItem = 0;
    
    public void setnum(String num){
        this.num = num;
    }
    public String getnum(){
        return num;
    }
    
    public void setdescribe(String describe){
        this.describe = describe;
    }
    public String getdescribe(){
        return describe;
    }
    
    public void setquantCompradaItens(int quantCompradaItens){
        this.quantCompradaItens = quantCompradaItens;
        if(quantCompradaItens < 0){
            quantCompradaItens = 0;
        }
    }
    public int getquantCompradaItens(){
        return quantCompradaItens;
    }
    
    public void setprecoItem(double precoItem){
        this.precoItem = precoItem;
        if(precoItem < 0.0){
            precoItem = 0;
        }
    }
    public double getprecoItem(){
        return precoItem;
    }
    
    public double getTotalFatura(){
        return quantCompradaItens * precoItem;
    }
    
    public String toString(){
        return "Número: " + num
                + "\nDescrição do item: " + describe
                + "\nQuantidade de itens: " + String.format("%d" , quantCompradaItens)
                + "\nPreço: " + precoItem
                + "Total: R$" + String.format("%.2f", getTotalFatura());
    }
    
}

