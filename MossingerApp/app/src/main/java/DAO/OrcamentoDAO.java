package DAO;

import Beans.Pedidos.Orcamentos;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Matheus Henrique
 */
public class OrcamentoDAO {
    
     private Connection con = null;
     
     
     public OrcamentoDAO(){
         
         con = ConnectionFactory.getConnection();
         
     }
     
     public boolean create(Orcamentos orcamento){
         
         String sql = "INSERT INTO orcamentos (Protocolo,IDCliente,ListaProdutos,dataorcamento) VALUES (?,?,?,?)";
         PreparedStatement stmt = null;
         
         try {
             
             stmt = con.prepareStatement(sql);
             stmt.setLong(1, orcamento.getProtocolo());
             stmt.setLong(2, orcamento.getIdcliente());
             stmt.setString(3, orcamento.getListaprodutos());
             stmt.setString(4, orcamento.getDatapedido());
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
