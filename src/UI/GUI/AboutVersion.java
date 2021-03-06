package UI.GUI;

/**
 * Luokka, joka luo gui näkymän, joka näyttää version tästä sovelluksesta.
 *
 * @author jarmo
 */
public class AboutVersion extends javax.swing.JDialog {

    /**
     * luo uuden about varsion ilmentymän
     *
     * @param parent
param
     *                                                                     modal
     */
    public AboutVersion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * luo uuden about varsion ilmentymän
     */
    public AboutVersion() {
        initComponents();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About");
        setLocationByPlatform(true);

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Kyselyohjelma, joka on tarkoitettu sanaparien kyselyyn. \n\nKysyttävät sanat luetaan tiedostosta ja taulukkorakenteeseen ja niitä kysellään jerilaisissa järjestyksessä sieltä.\n");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setText("Kyselyohjelma v2.0");

        jButton1.setText("OK");
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
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   
////////    public static void main(String args[]) {
////////        /*
////////         * Set the Nimbus look and feel
////////         */
////////        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
////////        /*
////////         * If Nimbus (introduced in Java SE 6) is not available, stay with the
////////         * default look and feel.
////////         * For details see
////////         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
////////         */
////////        try {
////////            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
////////                if ("Nimbus".equals(info.getName())) {
////////                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
////////                    break;
////////                }
////////            }
////////        } catch (ClassNotFoundException ex) {
////////            java.util.logging.Logger.getLogger(AboutVersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////////        } catch (InstantiationException ex) {
////////            java.util.logging.Logger.getLogger(AboutVersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////////        } catch (IllegalAccessException ex) {
////////            java.util.logging.Logger.getLogger(AboutVersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////////        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
////////            java.util.logging.Logger.getLogger(AboutVersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////////        }
////////        //</editor-fold>
////////
////////        /*
////////         * Create and display the dialog
////////         */
////////        java.awt.EventQueue.invokeLater(new Runnable() {
////////
////////            @Override
////////            public void run() {
////////                AboutVersion dialog = new AboutVersion(new javax.swing.JFrame(), true);
////////                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
////////
////////                    @Override
////////                    public void windowClosing(java.awt.event.WindowEvent e) {
////////                        System.exit(0);
////////                    }
////////                });
////////                dialog.setVisible(true);
////////            }
////////        });
////////    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
