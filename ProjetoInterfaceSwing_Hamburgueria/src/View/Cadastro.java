package View;

import Controller.CadastroController;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Cadastro extends javax.swing.JFrame {

    private final CadastroController controller;

    public Cadastro() {
        initComponents();
        controller = new CadastroController(this);
        iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCliente1 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextEndereco = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextTelefone1 = new javax.swing.JTextField();
        jLabelUsuario = new javax.swing.JLabel();
        jTextUsuario1 = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jTextSenha = new javax.swing.JTextField();
        jButtonFinalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabelPainel = new javax.swing.JLabel();
        jLabelPapelParede = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCliente1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCliente1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCliente1.setText("Nome");
        getContentPane().add(jLabelCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 40, -1));

        jTextNome.setBackground(new java.awt.Color(255, 255, 255));
        jTextNome.setForeground(new java.awt.Color(0, 0, 0));
        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 410, 40));

        jLabelEndereco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEndereco.setText("Endereço");
        getContentPane().add(jLabelEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jTextEndereco.setBackground(new java.awt.Color(255, 255, 255));
        jTextEndereco.setForeground(new java.awt.Color(0, 0, 0));
        jTextEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 410, 40));

        jLabelTelefone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTelefone.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefone.setText("Telefone");
        getContentPane().add(jLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 50, -1));

        jTextTelefone1.setBackground(new java.awt.Color(255, 255, 255));
        jTextTelefone1.setForeground(new java.awt.Color(0, 0, 0));
        jTextTelefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefone1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextTelefone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 410, 40));

        jLabelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuário");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, 20));

        jTextUsuario1.setBackground(new java.awt.Color(255, 255, 255));
        jTextUsuario1.setForeground(new java.awt.Color(0, 0, 0));
        jTextUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUsuario1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 410, 40));

        jLabelSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSenha.setText("Senha");
        getContentPane().add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        jTextSenha.setBackground(new java.awt.Color(255, 255, 255));
        jTextSenha.setForeground(new java.awt.Color(0, 0, 0));
        jTextSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 410, 40));

        jButtonFinalizar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonFinalizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonFinalizar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonFinalizar.setText("Finalizar");
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 690, -1, 30));

        Table.setBackground(new java.awt.Color(204, 204, 204));
        Table.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        Table.setForeground(new java.awt.Color(0, 0, 0));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Endereço", "Pedido", "Quantidade", "Forma de Pagamento", "Valor", "Observação"
            }
        ));
        jScrollPane1.setViewportView(Table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 280, 470));

        jLabelPainel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/painel-login.png"))); // NOI18N
        getContentPane().add(jLabelPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 200, 550, 610));

        jLabelPapelParede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/@hamburgueria.710.png"))); // NOI18N
        getContentPane().add(jLabelPapelParede, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeActionPerformed

    private void jTextSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSenhaActionPerformed

    private void jTextEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEnderecoActionPerformed

    private void jTextTelefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelefone1ActionPerformed

    private void jTextUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUsuario1ActionPerformed

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
        this.controller.cadastrar();
    }//GEN-LAST:event_jButtonFinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JLabel jLabelCliente1;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelPainel;
    private javax.swing.JLabel jLabelPapelParede;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextEndereco;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextSenha;
    private javax.swing.JTextField jTextTelefone1;
    private javax.swing.JTextField jTextUsuario1;
    // End of variables declaration//GEN-END:variables

    public JTable getTable() {
        return Table;
    }

    public void setTable(JTable Table) {
        this.Table = Table;
    }

    public JTextField getjTextEndereco() {
        return jTextEndereco;
    }

    public void setjTextEndereco(JTextField jTextEndereco) {
        this.jTextEndereco = jTextEndereco;
    }

//    public JTextField getjTextID() {
//        return jTextID;
//    }
//
//    public void setjTextID(JTextField jTextID) {
//        this.jTextID = jTextID;
//    }
    public JTextField getjTextNome() {
        return jTextNome;
    }

    public void setjTextNome(JTextField jTextNome) {
        this.jTextNome = jTextNome;
    }

    public JTextField getjTextTelefone1() {
        return jTextTelefone1;
    }

    public void setjTextTelefone1(JTextField jTextTelefone1) {
        this.jTextTelefone1 = jTextTelefone1;
    }

    public JTextField getjTextUsuario1() {
        return jTextUsuario1;
    }

    public void setjTextUsuario1(JTextField jTextUsuario1) {
        this.jTextUsuario1 = jTextUsuario1;
    }

    public JTextField getjTextSenha() {
        return jTextSenha;
    }

    public void setjTextSenha(JTextField jTextSenha) {
        this.jTextSenha = jTextSenha;
    }

    private void iniciar() {
        this.controller.atualizarTabela();
        this.controller.atualizaCliente();
    }

}
