import javax.swing.JOptionPane;


public class TesteCaixaRegistradora {

	public static void main(String[] args) {
		CaixaRegistradora caixa = new CaixaRegistradora();
		boolean opc = false;
		String input;
		while(!opc){
			input = JOptionPane.showInputDialog("Digite a Opição desejada\n" + 
												"1- Registrar Produto\n" +
												"2- Efetuar Pagamento\n" +
												"3- Pegar Saldo do Caixa\n" +
												"Q- Para Sair");
			
			if(input.equalsIgnoreCase("1")){
				boolean opc2 = false;
				while(!opc2){
					
					input = JOptionPane.showInputDialog("Digite o Valor do Produto \n Q- Para SAIR");
					if(input.equalsIgnoreCase("q"))
						opc2 = true;
					else{
						double valor = Double.parseDouble(input);
						caixa.setRegistrarProduto(valor);
					}
			
				}
			}
			else
				if(input.equalsIgnoreCase("2")){
					input = JOptionPane.showInputDialog("Digite o Valor do Pagamento");
					double valor = Double.parseDouble(input);
					caixa.setRegistrarPagamento(valor);
					JOptionPane.showMessageDialog(null, "O seu troco é " + caixa.getPegarTroco());
					JOptionPane.showMessageDialog(null, "O Saldo do caixa é " + caixa.getPegarSaldoDoCaixa());
					
				}
				else
					if(input.equalsIgnoreCase("3")){
						JOptionPane.showMessageDialog(null, "O saldo do caixa é " + caixa.getPegarSaldoDoCaixa());
						
					}
					else
						if(input.equalsIgnoreCase("q")){
							opc = true;
							
						}
						else
							JOptionPane.showMessageDialog(null, "OPIÇÃO INVALIDA");

			
			
			
			
			
		}

	}

}
