public class ContaCorrente implements Conta {
          
          private double saldo;
          private int numero;
          private int senha;
          private String nome;
          
          public ContaCorrente(String nome, int n, int pw){
              this.nome = nome;
              numero = n;
              senha = pw;
          }  

          
          public void depositar(double valor){
              double novoSaldo = saldo + (valor * 0.99);
              saldo = novoSaldo;
          }

          public void sacar(double valor){
	      double novoSaldo = saldo - (valor * 1.01);
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