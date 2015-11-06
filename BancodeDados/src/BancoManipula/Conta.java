package BancoManipula;

public interface Conta {
    public void depositar(double v);
    public void sacar(double v);
    
    public double getSaldo();
    public int getNumero();
    public String getNome();
    public int getSenha();
    
    public void setSaldo(double s);
    public void setNome(String s);
    public void setSenha(int s);
    
    public void transferir(double v, Conta c);
    
    
}
