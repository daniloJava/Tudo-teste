
public interface Conta {
    public void depositar(double v);
    public void sacar(double v);
    public double getSaldo();
    public int getNumero();
    public String getNome();
    public int getSenha();
    public void transferir(double v, Conta c);
    
    
}
