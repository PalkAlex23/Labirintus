/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package halallabirintus;

/**
 *
 * @author PalkovicsAlex(SZOFT_
 */
public class AlagutKelet extends javax.swing.JFrame {

    /**
     * Creates new form masodikOldal
     */
    public AlagutKelet() {
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
        jLabel7 = new javax.swing.JLabel();
        btnAtmasz = new javax.swing.JButton();
        btnKettevag = new javax.swing.JButton();
        lblHatter2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Egy bizonyos tárgy");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Látod, hogy az akadály egy széles, barna, sziklaszerű tárgy.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 510, -1));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Megérinted, és meglepve tapasztalod, hogy lágy, szivacsszerű. ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 520, -1));

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Átmászol rajta, vagy kettévágod a kardoddal?");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 530, -1));

        btnAtmasz.setBackground(new java.awt.Color(153, 153, 255));
        btnAtmasz.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        btnAtmasz.setForeground(new java.awt.Color(51, 51, 255));
        btnAtmasz.setText("Átmászom rajta");
        btnAtmasz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtmaszActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtmasz, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 230, 120));

        btnKettevag.setBackground(new java.awt.Color(153, 153, 255));
        btnKettevag.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        btnKettevag.setForeground(new java.awt.Color(51, 51, 255));
        btnKettevag.setText("Kettévágom");
        btnKettevag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKettevagActionPerformed(evt);
            }
        });
        getContentPane().add(btnKettevag, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 230, 120));

        lblHatter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kepek/alagut.jpg"))); // NOI18N
        getContentPane().add(lblHatter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 560, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtmaszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtmaszActionPerformed
        new Atmaszas().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtmaszActionPerformed

    private void btnKettevagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKettevagActionPerformed
        new Kettevagas().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKettevagActionPerformed

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
            java.util.logging.Logger.getLogger(AlagutKelet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlagutKelet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlagutKelet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlagutKelet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlagutKelet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtmasz;
    private javax.swing.JButton btnKettevag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblHatter2;
    // End of variables declaration//GEN-END:variables
}
