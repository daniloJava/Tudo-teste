public class ContaPoupanca implements Conta {
          
          private double saldo;
          private int numero;
          private int senha;
          private String nome;
          
          public ContaPoupanca(String nome, int n, int pw){
              this.nome = nome;
              numero = n;
              senha = pw;
          }  

          
          public void depositar(double valor){
              double novoSaldo = saldo + valor;
              saldo = novoSaldo;
          }

          public void sacar(double valor){
	     	  double novoSaldo = saldo - valor;
              saldo = novoSaldo;
          }

          public double getSaldo( ){
      	      return saldo;
          }
          
          public int getNumero(){
              return numero;
          }
          
          public int getSenha(){
              return senha;
          }
          
          public String getNome(){
              return nome;
          }
          
          public void transferir(double v, Conta destino){
              this.sacar(v);
              destino.depositar(v);
          }
          
}