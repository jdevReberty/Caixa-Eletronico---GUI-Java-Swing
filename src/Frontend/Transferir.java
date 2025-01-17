package Frontend;

import java.util.List;
import Backend.Client.Cliente;
import Backend.Response.ResponseCliente;
import Backend.Transacao;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Digim
 */
public class Transferir extends javax.swing.JFrame {
    
    Cliente cliente;
    List<Cliente> listaCliente;
    private Transacao transacao;
    
    public Transferir(Cliente cliente, List<Cliente> listaClientes) {
        initComponents();
        this.transacao = new Transacao();
        this.cliente = cliente;
        this.listaCliente = listaClientes;
        jLNomeCliente.setText(this.cliente.getNome());
        jLSaldoCorrente.setText(String.valueOf(this.cliente.getContaCorrente().getSaldo()));        
        jLSaldoPoupanca.setText(String.valueOf(this.cliente.getContaPoupanca().getSaldo()));
    }
    
    public Transferir() {
        initComponents();
    }
    
    public Transacao getTransacao() {
        return this.transacao;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLNomeCliente = new javax.swing.JLabel();
        jLabelCorrente = new javax.swing.JLabel();
        jLSaldoCorrente = new javax.swing.JLabel();
        jLabelPoupanca = new javax.swing.JLabel();
        jLSaldoPoupanca = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jBFinalizar = new javax.swing.JButton();
        jBtnVoltar = new javax.swing.JButton();
        JPSenha = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jTFValor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTFContaDestinatario = new javax.swing.JTextField();

        jLabel2.setText("Roberval da Silva");

        jLabel4.setText("Saldo R$ 3250");

        jLabel5.setText("Saldo R$ 3250");

        jLabel6.setText("Roberval da Silva");

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 123, 255));

        jLNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLNomeCliente.setText("Nome do usuário");

        jLabelCorrente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCorrente.setText("Corrente  R$ ");

        jLSaldoCorrente.setForeground(new java.awt.Color(255, 255, 255));
        jLSaldoCorrente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLSaldoCorrente.setText("0");

        jLabelPoupanca.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPoupanca.setText("Poupança R$ ");

        jLSaldoPoupanca.setForeground(new java.awt.Color(255, 255, 255));
        jLSaldoPoupanca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLSaldoPoupanca.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNomeCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPoupanca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLSaldoPoupanca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCorrente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLSaldoCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCorrente)
                    .addComponent(jLSaldoCorrente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPoupanca)
                    .addComponent(jLSaldoPoupanca))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLNomeCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setText("Home > Transferir");

        jLabel10.setText("Conta (Destinatário)");

        jBFinalizar.setBackground(new java.awt.Color(255, 255, 255));
        jBFinalizar.setText("Finalizar");
        jBFinalizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 123, 255), 3));
        jBFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFinalizarActionPerformed(evt);
            }
        });

        jBtnVoltar.setBackground(new java.awt.Color(204, 204, 204));
        jBtnVoltar.setText("Cancelar");
        jBtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVoltarActionPerformed(evt);
            }
        });

        JPSenha.setForeground(new java.awt.Color(0, 123, 255));
        JPSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JPSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPSenhaActionPerformed(evt);
            }
        });

        jLabel11.setText("Senha");

        jTFValor.setForeground(new java.awt.Color(0, 123, 255));
        jTFValor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTFValor.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jTFValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFValorActionPerformed(evt);
            }
        });

        jLabel12.setText("Valor");

        jTFContaDestinatario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTFContaDestinatario.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jTFContaDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFContaDestinatarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPSenha)
                    .addComponent(jTFContaDestinatario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBtnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFContaDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFValorActionPerformed

    private void JPSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPSenhaActionPerformed

    private void jBFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFinalizarActionPerformed
        try {
            //            double saldoDisponivel = cliente.getContaCorrente().getSaldo();

            boolean existeDestinatario = CaixaEletronico.checaExisteCliente(this.listaCliente, jTFContaDestinatario.getText());
            String destinatario = String.valueOf(jTFContaDestinatario.getText());
            double valorTransferencia = Double.parseDouble(jTFValor.getText());
            String senhaInformada = String.valueOf(JPSenha.getPassword());
            
            ResponseCliente response = 
                    this.transacao.transferir(this.listaCliente, this.cliente, 
                            destinatario, senhaInformada, valorTransferencia);
            
            if(response.getStatus() != 200) {
                throw new Exception(response.getException());
            }
            this.cliente = response.getCliente();
            this.listaCliente = response.getListaClientes();
            
            jLabelCorrente.setText( String.valueOf(cliente.getContaCorrente().getSaldo()) );
            
//            listaCliente = CaixaEletronico.atualizaValoresClienteLogado(listaCliente, cliente);
            
            this.dispose();
            Principal principal = new Principal(cliente, listaCliente);
            principal.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jBFinalizarActionPerformed

    private void jBtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVoltarActionPerformed
        try {
            this.dispose();
            Principal principal = new Principal(cliente, listaCliente);
            principal.setVisible(true);
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_jBtnVoltarActionPerformed

    private void jTFContaDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFContaDestinatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFContaDestinatarioActionPerformed

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
            java.util.logging.Logger.getLogger(Transferir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transferir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transferir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transferir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transferir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JPSenha;
    private javax.swing.JButton jBFinalizar;
    private javax.swing.JButton jBtnVoltar;
    private javax.swing.JLabel jLNomeCliente;
    private javax.swing.JLabel jLSaldoCorrente;
    private javax.swing.JLabel jLSaldoPoupanca;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCorrente;
    private javax.swing.JLabel jLabelPoupanca;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JTextField jTFContaDestinatario;
    private javax.swing.JTextField jTFValor;
    // End of variables declaration//GEN-END:variables
}
