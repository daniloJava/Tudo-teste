
import javax.swing.JOptionPane;


public class SimulacaoMaquina {

    public static void main(String args[]){
        
        MaquinaDeVenda maq = new MaquinaDeVenda();
        
        String menu = "Selecione um produto";
        menu += "\n 1. Coca-cola [preço R$3,80]";
        menu += "\n 2. Fanta [preço R$3,60]";
        menu += "\n 3. Suco de uva [preço R$3,40]";
        menu += "\n Q. Desligar a máquina";

        boolean finalizou = false;
        while( ! finalizou){
            String entrada = JOptionPane.showInputDialog(menu);
            if(entrada.equalsIgnoreCase("Q")){
                finalizou = true;
            }else{
                double valorProduto = -1;
                if(entrada.equals("1")){
                    valorProduto = 3.80;
                }
                else if(entrada.equals("2")){
                    valorProduto = 3.60;
                }
                else if(entrada.equals("3")){
                    valorProduto = 3.40;
                }
                
                if(valorProduto != -1){
                    maq.registrarProduto(valorProduto);
                    double pagamentoRestante = valorProduto;
                    while( ! maq.foiPago()){
                        String msgPagamento = "O valor do produto é R$:" + valorProduto;
                        msgPagamento += "\n Falta pagar R$" +  pagamentoRestante;
                        msgPagamento += "\n\nEntre com uma moeda";
                        String sValor = JOptionPane.showInputDialog(msgPagamento);
                        double valor = Double.parseDouble(sValor);
                        maq.registrarPagamento(valor);    
                        pagamentoRestante -= valor;
                    }
                    double troco = maq.finalizarVenda();
                    JOptionPane.showMessageDialog(null, "Venda efetuada com sucesso!\n\n Troco: " + troco);
                }else{
                    JOptionPane.showMessageDialog(null, "Opção invalida!");
                }
                
                
            }
        }
        String saida = "Máquina finalizada com sucesso";
        saida += "\n\n Saldo: " + maq.getSaldo();
        JOptionPane.showMessageDialog(null, saida);
        
    }
    
}
