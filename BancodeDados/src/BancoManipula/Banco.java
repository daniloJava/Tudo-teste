package BancoManipula;

import java.util.*;

public class Banco {
    
    private ContaBancariaDAO dao;

    public Banco(){
        dao = new ContaBancariaDAO();
    }
    
    public void adicionar(Conta b){
        dao.inserir(b);
    }
    
    public Conta consultar(int numero){
        return dao.consultar(numero);
    }
    
    public int contarContas(double valor){
        return dao.contarContasComSaldo(valor);
    }
    
    public Conta getContaDeSaldoMaximo(){
        return dao.consultarSaldoMax();
    }
    
}
