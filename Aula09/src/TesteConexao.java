
import java.sql.*;


public class TesteConexao {
    public static void main(String args[]){
        
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/Aula_Java";
        String usuario = "root";
        String senha = "123";
        
        try{
            Class.forName(driver);
            Connection conexao;
            conexao = DriverManager.getConnection(url, usuario, senha);
            
            String sql = "insert into conta_bancaria (numero, senha, saldo, nome, tipo) values (?, ?, ?, ?, ?)";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, 2);
            ps.setInt(2, 123456);
            ps.setDouble(3, 1000.50);
            ps.setString(4, "Joao Paulo");
            ps.setInt(5, 1);
            
            ps.execute();
            
            System.out.println("comando executado com sucesso");
            
        }catch(Exception e){
            System.out.println("Falhou...");
        }
        
    }
}
