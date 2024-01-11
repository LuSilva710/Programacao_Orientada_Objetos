package View;

import Controller.CadastroController;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Cadastro extends javax.swing.JFrame {

    private final CadastroController controller;

    public Cadastro() {
        initComponents();
        controller = new CadastroController(this);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCliente1 = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jTextNome = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextEndereco = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextBairro = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextTelefone1 = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
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
        getContentPane().add(jLabelCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 40, -1));

        jButtonVoltar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonVoltar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/arrow.png"))); // NOI18N
        jButtonVoltar.setBorder(null);
        jButtonVoltar.setBorderPainted(false);
        jButtonVoltar.setFocusable(false);
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jTextNome.setBackground(new java.awt.Color(255, 255, 255));
        jTextNome.setForeground(new java.awt.Color(0, 0, 0));
        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 410, 40));

        jLabelEndereco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEndereco.setText("Endereço");
        getContentPane().add(jLabelEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));

        jTextEndereco.setBackground(new java.awt.Color(255, 255, 255));
        jTextEndereco.setForeground(new java.awt.Color(0, 0, 0));
        jTextEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 410, 40));

        jLabelBairro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelBairro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBairro.setText("Bairro");
        getContentPane().add(jLabelBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, -1, -1));

        jTextBairro.setBackground(new java.awt.Color(255, 255, 255));
        jTextBairro.setForeground(new java.awt.Color(0, 0, 0));
        jTextBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBairroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, 410, 40));

        jLabelTelefone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTelefone.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefone.setText("Telefone");
        getContentPane().add(jLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 630, 50, -1));

        jTextTelefone1.setBackground(new java.awt.Color(255, 255, 255));
        jTextTelefone1.setForeground(new java.awt.Color(0, 0, 0));
        jTextTelefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefone1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextTelefone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 650, 410, 40));

        jLabelID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID.setText("ID");
        getContentPane().add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        jTextID.setBackground(new java.awt.Color(255, 255, 255));
        jTextID.setForeground(new java.awt.Color(0, 0, 0));
        jTextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 410, 40));

        jButtonFinalizar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonFinalizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonFinalizar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonFinalizar.setText("Finalizar");
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 720, -1, 30));

        Table.setBackground(new java.awt.Color(204, 204, 204));
        Table.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        Table.setForeground(new java.awt.Color(0, 0, 0));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "Telefone", "Endereço", "Bairro"
            }
        ));
        jScrollPane1.setViewportView(Table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 640, 460));

        jLabelPainel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/painel-login.png"))); // NOI18N
        getContentPane().add(jLabelPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 550, 600));

        jLabelPapelParede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/Background.png"))); // NOI18N
        getContentPane().add(jLabelPapelParede, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 0, 1920, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeActionPerformed

    private void jTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDActionPerformed

    private void jTextEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEnderecoActionPerformed

    private void jTextTelefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelefone1ActionPerformed

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
        this.controller.cadastrar();
    }//GEN-LAST:event_jButtonFinalizarActionPerformed

    private void jTextBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBairroActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
        this.controller.navegarMenuPrincipal();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cadastro cadastro = new Cadastro();
                cadastro.setExtendedState(JFrame.MAXIMIZED_BOTH);
                cadastro.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCliente1;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelPainel;
    private javax.swing.JLabel jLabelPapelParede;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextBairro;
    private javax.swing.JTextField jTextEndereco;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextTelefone1;
    // End of variables declaration//GEN-END:variables

    public JTable getTable() {
        return Table;
    }

    public void setTable(JTable Table) {
        this.Table = Table;
    }

    public JTextField getjTextID() {
        return jTextID;
    }

    public void setjTextID(JTextField jTextID) {
        this.jTextID = jTextID;
    }

    public JTextField getjTextNome() {
        return jTextNome;
    }

    public void setjTextNome(JTextField jTextNome) {
        this.jTextNome = jTextNome;
    }

    public JTextField getjTextEndereco() {
        return jTextEndereco;
    }

    public void setjTextEndereco(JTextField jTextEndereco) {
        this.jTextEndereco = jTextEndereco;
    }

    public JTextField getjTextBairro() {
        return jTextBairro;
    }

    public void setjTextBairro(JTextField jTextBairro) {
        this.jTextBairro = jTextBairro;
    }

    public JTextField getjTextTelefone1() {
        return jTextTelefone1;
    }

    public void setjTextTelefone1(JTextField jTextTelefone1) {
        this.jTextTelefone1 = jTextTelefone1;
    }

    private void iniciar() {
        this.controller.atualizarTabela();
        this.controller.atualizaCliente();
    }
}
