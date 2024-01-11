package View;

import Controller.MenuPrincipalController;
import Model.Hamburguer;
import javax.swing.JFrame;
import javax.swing.JTable;

public class MenuPrincipal extends javax.swing.JFrame {

    private final MenuPrincipalController controller;

    public MenuPrincipal() {
        initComponents();
        this.controller = new MenuPrincipalController(this);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelTitulo1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanelBurger7 = new javax.swing.JPanel();
        jLabelNomeBurger2 = new javax.swing.JLabel();
        jLabelDescBurger4 = new javax.swing.JLabel();
        jLabelDescBurger5 = new javax.swing.JLabel();
        jLabelValorBurger2 = new javax.swing.JLabel();
        jLabelImage3 = new javax.swing.JLabel();
        jButtonAddBatataSuprema = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanelBurger2 = new javax.swing.JPanel();
        jLabelNomeBurger = new javax.swing.JLabel();
        jLabelDescBurger1 = new javax.swing.JLabel();
        jLabelDescBurger = new javax.swing.JLabel();
        jLabelValorBurger = new javax.swing.JLabel();
        jLabelImage5 = new javax.swing.JLabel();
        jButtonAddMasterChicken = new javax.swing.JButton();
        jPanelBurger5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelImage7 = new javax.swing.JLabel();
        jButtonAddBigBomb = new javax.swing.JButton();
        jPanelBurger6 = new javax.swing.JPanel();
        jLabelNomeBurger1 = new javax.swing.JLabel();
        jLabelDescBurger2 = new javax.swing.JLabel();
        jLabelDescBurger3 = new javax.swing.JLabel();
        jLabelValorBurger1 = new javax.swing.JLabel();
        jLabelImage6 = new javax.swing.JLabel();
        jButtonAddBurger710 = new javax.swing.JButton();
        jPanelBurger4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabelImage8 = new javax.swing.JLabel();
        jButtonAddBig710 = new javax.swing.JButton();
        jPanelBurger1 = new javax.swing.JPanel();
        jLabelImage0 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButtonAddClássico = new javax.swing.JButton();
        jPanelBurger3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabelImage4 = new javax.swing.JLabel();
        jButtonAddBombBacon = new javax.swing.JButton();
        jLabelTitulo2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelBurger8 = new javax.swing.JPanel();
        jLabelNomeBurger3 = new javax.swing.JLabel();
        jLabelDescBurger6 = new javax.swing.JLabel();
        jLabelValorBurger3 = new javax.swing.JLabel();
        jLabelImage2 = new javax.swing.JLabel();
        jButtonAddBatata = new javax.swing.JButton();
        jLabelImageBackground = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(java.awt.Color.white);
        jLabelTitulo.setText("Hambúrguer Artesanal");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabelTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo1.setForeground(java.awt.Color.white);
        jLabelTitulo1.setText("Pedido:");
        getContentPane().add(jLabelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 590, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 630, 1630, 20));

        jPanelBurger7.setBackground(new java.awt.Color(0, 0, 0));

        jLabelNomeBurger2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNomeBurger2.setForeground(java.awt.Color.white);
        jLabelNomeBurger2.setText("Batata Suprema");
        jLabelNomeBurger2.setToolTipText("");

        jLabelDescBurger4.setForeground(java.awt.Color.white);
        jLabelDescBurger4.setText("Porção de batata  frita, com acréscimo de cheddar e bacon.");
        jLabelDescBurger4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelDescBurger5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelValorBurger2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelValorBurger2.setForeground(java.awt.Color.white);
        jLabelValorBurger2.setText("R$35,00");

        jLabelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/bacon-e-cheddar-porcao (1).png"))); // NOI18N

        jButtonAddBatataSuprema.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAddBatataSuprema.setText("+");
        jButtonAddBatataSuprema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddBatataSupremaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBurger7Layout = new javax.swing.GroupLayout(jPanelBurger7);
        jPanelBurger7.setLayout(jPanelBurger7Layout);
        jPanelBurger7Layout.setHorizontalGroup(
            jPanelBurger7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBurger7Layout.createSequentialGroup()
                .addComponent(jLabelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBurger7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBurger7Layout.createSequentialGroup()
                        .addComponent(jLabelNomeBurger2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelBurger7Layout.createSequentialGroup()
                        .addGroup(jPanelBurger7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelBurger7Layout.createSequentialGroup()
                                .addComponent(jLabelValorBurger2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAddBatataSuprema))
                            .addComponent(jLabelDescBurger4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDescBurger5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelBurger7Layout.setVerticalGroup(
            jPanelBurger7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBurger7Layout.createSequentialGroup()
                .addGroup(jPanelBurger7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImage3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelBurger7Layout.createSequentialGroup()
                        .addGroup(jPanelBurger7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBurger7Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabelDescBurger5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBurger7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelNomeBurger2)
                                .addGap(9, 9, 9)
                                .addComponent(jLabelDescBurger4)
                                .addGap(28, 28, 28)
                                .addGroup(jPanelBurger7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelValorBurger2)
                                    .addComponent(jButtonAddBatataSuprema))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanelBurger7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 640, 470, 110));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 280, 1630, 20));

        jPanelBurger2.setBackground(new java.awt.Color(0, 0, 0));

        jLabelNomeBurger.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNomeBurger.setForeground(java.awt.Color.white);
        jLabelNomeBurger.setText("Master Chicken");
        jLabelNomeBurger.setToolTipText("");

        jLabelDescBurger1.setForeground(java.awt.Color.white);
        jLabelDescBurger1.setText("Pão selado na manteiga, hambúrguer artesanal de  frango, ");
        jLabelDescBurger1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelDescBurger.setForeground(java.awt.Color.white);
        jLabelDescBurger.setText("mussarela, fatias de bacon e salada #710.");
        jLabelDescBurger.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelValorBurger.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelValorBurger.setForeground(java.awt.Color.white);
        jLabelValorBurger.setText("R$42,00");

        jLabelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/Hamburgueria 710 (36 de 39).png"))); // NOI18N

        jButtonAddMasterChicken.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAddMasterChicken.setText("+");
        jButtonAddMasterChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddMasterChickenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBurger2Layout = new javax.swing.GroupLayout(jPanelBurger2);
        jPanelBurger2.setLayout(jPanelBurger2Layout);
        jPanelBurger2Layout.setHorizontalGroup(
            jPanelBurger2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBurger2Layout.createSequentialGroup()
                .addComponent(jLabelImage5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBurger2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBurger2Layout.createSequentialGroup()
                        .addGroup(jPanelBurger2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescBurger1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(jLabelDescBurger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelBurger2Layout.createSequentialGroup()
                                .addComponent(jLabelNomeBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanelBurger2Layout.createSequentialGroup()
                        .addComponent(jLabelValorBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddMasterChicken)
                        .addGap(19, 19, 19))))
        );
        jPanelBurger2Layout.setVerticalGroup(
            jPanelBurger2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImage5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelBurger2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNomeBurger)
                .addGap(9, 9, 9)
                .addComponent(jLabelDescBurger1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBurger2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorBurger)
                    .addComponent(jButtonAddMasterChicken))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBurger2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 440, 480, 120));

        jPanelBurger5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Big Bomb");
        jLabel5.setToolTipText("");

        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Pão selado na manteiga, dois hambúrgueres artesanais de carne");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("bovina (130 g/cada), dupla camada de queijo cheddar cremoso...");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("R$42,00");

        jLabelImage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/Hamburgueria 710 (39 de 39).png"))); // NOI18N

        jButtonAddBigBomb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAddBigBomb.setText("+");
        jButtonAddBigBomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddBigBombActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBurger5Layout = new javax.swing.GroupLayout(jPanelBurger5);
        jPanelBurger5.setLayout(jPanelBurger5Layout);
        jPanelBurger5Layout.setHorizontalGroup(
            jPanelBurger5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBurger5Layout.createSequentialGroup()
                .addComponent(jLabelImage7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBurger5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBurger5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanelBurger5Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAddBigBomb))
                        .addComponent(jLabel7)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanelBurger5Layout.setVerticalGroup(
            jPanelBurger5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBurger5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBurger5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButtonAddBigBomb))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelBurger5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelImage7))
        );

        getContentPane().add(jPanelBurger5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 480, 120));

        jPanelBurger6.setBackground(new java.awt.Color(0, 0, 0));

        jLabelNomeBurger1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNomeBurger1.setForeground(java.awt.Color.white);
        jLabelNomeBurger1.setText("Hambúrguer #710");
        jLabelNomeBurger1.setToolTipText("");

        jLabelDescBurger2.setForeground(java.awt.Color.white);
        jLabelDescBurger2.setText("Pão selado na manteiga, hambúrguer artesanal de carne bovina, ");
        jLabelDescBurger2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelDescBurger3.setForeground(java.awt.Color.white);
        jLabelDescBurger3.setText("queijo cheddar, fatias de bacon, ovo caipira, cebola roxa e picles.");
        jLabelDescBurger3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelDescBurger3.setMaximumSize(new java.awt.Dimension(346, 15));
        jLabelDescBurger3.setMinimumSize(new java.awt.Dimension(346, 15));

        jLabelValorBurger1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelValorBurger1.setForeground(java.awt.Color.white);
        jLabelValorBurger1.setText("R$35,00");

        jLabelImage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/Hamburgueria 710 (29 de 39).png"))); // NOI18N

        jButtonAddBurger710.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAddBurger710.setText("+");
        jButtonAddBurger710.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddBurger710ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBurger6Layout = new javax.swing.GroupLayout(jPanelBurger6);
        jPanelBurger6.setLayout(jPanelBurger6Layout);
        jPanelBurger6Layout.setHorizontalGroup(
            jPanelBurger6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBurger6Layout.createSequentialGroup()
                .addComponent(jLabelImage6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBurger6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBurger6Layout.createSequentialGroup()
                        .addGroup(jPanelBurger6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescBurger2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelDescBurger3, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanelBurger6Layout.createSequentialGroup()
                        .addComponent(jLabelNomeBurger1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelBurger6Layout.createSequentialGroup()
                        .addComponent(jLabelValorBurger1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddBurger710)
                        .addGap(17, 17, 17))))
        );
        jPanelBurger6Layout.setVerticalGroup(
            jPanelBurger6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBurger6Layout.createSequentialGroup()
                .addComponent(jLabelImage6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelBurger6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBurger6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAddBurger710)
                    .addGroup(jPanelBurger6Layout.createSequentialGroup()
                        .addComponent(jLabelNomeBurger1)
                        .addGap(3, 3, 3)
                        .addComponent(jLabelDescBurger2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDescBurger3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabelValorBurger1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBurger6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 480, 120));

        jPanelBurger4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(java.awt.Color.white);
        jLabel17.setText("Big #710");
        jLabel17.setToolTipText("");

        jLabel18.setForeground(java.awt.Color.white);
        jLabel18.setText("Pão selado na manteiga, dois hambúrgueres artesanais de carne bovina (130 g/cada), dupla camada de queijo cheddar cremoso, fatias de bacon, ovo caipira, cebola roxa e picles.");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel19.setForeground(java.awt.Color.white);
        jLabel19.setText("carne bovina (130 g/cada), dupla camada de queijo cheddar cremoso, fatias de bacon, ovo caipira, cebola roxa e picles.");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(java.awt.Color.white);
        jLabel20.setText("R$42,00");

        jLabelImage8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/Hamburgueria 710 (38 de 39).png"))); // NOI18N

        jButtonAddBig710.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAddBig710.setText("+");
        jButtonAddBig710.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddBig710ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBurger4Layout = new javax.swing.GroupLayout(jPanelBurger4);
        jPanelBurger4.setLayout(jPanelBurger4Layout);
        jPanelBurger4Layout.setHorizontalGroup(
            jPanelBurger4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBurger4Layout.createSequentialGroup()
                .addComponent(jLabelImage8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBurger4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBurger4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanelBurger4Layout.createSequentialGroup()
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAddBig710))
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanelBurger4Layout.setVerticalGroup(
            jPanelBurger4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBurger4Layout.createSequentialGroup()
                .addComponent(jLabelImage8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelBurger4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(12, 12, 12)
                .addComponent(jLabel18)
                .addGap(3, 3, 3)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBurger4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jButtonAddBig710))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBurger4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 460, 120));

        jPanelBurger1.setBackground(new java.awt.Color(0, 0, 0));

        jLabelImage0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/classico.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Clássico");
        jLabel9.setToolTipText("");

        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Pão selado na manteiga, hambúrguer artesanal de carne ");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setText("bovina (130 g) e queijo cheddar cremoso.");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("R$30,00");

        jButtonAddClássico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAddClássico.setText("+");
        jButtonAddClássico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddClássicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBurger1Layout = new javax.swing.GroupLayout(jPanelBurger1);
        jPanelBurger1.setLayout(jPanelBurger1Layout);
        jPanelBurger1Layout.setHorizontalGroup(
            jPanelBurger1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBurger1Layout.createSequentialGroup()
                .addComponent(jLabelImage0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBurger1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBurger1Layout.createSequentialGroup()
                        .addGroup(jPanelBurger1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(jPanelBurger1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddClássico)
                        .addGap(20, 20, 20))))
        );
        jPanelBurger1Layout.setVerticalGroup(
            jPanelBurger1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBurger1Layout.createSequentialGroup()
                .addComponent(jLabelImage0)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelBurger1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(3, 3, 3)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelBurger1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jButtonAddClássico))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBurger1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 460, 120));

        jPanelBurger3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("Bomb Bacon");
        jLabel13.setToolTipText("");

        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("Pão selado na manteiga, hambúrguer artesanal de carne bovina, ");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setText("queijo cheddar, cebola caramelizada e muito bacon.");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("R$35,00");

        jLabelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/Hamburgueria 710 (14 de 39).png"))); // NOI18N

        jButtonAddBombBacon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAddBombBacon.setText("+");
        jButtonAddBombBacon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddBombBaconActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBurger3Layout = new javax.swing.GroupLayout(jPanelBurger3);
        jPanelBurger3.setLayout(jPanelBurger3Layout);
        jPanelBurger3Layout.setHorizontalGroup(
            jPanelBurger3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBurger3Layout.createSequentialGroup()
                .addComponent(jLabelImage4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBurger3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBurger3Layout.createSequentialGroup()
                        .addGroup(jPanelBurger3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelBurger3Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanelBurger3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddBombBacon)
                        .addGap(17, 17, 17))))
        );
        jPanelBurger3Layout.setVerticalGroup(
            jPanelBurger3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBurger3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelImage4))
            .addGroup(jPanelBurger3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(3, 3, 3)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBurger3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jButtonAddBombBacon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBurger3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 290, 480, 120));

        jLabelTitulo2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo2.setForeground(java.awt.Color.white);
        jLabelTitulo2.setText("Porções");
        getContentPane().add(jLabelTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Pedido", "Quantidade", "Valor"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 640, 480, 110));

        jPanelBurger8.setBackground(new java.awt.Color(0, 0, 0));

        jLabelNomeBurger3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNomeBurger3.setForeground(java.awt.Color.white);
        jLabelNomeBurger3.setText("Batata Palito");
        jLabelNomeBurger3.setToolTipText("");

        jLabelDescBurger6.setForeground(java.awt.Color.white);
        jLabelDescBurger6.setText("Porção de batata  frita (300g).");
        jLabelDescBurger6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelValorBurger3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelValorBurger3.setForeground(java.awt.Color.white);
        jLabelValorBurger3.setText("R$25,00");

        jLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/batata.png"))); // NOI18N

        jButtonAddBatata.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAddBatata.setText("+");
        jButtonAddBatata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddBatataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBurger8Layout = new javax.swing.GroupLayout(jPanelBurger8);
        jPanelBurger8.setLayout(jPanelBurger8Layout);
        jPanelBurger8Layout.setHorizontalGroup(
            jPanelBurger8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBurger8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImage2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBurger8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBurger8Layout.createSequentialGroup()
                        .addGroup(jPanelBurger8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescBurger6, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                            .addGroup(jPanelBurger8Layout.createSequentialGroup()
                                .addComponent(jLabelNomeBurger3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanelBurger8Layout.createSequentialGroup()
                        .addComponent(jLabelValorBurger3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddBatata)
                        .addGap(15, 15, 15))))
        );
        jPanelBurger8Layout.setVerticalGroup(
            jPanelBurger8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBurger8Layout.createSequentialGroup()
                .addComponent(jLabelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBurger8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBurger8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBurger8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAddBatata))
                    .addGroup(jPanelBurger8Layout.createSequentialGroup()
                        .addComponent(jLabelNomeBurger3)
                        .addGap(9, 9, 9)
                        .addComponent(jLabelDescBurger6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelValorBurger3)))
                .addContainerGap())
        );

        getContentPane().add(jPanelBurger8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 460, 110));

        jLabelImageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/Background.png"))); // NOI18N
        getContentPane().add(jLabelImageBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -30, -1, 1120));

        jMenu1.setText("Cadastro");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/cliente-icon.png"))); // NOI18N
        jMenuItem1.setText("Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/cliente-icon.png"))); // NOI18N
        jMenuItem2.setText("Funcionário");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pedido");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/agenda-icon.png"))); // NOI18N
        jMenuItem3.setText("Realizar Pedido");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        this.controller.navegarParaCadastro();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
        this.controller.navegarParaCadastro();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
        this.controller.navegarParaAgenda();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButtonAddClássicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddClássicoActionPerformed
        Hamburguer hamburguer1 = new Hamburguer(1, "CLÁSSICO", "", 35.0);
        controller.adicionarItemClicado(hamburguer1);
        //new PedidoDAO().insert(hamburguer1);

    }//GEN-LAST:event_jButtonAddClássicoActionPerformed

    private void jButtonAddBurger710ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddBurger710ActionPerformed
        Hamburguer hamburguer2 = new Hamburguer(2, "BURGER #710", "", 35.0);
        controller.adicionarItemClicado(hamburguer2);
        // new PedidoDAO().insert(hamburguer2);
    }//GEN-LAST:event_jButtonAddBurger710ActionPerformed

    private void jButtonAddBig710ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddBig710ActionPerformed
        Hamburguer hamburguer4 = new Hamburguer(4, "BIG #710", "", 45.0);
        controller.adicionarItemClicado(hamburguer4);
        //new PedidoDAO().insert(hamburguer4);
    }//GEN-LAST:event_jButtonAddBig710ActionPerformed

    private void jButtonAddBatataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddBatataActionPerformed
        Hamburguer hamburguer7 = new Hamburguer(7, "BATATA FRITA #710", "Descrição do Clássico", 25.0);
        controller.adicionarItemClicado(hamburguer7);
    }//GEN-LAST:event_jButtonAddBatataActionPerformed

    private void jButtonAddBatataSupremaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddBatataSupremaActionPerformed
        Hamburguer hamburguer8 = new Hamburguer(8, "BATATA FRITA SUPREMA", "Descrição do Clássico", 35.0);
        controller.adicionarItemClicado(hamburguer8);
    }//GEN-LAST:event_jButtonAddBatataSupremaActionPerformed

    private void jButtonAddBombBaconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddBombBaconActionPerformed
        Hamburguer hamburguer3 = new Hamburguer(3, "BOMB BACON", "Descrição do Clássico", 35.0);
        controller.adicionarItemClicado(hamburguer3);
    }//GEN-LAST:event_jButtonAddBombBaconActionPerformed

    private void jButtonAddMasterChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddMasterChickenActionPerformed
        Hamburguer hamburguer6 = new Hamburguer(6, "MASTER CHICKEN", "Descrição do Clássico", 35.0);
        controller.adicionarItemClicado(hamburguer6);
    }//GEN-LAST:event_jButtonAddMasterChickenActionPerformed

    private void jButtonAddBigBombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddBigBombActionPerformed
        Hamburguer hamburguer5 = new Hamburguer(5, "BIG BOMB ", "Descrição do Clássico", 45.0);
        controller.adicionarItemClicado(hamburguer5);
    }//GEN-LAST:event_jButtonAddBigBombActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
                MenuPrincipal menu = new MenuPrincipal();
                menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddBatata;
    private javax.swing.JButton jButtonAddBatataSuprema;
    private javax.swing.JButton jButtonAddBig710;
    private javax.swing.JButton jButtonAddBigBomb;
    private javax.swing.JButton jButtonAddBombBacon;
    private javax.swing.JButton jButtonAddBurger710;
    private javax.swing.JButton jButtonAddClássico;
    private javax.swing.JButton jButtonAddMasterChicken;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDescBurger;
    private javax.swing.JLabel jLabelDescBurger1;
    private javax.swing.JLabel jLabelDescBurger2;
    private javax.swing.JLabel jLabelDescBurger3;
    private javax.swing.JLabel jLabelDescBurger4;
    private javax.swing.JLabel jLabelDescBurger5;
    private javax.swing.JLabel jLabelDescBurger6;
    private javax.swing.JLabel jLabelImage0;
    private javax.swing.JLabel jLabelImage2;
    private javax.swing.JLabel jLabelImage3;
    private javax.swing.JLabel jLabelImage4;
    private javax.swing.JLabel jLabelImage5;
    private javax.swing.JLabel jLabelImage6;
    private javax.swing.JLabel jLabelImage7;
    private javax.swing.JLabel jLabelImage8;
    private javax.swing.JLabel jLabelImageBackground;
    private javax.swing.JLabel jLabelNomeBurger;
    private javax.swing.JLabel jLabelNomeBurger1;
    private javax.swing.JLabel jLabelNomeBurger2;
    private javax.swing.JLabel jLabelNomeBurger3;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JLabel jLabelValorBurger;
    private javax.swing.JLabel jLabelValorBurger1;
    private javax.swing.JLabel jLabelValorBurger2;
    private javax.swing.JLabel jLabelValorBurger3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanelBurger1;
    private javax.swing.JPanel jPanelBurger2;
    private javax.swing.JPanel jPanelBurger3;
    private javax.swing.JPanel jPanelBurger4;
    private javax.swing.JPanel jPanelBurger5;
    private javax.swing.JPanel jPanelBurger6;
    private javax.swing.JPanel jPanelBurger7;
    private javax.swing.JPanel jPanelBurger8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public JTable getTable() {
        return jTable1;
    }

    public void setTable(JTable Table) {
        this.jTable1 = Table;
    }
}
