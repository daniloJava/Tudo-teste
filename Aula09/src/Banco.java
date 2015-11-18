import java.util.*;

public class Banco {
    
    private ArrayList<Conta> lista;

    public Banco(){
        lista = new ArrayList<Conta>( );
    }
    
    public void adicionar(Conta b){
        lista.add(b);
    }
    
    public Conta consultar(int numero){
        Conta contaEncontrada = null;
        for(int i=0; i < lista.size(); i++){
            Conta b = lista.get( i );
            if(b.getNumero() == numero){
                contaEncontrada = b;
            }
        }
        return  contaEncontrada;
    }
    
    public int contarContas(double valor){
        int quantidade = 0 ;
        for(int i=0; i < lista.size(); i++){
            Conta b = lista.get( i );
            if(b.getSaldo() >= valor){
                quantidade += 1;
            }
        }
        return quantidade;
    }
    
    public Conta getContaDeSaldoMaximo(){
        Conta contaMax = null;
        if(lista.size() > 0){
            contaMax = lista.get( 0 );
            for(int i=1; i < lista.size(); i++){
                Conta b = lista.get( i );
                if(b.getSaldo() > contaMax.getSaldo()){
                    contaMax = b;
                }
            }
        }
        return contaMax;
    }
    
}
