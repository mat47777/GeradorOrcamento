/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Beans.Pedidos.Orcamentos;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class UpdateOrcDAO {
    
         private Connection con = null;

    public UpdateOrcDAO() {
        
             con = ConnectionFactory.getConnection();
             
    }
    
    public void update(Orcamentos orcamento){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            
            stmt = con.prepareStatement("UPDATE orcamentos SET ListaProdutos = ? WHERE Protocolo = ?");
            stmt.setString(1,orcamento.getListaprodutos());
            stmt.setLong(2, orcamento.getProtocolo());
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
          
        } finally {
            
            ConnectionFactory.closeConnection(con,stmt);
        
    }
        
     
        
        
    }
    
    
         
         
    
}
