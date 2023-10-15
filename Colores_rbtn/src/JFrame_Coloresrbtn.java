import java.awt.Color;
/**
 *
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class JFrame_Coloresrbtn extends javax.swing.JFrame {
    public JFrame_Coloresrbtn() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGColores = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        pnlColores = new javax.swing.JPanel();
        rbtRojo = new javax.swing.JRadioButton();
        rbtAzul = new javax.swing.JRadioButton();
        rbtVerde = new javax.swing.JRadioButton();
        lblRojo = new javax.swing.JLabel();
        lblAzul = new javax.swing.JLabel();
        lblVerde = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));
        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Colores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        pnlColores.setBackground(new java.awt.Color(36, 40, 56));
        pnlColores.setForeground(new java.awt.Color(51, 138, 187));

        btnGColores.add(rbtRojo);
        rbtRojo.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        rbtRojo.setForeground(new java.awt.Color(255, 153, 153));
        rbtRojo.setText("ROJO");
        rbtRojo.setToolTipText("");
        rbtRojo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtRojoMouseClicked(evt);
            }
        });

        btnGColores.add(rbtAzul);
        rbtAzul.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        rbtAzul.setForeground(new java.awt.Color(153, 153, 255));
        rbtAzul.setText("AZUL");
        rbtAzul.setToolTipText("");
        rbtAzul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtAzulMouseClicked(evt);
            }
        });

        btnGColores.add(rbtVerde);
        rbtVerde.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        rbtVerde.setForeground(new java.awt.Color(153, 255, 153));
        rbtVerde.setText("VERDE");
        rbtVerde.setToolTipText("");
        rbtVerde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtVerdeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlColoresLayout = new javax.swing.GroupLayout(pnlColores);
        pnlColores.setLayout(pnlColoresLayout);
        pnlColoresLayout.setHorizontalGroup(
            pnlColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlColoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtVerde)
                    .addComponent(rbtRojo)
                    .addComponent(rbtAzul))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlColoresLayout.setVerticalGroup(
            pnlColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlColoresLayout.createSequentialGroup()
                .addComponent(rbtRojo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtAzul)
                .addGap(12, 12, 12)
                .addComponent(rbtVerde)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        lblRojo.setOpaque(true);

        lblAzul.setOpaque(true);

        lblVerde.setOpaque(true);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(pnlColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 204, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lblRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 179, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtRojoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtRojoMouseClicked
            //Colorear label.
        lblRojo.setBackground(Color.RED);
            //Descolorear los otros labels
        lblVerde.setBackground(Color.gray);
        lblAzul.setBackground(Color.gray);
    }//GEN-LAST:event_rbtRojoMouseClicked

    private void rbtAzulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtAzulMouseClicked
            //Colorear label.
        lblAzul.setBackground(Color.blue);
            //Descolorear los otros labels.
        lblRojo.setBackground(Color.gray);
        lblVerde.setBackground(Color.gray);
    }//GEN-LAST:event_rbtAzulMouseClicked

    private void rbtVerdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtVerdeMouseClicked
            //Colorear label.
        lblVerde.setBackground(Color.green);
            //Descolorear los otros labels
        lblAzul.setBackground(Color.gray);
        lblRojo.setBackground(Color.gray);
    }//GEN-LAST:event_rbtVerdeMouseClicked

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
            java.util.logging.Logger.getLogger(JFrame_Coloresrbtn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Coloresrbtn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Coloresrbtn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Coloresrbtn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Coloresrbtn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGColores;
    private javax.swing.JLabel lblAzul;
    private javax.swing.JLabel lblRojo;
    private javax.swing.JLabel lblVerde;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pnlColores;
    private javax.swing.JRadioButton rbtAzul;
    private javax.swing.JRadioButton rbtRojo;
    private javax.swing.JRadioButton rbtVerde;
    // End of variables declaration//GEN-END:variables
}
