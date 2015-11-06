
public class Investimento {

	private final double valor;
	private final double taxa;
	private double resultado;
	private int periodo;
	
	//Metodo construtor.
	public Investimento(double valor, double taxa){
		this.valor = valor;
		this.taxa = taxa;
	}
	
	//Simulação por valor.
	public void setInvestirAteValor(double valorAlto){
		periodo = 1;
		while(valor <= valorAlto){
				resultado = valor + valor *  taxa;
				periodo++;	
		}
	}
	//Simulação por periodo
	public void setInvestirPorPeriodo(int periodoMes){
		periodo = periodoMes;
		for(int i = 0; i <= periodoMes; i++)
			resultado = valor + valor *  taxa;
	}
	
	//Retorno do periodo
	public int getPeriodo(){
		return periodo;
	}

	//Retorno do Saldo
	public double getSaldo(){
		return resultado;
	}
	
	
}
