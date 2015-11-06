package BancoManipula;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ContaBancariaDAO {
    
    public void inserir(Conta c){
        String sql = "insert into conta_bancaria values (?, ?, ?, ?, ?)";
        try{
            Connection conexao = ConexaoBD.getConexao();
            PreparedStatement comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setInt(1, c.getNumero());
            comandoSQL.setInt(2, c.getSenha());
            comandoSQL.setDouble(3, c.getSaldo());
            comandoSQL.setString(4, c.getNome());
            if(c instanceof ContaCorrente){
                comandoSQL.setInt(5, 0);    
            }else{
                comandoSQL.setInt(5, 1);    
            }
            comandoSQL.execute();
            
            comandoSQL.close();
            conexao.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao inserir conta bancaria");
        }
    }
    
    public void deletar(int numero){
        
    }
    
    public void alterar(Conta c){
        String sql = "update conta_bancaria set nome=?, senha=?, saldo=?, tipo = ? where numero=?";
        try{
            Connection conexao = ConexaoBD.getConexao();
            PreparedStatement comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setString(1, c.getNome());
            comandoSQL.setInt(2, c.getSenha());
            comandoSQL.setDouble(3, c.getSaldo());
            if(c instanceof ContaPoupanca)
                comandoSQL.setDouble(4, 0);
            else
                comandoSQL.setDouble(4, 1);
            comandoSQL.setInt(5, c.getNumero());
            comandoSQL.execute();
            
            comandoSQL.close();
            conexao.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao inserir conta bancaria");
        }
    }
    
    //
    public int contarContasComSaldo(double saldo){
        int quantidade = 0;
        String sql = "select count(numero) as quantidade from conta_bancaria where saldo >= ?";
        
        try{
            Connection conexao = ConexaoBD.getConexao();
            PreparedStatement comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setDouble(1, saldo);
            
            ResultSet rs = comandoSQL.executeQuery();
            if(rs.next()){
                quantidade = rs.getInt("quantidade");
            }
            rs.close();
            comandoSQL.close();
            conexao.close();
            
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Erro ao consultar conta bancaria"); 
        }
        
        return quantidade;
    }
    
    
    
    public Conta consultarSaldoMax( ){
        Conta c = null;
        String sql = "select * from conta_bancaria where saldo = (select max(saldo) from conta_bancaria)";
        
        try{
            Connection conexao = ConexaoBD.getConexao();
            PreparedStatement comandoSQL = conexao.prepareStatement(sql);
            
            ResultSet rs = comandoSQL.executeQuery();
            if(rs.next()){
                int numero = rs.getInt("numero");
                int senha = rs.getInt("senha");
                String nome = rs.getString("nome");
                double saldo = rs.getDouble("saldo");
                int tipo = rs.getInt("tipo");
                
                if(tipo == 0){
                    c = new ContaPoupanca(nome, numero, senha, saldo);
                    
                }else{
                    c = new ContaCorrente(nome, numero, senha, saldo);
                }
            }
            rs.close();
            comandoSQL.close();
            conexao.close();
            
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Erro ao consultar conta bancaria"); 
        }
        
        return c;
    }
    
    
    public Conta consultar(int numero){
        Conta c = null;
        String sql = "select * from conta_bancaria where numero=?";
        
        try{
            Connection conexao = ConexaoBD.getConexao();
            PreparedStatement comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setInt(1, numero);
            
            ResultSet rs = comandoSQL.executeQuery();
            if(rs.next()){
                int senha = rs.getInt("senha");
                String nome = rs.getString("nome");
                double saldo = rs.getDouble("saldo");
                int tipo = rs.getInt("tipo");
                
                if(tipo == 0){
                    c = new ContaPoupanca(nome, numero, senha, saldo);
                    
                }else{
                    c = new ContaCorrente(nome, numero, senha, saldo);
                }
            }
            rs.close();
            comandoSQL.close();
            conexao.close();
            
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Erro ao consultar conta bancaria"); 
        }
        
        return c;
    }
    
    
    
}
