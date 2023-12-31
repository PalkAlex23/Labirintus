/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package halallabirintus;

/**
 *
 * @author PalkovicsAlex(SZOFT_
 */
public class Alagut extends javax.swing.JFrame {

    /**
     * Creates new form masodikOldal
     */
    public Alagut() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnLada = new javax.swing.JButton();
        btnKelet = new javax.swing.JButton();
        lblHatter2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Elágazás az alagútban");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Néhány perc gyaloglás után egy elágazáshoz érsz az alagútban.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 510, -1));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Egy, a falra festett fehér nyíl nyugatfelé mutat. A földön nedves");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 40, 520, -1));

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("a nyíl irányába halad, míg egyikük úgy döntött, hogy keletnek megy.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 530, -1));

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("lábnyomok jelzik, merre haladtak az előtted járók.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 60, 520, -1));

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nehéz biztosan megmondani, de úgy tűnik, hogy három közülük");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 530, -1));

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nyugat vagy kelet felé veszed az irányt?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 530, -1));

        btnLada.setBackground(new java.awt.Color(153, 153, 255));
        btnLada.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        btnLada.setForeground(new java.awt.Color(51, 51, 255));
        btnLada.setText("Haladok nyugat felé");
        btnLada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLadaActionPerformed(evt);
            }
        });
        getContentPane().add(btnLada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 230, 120));

        btnKelet.setBackground(new java.awt.Color(153, 153, 255));
        btnKelet.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        btnKelet.setForeground(new java.awt.Color(51, 51, 255));
        btnKelet.setText("Haladok kelet felé");
        btnKelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeletActionPerformed(evt);
            }
        });
        getContentPane().add(btnKelet, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 230, 120));

        lblHatter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kepek/alagut.jpg"))); // NOI18N
        getContentPane().add(lblHatter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 560, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLadaActionPerformed
        new AlagutNyugat().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLadaActionPerformed

    private void btnKeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeletActionPerformed
        new AlagutKelet().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKeletActionPerformed

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
            java.util.logging.Logger.getLogger(Alagut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alagut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alagut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alagut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alagut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKelet;
    private javax.swing.JButton btnLada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblHatter2;
    // End of variables declaration//GEN-END:variables
}
