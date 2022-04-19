/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MossingerApp;


import Beans.Clientes.Cliente;
import Beans.Pedidos.Orcamentos;
import DAO.ListarClientesDAO;
import DAO.OrcamentoDAO;
import com.sun.tools.javac.Main;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class MClientes extends javax.swing.JFrame {

    /**
     * Creates new form MClientes
     */
    public MClientes() {
        initComponents();
        
        
listarClientes();

    }
    
    public void listarClientes(){
        
         try {
        
        ListarClientesDAO  listarclientesdao = new ListarClientesDAO();
        DefaultTableModel model = (DefaultTableModel) tClientes.getModel();
         model.setNumRows(0);
         ArrayList<Cliente> cLista = listarclientesdao.listarClientes();
         
             for(int i = 0; i < cLista.size(); i++){
                
                model.addRow(new Object[]{
                  
                    cLista.get(i).getId(),
                    cLista.get(i).getNome(),
                    cLista.get(i).getRazaoSocial(),
                    cLista.get(i).getEndereco(),
                    cLista.get(i).getCidade(),
                    cLista.get(i).getCnpj(),
                    cLista.get(i).getCpf(),
                    cLista.get(i).getEmail(),
                    cLista.get(i).getCelular(),
                    cLista.get(i).getTelefone(),
                    cLista.get(i).getCep(),
                    cLista.get(i).getDatanascimento(),
                    cLista.get(i).getUf(),
                    cLista.get(i).getBanco(),
                    cLista.get(i).getAgencia(),
                    cLista.get(i).getContatobanco(),
                    
                });
                
          
                
                
            }
             
         } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "ClientesFrame :" + e);
        }
        
        
        
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tClientes = new javax.swing.JTable();
        btnNova = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Clientes");

        tClientes.setBackground(new java.awt.Color(153, 153, 153));
        tClientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Raz�o Social", "Endere�o", "Cidade", "CNPJ", "CPF", "EMAIL", "Celular", "Telefone", "CEP", "Data Nascimento", "UF", "Banco", "Ag�ncia", "Contato Banco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tClientes);

        btnNova.setText("Novo Or�amento");
        btnNova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaActionPerformed(evt);
            }
        });

        btnVer.setText("Ver Or�amentos");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNova)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVer)
                    .addComponent(btnNova, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    Principal principal = null;
    
    public void getcontext(Principal principal){
        
        this.principal = principal;
        
        
    }
    
    private void btnNovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaActionPerformed

     
         long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        
        Orcamentos orcamento = new Orcamentos(number,Long.parseLong(tClientes.getValueAt(tClientes.getSelectedRow(), 0).toString()),";","29/03/2022");
        OrcamentoDAO orcamentodao = new OrcamentoDAO();
        
           if ((orcamentodao.create(orcamento))){
            System.out.println("Salvo com Sucesso");
        } else {
          System.err.println("Erro");
        }
    
       
       principal.preencher(Long.toString(number),tClientes.getValueAt(tClientes.getSelectedRow(), 0).toString(),
               tClientes.getValueAt(tClientes.getSelectedRow(), 1).toString(),
               tClientes.getValueAt(tClientes.getSelectedRow(), 2).toString(),
               tClientes.getValueAt(tClientes.getSelectedRow(), 3).toString(),
               tClientes.getValueAt(tClientes.getSelectedRow(), 4).toString(),
               tClientes.getValueAt(tClientes.getSelectedRow(), 5).toString(),
               tClientes.getValueAt(tClientes.getSelectedRow(), 6).toString(),
               tClientes.getValueAt(tClientes.getSelectedRow(), 7).toString(),
               Long.parseLong(tClientes.getValueAt(tClientes.getSelectedRow(), 8).toString()),
               Long.parseLong(tClientes.getValueAt(tClientes.getSelectedRow(), 9).toString()),
               Integer.parseInt(tClientes.getValueAt(tClientes.getSelectedRow(), 10).toString()),
               tClientes.getValueAt(tClientes.getSelectedRow(), 11).toString(),
               tClientes.getValueAt(tClientes.getSelectedRow(), 12).toString(),
               tClientes.getValueAt(tClientes.getSelectedRow(), 13).toString(),
               tClientes.getValueAt(tClientes.getSelectedRow(), 14).toString(),
               tClientes.getValueAt(tClientes.getSelectedRow(), 15).toString());
       
       this.dispose();
       
    
    }//GEN-LAST:event_btnNovaActionPerformed

    
    

    
  
    
    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed

        String nomecliente = tClientes.getValueAt(tClientes.getSelectedRow(), 1).toString();
        String idcliente  = tClientes.getValueAt(tClientes.getSelectedRow(), 0).toString();
        String rzs = tClientes.getValueAt(tClientes.getSelectedRow(), 2).toString();
        String endereco = tClientes.getValueAt(tClientes.getSelectedRow(), 3).toString();
        String cidade = tClientes.getValueAt(tClientes.getSelectedRow(), 4).toString();
        String cnpj = tClientes.getValueAt(tClientes.getSelectedRow(), 5).toString();
        String cpf = tClientes.getValueAt(tClientes.getSelectedRow(), 6).toString();
        String email = tClientes.getValueAt(tClientes.getSelectedRow(), 7).toString();
        String celular = tClientes.getValueAt(tClientes.getSelectedRow(), 8).toString();
        String telefone = tClientes.getValueAt(tClientes.getSelectedRow(), 9).toString();
        String cep = tClientes.getValueAt(tClientes.getSelectedRow(), 10).toString();
        String datanasci = tClientes.getValueAt(tClientes.getSelectedRow(), 11).toString();
        String uf = tClientes.getValueAt(tClientes.getSelectedRow(), 12).toString();
        String banco = tClientes.getValueAt(tClientes.getSelectedRow(), 13).toString();
        String agencia = tClientes.getValueAt(tClientes.getSelectedRow(), 14).toString();
        String contatobanco = tClientes.getValueAt(tClientes.getSelectedRow(), 15).toString();
        
        
        OrcamentosForm orcamentosform = new OrcamentosForm();// obj created for class Second()
	orcamentosform.getcontext(this,nomecliente,idcliente,
                rzs,endereco,cidade,cnpj,cpf,email,celular,telefone,cep,datanasci,uf,
                banco,agencia,contatobanco,principal);//Execute the method my_update to pass str
        orcamentosform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	orcamentosform.setVisible(true); // Open the Second.java window
        
        
        
        //this.setEnabled(false);
   
        
        
    }//GEN-LAST:event_btnVerActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      
       principal.setEnabled(true);
       principal.setVisible(true);
        
        
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MClientes().setVisible(true);
                
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNova;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tClientes;
    // End of variables declaration//GEN-END:variables
}