
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConexaoBD {
    
    public static Connection getConexao(){
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/Aula_java_BD";
        String usuario = "root";
        String senha = "123";
        Connection conexao = null;
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao conectar com bd!");
        }
        
        return conexao;
    }
 
    
    
    
}
