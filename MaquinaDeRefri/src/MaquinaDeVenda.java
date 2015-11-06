
public class MaquinaDeVenda {

    private double valorPagamento;
    private double valorProduto;
    private double saldo;
    
    public MaquinaDeVenda(){
        valorPagamento = 0;
        valorProduto = 0;
        saldo =0;
    }
    
    public void registrarProduto(double v){
        valorProduto = v;
    }
    
    public void registrarPagamento(double v){
        valorPagamento = valorPagamento + v;
    }
    
    public boolean foiPago(){
        return valorPagamento >= valorProduto;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public double finalizarVenda(){
        double troco = valorPagamento - valorProduto;
        saldo = saldo + valorProduto;
        valorPagamento = 0;
        valorProduto = 0;
        return troco;        
    }
    
}
