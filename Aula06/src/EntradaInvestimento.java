import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class EntradaInvestimento {

	public static void main(String[] args) {
		// Declara��o das vari�veis.
		String input;
		DecimalFormat decimal = new DecimalFormat("0.00");
		int opcao;
		double valorDoInvestimento;
		double taxaDeJuros;
		double porValor;
		int porPeriodo;
		boolean cont = false;

		// inicializa��o do valor
		input = JOptionPane.showInputDialog("Digite o valor do Investimento ");
		valorDoInvestimento = Double.parseDouble(input);

		// inicializa��o da taxa.
		input = JOptionPane.showInputDialog("Digite a taxa de juros: EX 0.07");
		taxaDeJuros = Double.parseDouble(input);

		// chamada do Objeto Investimento.
		Investimento poupanca = new Investimento(valorDoInvestimento,
				taxaDeJuros);

		while (!cont) {
			//Selecionar Opc�o.
			input = JOptionPane.showInputDialog("Digite 1 para simula��o por valor. E 2 para simula��o por periodo ");
			opcao = Integer.parseInt(input);
			
			//Simula��o por valor.
			if (opcao == 1) {
				input = JOptionPane.showInputDialog("Digite o Valor Final");
				porValor = Double.parseDouble(input);
				poupanca.setInvestirAteValor(porValor);
				cont = true;//Sai do Loop
			} 
			
			//Simula��o por Periodo 
			else if (opcao == 2) {
				input = JOptionPane.showInputDialog("Digite Periodo");
				porPeriodo = Integer.parseInt(input);
				poupanca.setInvestirPorPeriodo(porPeriodo);
				cont = true;//Sai do Loop
			} else {
				
				//Op��o Incorreta.
				JOptionPane.showMessageDialog(null, "Op��o incorreta");
			}
			
			//imprimir os valores.
			if (opcao == 1 || opcao == 2) {
				JOptionPane.showMessageDialog(null,"Valor Investido R$:" + valorDoInvestimento + 
													"\nValor R$:" + decimal.format(poupanca.getSaldo()) +
													"\nPeriodo de " + poupanca.getPeriodo() + " Meses");
				cont = true;//Sai do Loop
			}
		}
	}
}
