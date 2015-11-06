
import java.lang.*;

public class Maquina {

    
    private double saldoTotal;
    private int[] produtosQuantidade = new int[6];
    private double[] valorProduto = new double[6];
    
    public Maquina(){
        valorProduto[0] = 4.00; 
        valorProduto[1] = 3.50;
        valorProduto[2] = 2.00;
        valorProduto[3] = 1.50;
        valorProduto[4] = 10.00;
        valorProduto[5] = 0.50;
    }
    
    protected double getSaldo(){
        return saldoTotal;
    }
    public void setSaldo(double valor){
        saldoTotal = valor;
    }
    
    protected void setCocaCola (int v){
        produtosQuantidade[0] = v;
    }
    
    protected void setPepis (int v){
        produtosQuantidade[1] = v;
    }
    
    protected void setDolly (int v){
        produtosQuantidade[2] = v;
    }
    
    protected void setAgua (int v){
        produtosQuantidade[3] = v;
    }
    
    protected void setRedBull (int v){
        produtosQuantidade[4] = v;
    }
    
    protected void setConvencao (int v){
        produtosQuantidade[5] = v;
    }
    
    public boolean getProduto(int indiceDoProduto){
        if(produtosQuantidade[indiceDoProduto] != 0)
            return true;
        else
            return false;
    }
    
    public void setProduto(int indiceDoProduto){
            produtosQuantidade[indiceDoProduto] = produtosQuantidade[indiceDoProduto] - 1;
    }
    
    public double getValorDoProduto(int indiceDoProduto){
        return valorProduto[indiceDoProduto];
    }
}
