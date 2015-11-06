
public class CaixaRegistradora {
	private double valorDaCompra;
	private double valorDoPagamento;
	private double saldoDoCaixa;
	
	
	public CaixaRegistradora(){}
	
	public void setRegistrarProduto(double valor){
		double novoValorDaCOmpra = valorDaCompra + valor;
		valorDaCompra = novoValorDaCOmpra;
		
	}
	
	public void setRegistrarPagamento(double valor){
			saldoDoCaixa += valorDaCompra;
			valorDoPagamento = valor;
			
	}
	
	public double getPegarTroco(){
		double troco = valorDoPagamento - valorDaCompra;
		valorDaCompra = 0;
		valorDoPagamento = 0;
		return troco;
	}
	
	public double getPegarSaldoDoCaixa(){
		return saldoDoCaixa;
	}
	
}
