package View;

import Controller.ComandaController;
import Model.Hamburguer;
import Model.HamburguerVegano;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Comanda extends javax.swing.JFrame {

    private final ComandaController controller;

    public Comanda() {
        initComponents();
        controller = new ComandaController(this);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jButtonVoltar = new javax.swing.JButton();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jLabelCliente1 = new javax.swing.JLabel();
        jRadioButtonHamburguerVeg = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jComboBoxPagamento = new javax.swing.JComboBox<>();
        jLabelPagamento = new javax.swing.JLabel();
        TextData = new javax.swing.JTextField();
        jLabelData = new javax.swing.JLabel();
        TextHora = new javax.swing.JTextField();
        jLabelHora = new javax.swing.JLabel();
        jLabelObservacao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaObservacao = new javax.swing.JTextArea();
        jButtonFinalizar = new javax.swing.JButton();
        jLabelPainel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabelPlanoFundo = new javax.swing.JLabel();
        jComboBoxPedido = new javax.swing.JComboBox<>();
        jLabelQuantidade = new javax.swing.JLabel();
        jLabelPedido1 = new javax.swing.JLabel();
        jSpinnerQuantidade = new javax.swing.JSpinner();
        jMenuBar3 = new javax.swing.JMenuBar();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jComboBoxCliente.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxCliente.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxCliente.setToolTipText("");
        jComboBoxCliente.setBorder(null);
        jComboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 410, 30));

        jLabelCliente1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCliente1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCliente1.setText("Cliente");
        getContentPane().add(jLabelCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 50, 20));

        jRadioButtonHamburguerVeg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonHamburguerVeg.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonHamburguerVeg.setText("Hambúrguer Vegetariano");
        jRadioButtonHamburguerVeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHamburguerVegActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonHamburguerVeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, -1, 20));

        jTablePedidos.setBackground(new java.awt.Color(255, 255, 255));
        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Itens", "Quantidade", "Valor"
            }
        ));
        jScrollPane3.setViewportView(jTablePedidos);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 410, 110));

        jComboBoxPagamento.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxPagamento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBoxPagamento.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Pix", "Cartão de Crédito", "Cartão de Débito" }));
        jComboBoxPagamento.setToolTipText("");
        jComboBoxPagamento.setBorder(null);
        jComboBoxPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 410, 30));

        jLabelPagamento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPagamento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPagamento.setText("Forma de Pagamento");
        getContentPane().add(jLabelPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, 20));

        TextData.setBackground(new java.awt.Color(255, 255, 255));
        TextData.setForeground(new java.awt.Color(0, 0, 0));
        TextData.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        TextData.setMargin(new java.awt.Insets(2, 10, 2, 10));
        TextData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextDataActionPerformed(evt);
            }
        });
        getContentPane().add(TextData, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 620, 170, 30));

        jLabelData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(255, 255, 255));
        jLabelData.setText("Data do Pedido");
        getContentPane().add(jLabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, -1, 20));

        TextHora.setBackground(new java.awt.Color(255, 255, 255));
        TextHora.setForeground(new java.awt.Color(0, 0, 0));
        TextHora.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        TextHora.setMargin(new java.awt.Insets(2, 10, 2, 10));
        TextHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextHoraActionPerformed(evt);
            }
        });
        getContentPane().add(TextHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, 200, 30));

        jLabelHora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHora.setText("Horário do Pedido");
        getContentPane().add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, -1, 20));

        jLabelObservacao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelObservacao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelObservacao.setText("Observação");
        getContentPane().add(jLabelObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 650, -1, 20));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(0, 0, 0));

        TextAreaObservacao.setBackground(new java.awt.Color(255, 255, 255));
        TextAreaObservacao.setColumns(20);
        TextAreaObservacao.setForeground(new java.awt.Color(0, 0, 0));
        TextAreaObservacao.setRows(5);
        TextAreaObservacao.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 1));
        TextAreaObservacao.setMargin(new java.awt.Insets(2, 10, 2, 10));
        jScrollPane2.setViewportView(TextAreaObservacao);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 670, 410, 40));

        jButtonFinalizar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonFinalizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonFinalizar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonFinalizar.setText("Finalizar");
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 720, -1, 30));

        jLabelPainel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPainel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/painel-login.png"))); // NOI18N
        jLabelPainel.setPreferredSize(new java.awt.Dimension(600, 500));
        getContentPane().add(jLabelPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 560, 610));

        Table.setBackground(new java.awt.Color(204, 204, 204));
        Table.setForeground(new java.awt.Color(0, 0, 0));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "Pedido", "Quantidade", "Valor", "Forma de Pagamento", "Data", "Hora", "Observação"
            }
        ));
        Table.setAlignmentX(0.0F);
        Table.setAlignmentY(0.0F);
        Table.setRowHeight(85);
        Table.setRowMargin(10);
        jScrollPane1.setViewportView(Table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 840, 450));

        jLabelPlanoFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/Background.png"))); // NOI18N
        getContentPane().add(jLabelPlanoFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 0, -1, -1));

        jComboBoxPedido.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxPedido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBoxPedido.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxPedido.setToolTipText("");
        jComboBoxPedido.setBorder(null);
        jComboBoxPedido.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxPedidoItemStateChanged(evt);
            }
        });
        jComboBoxPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 290, 30));

        jLabelQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQuantidade.setText("Bebidas");
        getContentPane().add(jLabelQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 90, 20));

        jLabelPedido1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPedido1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPedido1.setText("Quantidade");
        getContentPane().add(jLabelPedido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, 80, 20));

        jSpinnerQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jSpinnerQuantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jSpinnerQuantidade.setBorder(null);
        getContentPane().add(jSpinnerQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 80, 30));
        setJMenuBar(jMenuBar3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClienteActionPerformed

    private void jComboBoxPedidoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxPedidoItemStateChanged
        //this.controller.atualizaValor();
    }//GEN-LAST:event_jComboBoxPedidoItemStateChanged

    private void jComboBoxPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPedidoActionPerformed

    private void jComboBoxPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPagamentoActionPerformed

    private void TextDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextDataActionPerformed

    private void TextHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextHoraActionPerformed

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
        this.controller.agendar();
        if (jRadioButtonHamburguerVeg.isSelected()) {
            HamburguerVegano hambVegano = new HamburguerVegano(1, "", "", "Hambúrguer artesanal de soja (130 g)", 0.0);
            hambVegano.prepararPedido();
        } else {
            Hamburguer hambPadrao = new Hamburguer(1);
            hambPadrao.prepararPedido();
        }
    }//GEN-LAST:event_jButtonFinalizarActionPerformed

    private void jRadioButtonHamburguerVegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHamburguerVegActionPerformed
        // Verifique se o JRadioButton está selecionado
        if (jRadioButtonHamburguerVeg.isSelected()) {
            // Adicione o texto "Bife vegano" à observação do agendamento
            getTextAreaObservacao().setText("Hambúrguer artesanal de soja (130 g)");
        } else {
            // Deixe a observação vazia
            getTextAreaObservacao().setText("");
        }
    }//GEN-LAST:event_jRadioButtonHamburguerVegActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
        this.controller.navegarMenuPrincipal();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(Comanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Comanda comanda = new Comanda();
                comanda.setExtendedState(JFrame.MAXIMIZED_BOTH);
                comanda.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JTextArea TextAreaObservacao;
    private javax.swing.JTextField TextData;
    private javax.swing.JTextField TextHora;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JComboBox<String> jComboBoxPagamento;
    private javax.swing.JComboBox<String> jComboBoxPedido;
    private javax.swing.JLabel jLabelCliente1;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelObservacao;
    private javax.swing.JLabel jLabelPagamento;
    private javax.swing.JLabel jLabelPainel;
    private javax.swing.JLabel jLabelPedido1;
    private javax.swing.JLabel jLabelPlanoFundo;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JRadioButton jRadioButtonHamburguerVeg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinnerQuantidade;
    private javax.swing.JTable jTablePedidos;
    // End of variables declaration//GEN-END:variables

// GETTER E SETTER
    public JTable getTable() {
        return Table;
    }

    public void setTable(JTable Table) {
        this.Table = Table;
    }

    public JTable getjTablePedidos() {
        return jTablePedidos;
    }

    public void setjTablePedidos(JTable jTablePedidos) {
        this.jTablePedidos = jTablePedidos;
    }

    public JComboBox<String> getjComboBoxCliente() {
        return jComboBoxCliente;
    }

    public void setjComboBoxCliente(JComboBox<String> jComboBoxCliente) {
        this.jComboBoxCliente = jComboBoxCliente;
    }

    public JComboBox<String> getjComboBoxPagamento() {
        return jComboBoxPagamento;
    }

    public void setjComboBoxPagamento(JComboBox<String> jComboBoxPagamento) {
        this.jComboBoxPagamento = jComboBoxPagamento;
    }

    public JComboBox<String> getjComboBoxPedido() {
        return jComboBoxPedido;
    }

    public void setjComboBoxPedido(JComboBox<String> jComboBoxPedido) {
        this.jComboBoxPedido = jComboBoxPedido;
    }

    public JRadioButton getjRadioButtonHamburguerVeg() {
        return jRadioButtonHamburguerVeg;
    }

    public void setjRadioButtonHamburguerVeg(JRadioButton jRadioButtonHamburguerVeg) {
        this.jRadioButtonHamburguerVeg = jRadioButtonHamburguerVeg;
    }

    public JSpinner getjSpinnerQuantidade() {
        return jSpinnerQuantidade;
    }

    public void setjSpinnerQuantidade(JSpinner jSpinnerQuantidade) {
        this.jSpinnerQuantidade = jSpinnerQuantidade;
    }

    public JTextArea getTextAreaObservacao() {
        return TextAreaObservacao;
    }

    public void setTextAreaObservacao(JTextArea TextAreaObservacao) {
        this.TextAreaObservacao = TextAreaObservacao;
    }

    public JTextField getTextData() {
        return TextData;
    }

    public void setTextData(JTextField TextData) {
        this.TextData = TextData;
    }

    public JTextField getTextHora() {
        return TextHora;
    }

    public void setTextHora(JTextField TextHora) {
        this.TextHora = TextHora;
    }
    
    public ComandaController getController() {
        return controller;
    }

    private void iniciar() {
        this.controller.atualizarTabela();
        this.controller.atualizaCliente();
        this.controller.atualizaPedido();
        //this.controller.atualizaValor();
    }
}
