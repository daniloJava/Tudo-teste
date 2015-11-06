package BancoManipula;

import java.sql.*;

import javax.swing.JOptionPane;


public class ConexaoBD {
    
    public static Connection getConexao(){
    	Connection conexao = null;
    	try{
        
    	Class.forName("oracle.jdbc.driver.OracleDriver");
        String usuario = "dan_dba";
        String senha = "DAN";
            conexao = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",usuario,senha);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao conectar com BD");
        }
        return conexao;
    }
    
}
