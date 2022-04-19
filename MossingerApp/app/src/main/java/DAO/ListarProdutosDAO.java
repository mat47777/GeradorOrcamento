/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Beans.Produtos.Produtos;
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
 * @author User
 */
public class ListarProdutosDAO {
    
    private Connection con = null;
    ResultSet rs;
    ArrayList<Produtos> pLista =  new ArrayList();
    
        public ListarProdutosDAO(){
        
        con = ConnectionFactory.getConnection();
        
    }
        
         public ArrayList<Produtos> listarProdutos(String produto){
             
        String sql = "SELECT * FROM mossingerdb." + produto;
        PreparedStatement stmt = null;
             
        try{
            
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Produtos produtos = new Produtos();
                
                produtos.setId(rs.getLong(produto + "ID"));
                produtos.setPModelo(rs.getString("Modelo"));
                produtos.setCusto(rs.getLong("CustoDeFabricacao"));
                pLista.add(produtos);
              
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return pLista;
         }
    
}
