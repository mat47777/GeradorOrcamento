/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Beans.Pedidos.Orcamentos;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author User
 */
public class DeleteOrcDAO {
    
         private Connection con = null;

    public DeleteOrcDAO() {
        
        con = ConnectionFactory.getConnection();
        
    }
    
    
    public void delete(Orcamentos orcamento){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
    }
         
         
    
}
