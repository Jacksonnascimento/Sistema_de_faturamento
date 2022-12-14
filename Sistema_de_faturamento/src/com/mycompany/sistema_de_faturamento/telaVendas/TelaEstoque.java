/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistema_de_faturamento.telaVendas;
  
import com.mycompany.sistema_de_faturamento.Estoque;
import com.mycompany.sistema_de_faturamento.EstoqueProdutos;
import com.mycompany.sistema_de_faturamento.Produto;
import com.mycompany.sistema_de_faturamento.Produtos;
import com.mycompany.sistema_de_faturamento.VendaProduto;
import com.mycompany.sistema_de_faturamento.telaOpcoes.TelaOpcoes;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jackson
 */
public class TelaEstoque extends javax.swing.JFrame {
    private Produtos produtos = new Produtos();
    private int codigoPro;
    private int quantiEstoq;
    private EstoqueProdutos  estoqueprodutos;
    /**
     * Creates new form TelaEstoque
     */
    public TelaEstoque() throws SQLException {
        initComponents();
        produtos.buscarProdutosBancos();
        
    }
    
    public void quantiVendas(){
        VendaProduto venda = new VendaProduto();
        quantidadeVendidas.setText(venda.quantidadeVendasProduto(codigoPro) + "");
    }
    
    public void preencherEstoque() throws SQLException{
         estoqueprodutos = new EstoqueProdutos();
         estoqueprodutos.buscarEstoquebanco();
    }
    
    public void zerarInfo(){
        descricaoProduto.setText(null);     
        codigoProduto.setText(null);
        quantidadeProduto.setText(null);
        quantidadeVendidas.setText(null);
    }
    
    public Estoque locarEstoque(int cod) throws SQLException{
        return estoqueprodutos.oProdutoQuant(cod);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        codigoProduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        descricaoProduto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        quantidadeProduto = new javax.swing.JTextField();
        quantidadeVendidas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoProdutoActionPerformed(evt);
            }
        });

        jLabel1.setText("C??digo do produto");

        descricaoProduto.setText("Descri????o do produto");

        jLabel2.setText("Quantidade do produto");

        quantidadeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeProdutoActionPerformed(evt);
            }
        });

        quantidadeVendidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeVendidasActionPerformed(evt);
            }
        });

        jLabel3.setText("Unidades vendidas");

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(quantidadeProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(codigoProduto, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantidadeVendidas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(descricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantidadeVendidas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoProdutoActionPerformed
        codigoPro = Integer.parseInt(codigoProduto.getText());
        try {
            preencherEstoque();
        } catch (SQLException ex) {
            Logger.getLogger(TelaEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
        Estoque estoque;
        Produto produto = produtos.buscarPorID(codigoPro);
        try {
            estoque = locarEstoque(codigoPro);
            
            if (produto == null){
            zerarInfo();
            
            } else {
                descricaoProduto.setText(produto.getDscricao());
                 quantiVendas();
                if(estoque == null){
                    preencherEstoque();
                    estoque = locarEstoque(codigoPro);
                }   
                    String quantidade = estoque.getQuantidade() + "";
                    quantidadeProduto.setText(quantidade);
                    
                
               
            
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_codigoProdutoActionPerformed

    private void quantidadeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeProdutoActionPerformed
        Estoque estoque = new Estoque();
        estoque.addQuantiUpdateBanco(codigoPro, Integer.parseInt(quantidadeProduto.getText()));
    }//GEN-LAST:event_quantidadeProdutoActionPerformed

    private void quantidadeVendidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeVendidasActionPerformed
       
    }//GEN-LAST:event_quantidadeVendidasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaOpcoes telaOpcoes = new TelaOpcoes();
        telaOpcoes.setVisible(rootPaneCheckingEnabled);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaEstoque().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaEstoque.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigoProduto;
    private javax.swing.JLabel descricaoProduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField quantidadeProduto;
    private javax.swing.JTextField quantidadeVendidas;
    // End of variables declaration//GEN-END:variables
}
