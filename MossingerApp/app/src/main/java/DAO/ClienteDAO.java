
package DAO;

import Beans.Clientes.Cliente;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Matheus Henrique
 */

public class ClienteDAO {
    
    private Connection con = null;

    
    public ClienteDAO(){
        
        con = ConnectionFactory.getConnection();
        
    }
    
    
    public boolean save(Cliente cliente){
        
        String sql = "INSERT INTO clientes (Nome,RazaoSocial,Endereco,Cidade,CNPJ,CPF,EMAIL,celular,telefone,LESTD,CEP,DataNascimento,UF,Banco,Agencia,ContatoBanco) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            
        
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getRazaoSocial());
            stmt.setString(3, cliente.getEndereco());
            stmt.setString(4, cliente.getCidade());
            stmt.setString(5, cliente.getCnpj());
            stmt.setString(6, cliente.getCpf());
            stmt.setString(7, cliente.getEmail());
            stmt.setLong(8, cliente.getCelular());
            stmt.setLong(9, cliente.getTelefone());
            stmt.setInt(10, cliente.getLestd());
            stmt.setInt(11, cliente.getCep());
            stmt.setString(12, cliente.getDatanascimento());
            stmt.setString(13, cliente.getUf());
            stmt.setString(14, cliente.getBanco());
            stmt.setString(15, cliente.getAgencia());
            stmt.setString(16, cliente.getContatobanco());
            stmt.executeUpdate();
            return true;
            
            
            
            
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            
            ConnectionFactory.closeConnection(con,stmt);
        
    }
        
    }
   
    
}
