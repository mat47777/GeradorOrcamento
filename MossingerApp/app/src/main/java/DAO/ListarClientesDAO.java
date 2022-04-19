/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Beans.Clientes.Cliente;
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
public class ListarClientesDAO {
    
    private Connection con = null;
    ResultSet rs;
    ArrayList<Cliente> mLista =  new ArrayList();
    
        public ListarClientesDAO(){
        
        con = ConnectionFactory.getConnection();
        
    }
        
        
          public ArrayList<Cliente> listarClientes(){
        
        String sql = "SELECT * FROM mossingerdb.clientes";
        PreparedStatement stmt = null;
        
       
        
        try {
            
              stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Cliente cliente = new Cliente();
                
                cliente.setId(rs.getLong("ClienteID"));
                cliente.setNome(rs.getString("Nome"));
                cliente.setRazaoSocial(rs.getString("RazaoSocial"));
                cliente.setEndereco(rs.getString("Endereco"));
                cliente.setCidade(rs.getString("Cidade"));
                cliente.setCnpj(rs.getString("CNPJ"));
                cliente.setCpf(rs.getString("CPF"));
                cliente.setEmail(rs.getString("EMAIL"));
                cliente.setCelular(rs.getInt("celular"));
                cliente.setTelefone(rs.getInt("telefone"));
                cliente.setCep(rs.getInt("CEP"));
                cliente.setDatanascimento(rs.getString("DataNascimento"));
                cliente.setUf(rs.getString("UF"));
                cliente.setBanco(rs.getString("Banco"));
                cliente.setAgencia(rs.getString("Agencia"));
                cliente.setContatobanco(rs.getString("ContatoBanco"));
                
                mLista.add(cliente);
                
                
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return mLista;
    }
    
}
