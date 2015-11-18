
import javax.swing.JOptionPane;


public class Principal {

    public static void main(String args[]) {

        Banco bb = new Banco();
        
        String menu = "Digite uma das opções:";
        menu = menu + "\n 1 - Criar conta bancária";
        menu = menu + "\n 2 - Depositar";
        menu = menu + "\n 3 - Sacar";
        menu = menu + "\n 4 - Consultar saldo";
        menu = menu + "\n 5 - Contar a quantidade de contas";
        menu = menu + "\n 6 - Consultar conta de maior saldo";        
        menu = menu + "\n Q - Sair";
        
        boolean finalizou = false;
        while (!finalizou) {
            String opcao = JOptionPane.showInputDialog(menu);
            if (opcao.equalsIgnoreCase("Q")) {
                finalizou = true;
            } else {
                //nosso programa
                
                if(opcao.equals("1")){
                    String nome = JOptionPane.showInputDialog("Digite o nome do cliente"); 
                    String sNumero = JOptionPane.showInputDialog("Digite o número da conta");
                    String sSenha = JOptionPane.showInputDialog("Digite a senha");
                    int numero = Integer.parseInt(sNumero);
                    int senha = Integer.parseInt(sSenha);
                    
                    ContaPoupanca novaConta = new ContaPoupanca(nome, numero, senha);
                    bb.adicionar(novaConta);
                    JOptionPane.showMessageDialog(null, "Conta cadastrado com sucesso!");
                }   
                else if(opcao.equals("2")){
                   String sNumero = JOptionPane.showInputDialog("Digite o número da conta");
                   int numero = Integer.parseInt(sNumero);
                   
                   Conta conta =  bb.consultar(numero);
                   if(conta != null){
                        String sValor = JOptionPane.showInputDialog("Digite o valor do deposito");
                        double valor = Double.parseDouble(sValor);
                        conta.depositar(valor);
                        JOptionPane.showMessageDialog(null, "Deposito efetuado com sucesso!");
                   }else{
                       JOptionPane.showMessageDialog(null, "Número da conta invalido!");
                   }
                }
                else if(opcao.equals("3")){
                   String sNumero = JOptionPane.showInputDialog("Digite o número da conta");
                   int numero = Integer.parseInt(sNumero);
                   
                   Conta conta = bb.consultar(numero);
                   if(conta != null){
                        
                        String sSenha = JOptionPane.showInputDialog("Digite a senha");
                        int senha = Integer.parseInt(sSenha);
                        if(conta.getSenha() ==  senha){
                            String sValor = JOptionPane.showInputDialog("Digite o valor do saque");
                            double valor = Double.parseDouble(sValor);
                            conta.sacar(valor);
                            JOptionPane.showMessageDialog(null, "Deposito efetuado com sucesso!");
                        }else{
                            JOptionPane.showMessageDialog(null, "senha invalido!"); 
                        }
                   
                   }else{
                       JOptionPane.showMessageDialog(null, "Número da conta invalido!");
                   }
                }
                else if(opcao.equals("4")){
                   String sNumero = JOptionPane.showInputDialog("Digite o número da conta");
                   int numero = Integer.parseInt(sNumero);
                   
                   Conta conta =  bb.consultar(numero);
                   if(conta != null){
                        String sSenha = JOptionPane.showInputDialog("Digite a senha");
                        int senha = Integer.parseInt(sSenha);
                        if(conta.getSenha() ==  senha){
                            JOptionPane.showMessageDialog(null, "O saldo é " + conta.getSaldo());
                        }else{
                            JOptionPane.showMessageDialog(null, "senha invalido!"); 
                        }
                   }else{
                       JOptionPane.showMessageDialog(null, "Número da conta invalido!");
                   }
                }
                else if (opcao.equals("5")){ //contar as contas
                    String sValor = JOptionPane.showInputDialog("Digite o valor do saldo de referencia");
                    double valor = Double.parseDouble(sValor);
                    int quantidade = bb.contarContas(valor);
                    JOptionPane.showMessageDialog(null, "O número de contas com saldo maior ou igual R$" + valor + " é " + quantidade);
                }
                else if (opcao.equals("6")){
                    Conta contaMax =  bb.getContaDeSaldoMaximo();
                    if(contaMax != null){
                        String extrato = "Conta de saldo máximo";
                        extrato = extrato + "\n Cliente:" + contaMax.getNome();
                        extrato = extrato + "\n Número:" + contaMax.getNumero();
                        extrato = extrato + "\n Senha:" + contaMax.getSenha();
                        extrato = extrato + "\n Saldo:" + contaMax.getSaldo();
                        JOptionPane.showMessageDialog(null, extrato);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Não existem contas cadastradas");
                    }
                
                }
                else{
                    JOptionPane.showMessageDialog(null, "Opção invalida!");
                }
                
                
            }
        }

    }

}
