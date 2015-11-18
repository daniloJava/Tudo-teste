
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class TesteBD {
    public static void main(String args[]){
        
        Connection conexao = ConexaoBD.getConexao();
        
        int numero = 10;
        int senha = 12300;
        double saldo = 1800;
        String nome = "Wonder  iyiu";
        int tipo = 1;
        
        
        try{
            String sql = "insert into conta_bancaria (numero, senha, saldo, nome, tipo) values (?, ?, ?, ?, ?)";
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1, numero);
            comando.setInt(2, senha);
            comando.setDouble(3, saldo);
            comando.setString(4, nome);
            comando.setInt(5, tipo);
            
            comando.execute();
            
            comando.close();
            conexao.close();
            
            System.out.println("Operacao efetuada com sucesso");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
