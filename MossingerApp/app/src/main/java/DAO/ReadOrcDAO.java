
package DAO;


import Beans.Pedidos.Orcamentos;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matheus Henrique
 */
public class ReadOrcDAO {
    
     private Connection con = null;
    ResultSet rs;
    ArrayList<Orcamentos> oLista =  new ArrayList();

    public ReadOrcDAO() {
         con = ConnectionFactory.getConnection();
        
    }
    
    public ArrayList<Orcamentos> lerOrcamentos(){
        
        String sql = "SELECT * FROM mossingerdb.orcamentos";
        PreparedStatement stmt = null;
           
           
           try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Orcamentos orcamento = new Orcamentos();
                
                orcamento.setProtocolo(rs.getLong("Protocolo"));
                orcamento.setIdcliente(rs.getLong("IDCliente"));
                orcamento.setListaprodutos(rs.getString("ListaProdutos"));
                 orcamento.setDatapedido(rs.getString("dataorcamento"));
                    oLista.add(orcamento);
                
            }
               
               
               
           } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return oLista;
        
    }
    
    
    
}
