/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/JApplet.java to edit this template
 */
package testes;

import javax.swing.JApplet;

/**
 *
 * @author Jackson
 */
public class AppTabbed extends javax.swing.JFrame {

    public AppTabbed() {
        initComponents();
    }

    private void initComponents() {
       //(1)
        jTabbedPaneContainer = new javax.swing.JTabbedPane();
        jPanelGeral = new javax.swing.JPanel();
        jPanelProfissional = new javax.swing.JPanel();
        jPanelPessoal = new javax.swing.JPanel();
        jPanelObservacao = new javax.swing.JPanel();
        jTabbedPaneContainer.add("Geral", jPanelGeral);
       jTabbedPaneContainer.add("Profissional", jPanelProfissional);
       jTabbedPaneContainer.add("Pessoal", jPanelPessoal);
       jTabbedPaneContainer.add("Observação", jPanelObservacao);

        //(2)
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCargo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTipoSanguineo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObservacao = new javax.swing.JTextArea();
        jButtonProximo = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();

        //(3)
        jLabel1.setText("Nome");
        jLabel4.setText("Tipo Sangu\u00edneo");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        jLabel3.setText("Cargo");
        jTextAreaObservacao.setColumns(20);
        jTextAreaObservacao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObservacao);
        jButtonProximo.setText("Proximo");
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });

        jButtonAnterior.setText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });


        //(4)
        javax.swing.GroupLayout jPanelGeralLayout = new javax.swing
        .GroupLayout(jPanelGeral);
        jPanelGeral.setLayout(jPanelGeralLayout);
        jPanelGeralLayout.setHorizontalGroup(
            jPanelGeralLayout.createParallelGroup(javax.swing
            .GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGeralLayout.createParallelGroup
                (javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNome, javax.swing.
                    GroupLayout.PREFERRED_SIZE, 228, javax.swing
                    .GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanelGeralLayout.setVerticalGroup(
            jPanelGeralLayout.createParallelGroup(javax.swing
            .GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle
                .ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing
                .GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout
                .DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );




        javax.swing.GroupLayout jPanelProfissionalLayout = new javax
        .swing.GroupLayout(jPanelProfissional);
        jPanelProfissional.setLayout(jPanelProfissionalLayout);
        jPanelProfissionalLayout.setHorizontalGroup(
            jPanelProfissionalLayout.createParallelGroup(javax.swing
            .GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfissionalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProfissionalLayout.createParallelGroup
                (javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCargo, javax.swing
                    .GroupLayout.PREFERRED_SIZE, 211, javax.swing
                    .GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanelProfissionalLayout.setVerticalGroup(
            jPanelProfissionalLayout.createParallelGroup
            (javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfissionalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.
                ComponentPlacement.RELATED)
                .addComponent(jTextFieldCargo, javax.swing.
                GroupLayout.PREFERRED_SIZE, javax.swing.
                GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.
                PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );



        javax.swing.GroupLayout jPanelPessoalLayout = new javax.
        swing.GroupLayout(jPanelPessoal);
        jPanelPessoal.setLayout(jPanelPessoalLayout);
        jPanelPessoalLayout.setHorizontalGroup(
            jPanelPessoalLayout.createParallelGroup(javax.swing
            .GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPessoalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPessoalLayout.createParallelGroup
                (javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldTipoSanguineo, javax
                    .swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout
                    .Alignment.LEADING, javax.swing.GroupLayout
                    .DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    Short.MAX_VALUE))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        jPanelPessoalLayout.setVerticalGroup(
            jPanelPessoalLayout.createParallelGroup(javax.swing.GroupLayout
            .Alignment.LEADING)
            .addGroup(jPanelPessoalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle
                .ComponentPlacement.RELATED)
                .addComponent(jTextFieldTipoSanguineo, javax.swing
                .GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout
                .DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );



        javax.swing.GroupLayout jPanelObservacaoLayout = new javax
        .swing.GroupLayout(jPanelObservacao);
        jPanelObservacao.setLayout(jPanelObservacaoLayout);
        jPanelObservacaoLayout.setHorizontalGroup(
            jPanelObservacaoLayout.createParallelGroup(javax.swing
            .GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment
            .TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 377,
            Short.MAX_VALUE)
        );
        jPanelObservacaoLayout.setVerticalGroup(
            jPanelObservacaoLayout.createParallelGroup(javax.swing
            .GroupLayout.Alignment.LEADING)
            .addGroup(jPanelObservacaoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout
                .PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.
        GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout
            .Alignment.LEADING)
            .addComponent(jTabbedPaneContainer, javax.swing.GroupLayout
            .DEFAULT_SIZE, 382, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonProximo)
                .addPreferredGap(javax.swing.LayoutStyle.
                ComponentPlacement.RELATED)
                .addComponent(jButtonAnterior)
                .addContainerGap(182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout
            .Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneContainer, javax.swing
                .GroupLayout.PREFERRED_SIZE, 107, javax.swing
                .GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle
                .ComponentPlacement.RELATED, javax.swing.GroupLayout
                .DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing
                .GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProximo)
                    .addComponent(jButtonAnterior))
                .addContainerGap())
        );
        pack();
    }

    private void jButtonAnteriorActionPerformed(java.awt.event
    .ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
       int i = jTabbedPaneContainer.getSelectedIndex();

       if (i == 0){
             jTabbedPaneContainer.setSelectedIndex
             (jTabbedPaneContainer.getComponentCount()-1);
       }else{
             jTabbedPaneContainer.setSelectedIndex(i-1);
       }
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed
    (java.awt.event.ActionEvent evt) {//GEN-FIRST:
    event_jButtonProximoActionPerformed
       int i = jTabbedPaneContainer.getSelectedIndex();

       if (jTabbedPaneContainer.getComponentCount() - 1 == i){
             jTabbedPaneContainer.setSelectedIndex(0);
       }else{
             jTabbedPaneContainer.setSelectedIndex(i+1);
       }
    }//GEN-LAST:event_jButtonProximoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppTabbed().setVisible(true);
            }
        });
    }

    // Declaração de variáveis
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelGeral;
    private javax.swing.JPanel jPanelObservacao;
    private javax.swing.JPanel jPanelPessoal;
    private javax.swing.JPanel jPanelProfissional;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneContainer;
    private javax.swing.JTextArea jTextAreaObservacao;
    private javax.swing.JTextField jTextFieldCargo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTipoSanguineo;
    // Fim da declaração de variáveis

}