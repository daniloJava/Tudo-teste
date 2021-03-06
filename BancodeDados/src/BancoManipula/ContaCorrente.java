package BancoManipula;

public class ContaCorrente implements Conta {
          
          private double saldo;
          private int numero;
          private int senha;
          private String nome;
          
          private ContaBancariaDAO dao = new ContaBancariaDAO();
          
          public ContaCorrente(String nome, int n, int pw){
              this.nome = nome;
              numero = n;
              senha = pw;
          }  

          public ContaCorrente(String nome, int n, int pw, double s){
              this.nome = nome;
              numero = n;
              senha = pw;
              saldo = s;
          } 
          
          public void depositar(double valor){
              double novoSaldo = saldo + (valor * 0.99);
              saldo = novoSaldo;
              dao.alterar(this);
          }

          public void sacar(double valor){
	      double novoSaldo = saldo - (valor * 1.01);
              saldo = novoSaldo;
              dao.alterar(this);
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
          
          public void setSaldo(double s){
              saldo = s;
          }
          
           public void setNome(String s){
                nome = s;
           }
        
        public void setSenha(int s){
            senha = s;
        }
          
}