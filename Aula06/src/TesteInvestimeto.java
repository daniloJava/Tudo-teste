import java.text.DecimalFormat;


public class TesteInvestimeto {

	public static void main(String[] args) {
		
		double valorDoInvestimento = 10000;
		double taxaDeJuros = 0.07;
		DecimalFormat decimal = new DecimalFormat("0.00");
		Investimento poupanca = new Investimento(valorDoInvestimento, taxaDeJuros);
		poupanca.setInvestirAteValor(15000);
		int m = poupanca.getPeriodo();
		System.out.println("É necessário investir por "+ m +" meses para atingir 15000\n\n");
		
		Investimento cdb = new Investimento(12000, 0.09);
		cdb.setInvestirPorPeriodo(60);
		double saldo = cdb.getSaldo();
		System.out.println("Seu saldo será " + decimal.format(saldo) + " se investir por 60 meses \n\n");
		
		
	}

}
