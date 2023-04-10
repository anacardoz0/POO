package entities;
/**
 *
 * @author maura
 */

public class carRevendedora {
    private float salarioBase;
    private float valorComissao;
    private float totalVendas;
    private float totalComissao;
    private float totalSalario;
    private int totalCarrosVendidos;

    public float getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getValorComissao() {
        return valorComissao;
    }
    public void setValorComissao(float valorComissao) {
        this.valorComissao = valorComissao;
    }

    public float getTotalVendas() {
        return totalVendas;
    }
    public void setTotalVendas(float totalVendas) {
        this.totalVendas = totalVendas;
    }

    public float getTotalComissao() {
        return totalComissao = totalCarrosVendidos + valorComissao;
    }
    public void setTotalComissao(float totalComissao) {
        this.totalComissao = totalComissao;
    }

    public float getTotalSalario() {
        return totalSalario = totalComissao + salarioBase;
    }
    public void setTotalSalario(float totalSalario) {
        this.totalSalario = totalSalario;
    }

    public int getTotalCarrosVendidos() {
        return totalCarrosVendidos;
    }
    public void setTotalCarrosVendidos(int totalCarrosVendidos) {
        this.totalCarrosVendidos = totalCarrosVendidos;
    }
    
     
        
    }
