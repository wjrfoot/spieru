/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gov.usda.ars.spieru.durum;


/**
 *
 * @author wjrfo
 */
public class SubImagePlusFrame extends javax.swing.JFrame {

    /**
     * Creates new form SubImagePlusFrame
     */
    public SubImagePlusFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kernelJTF = new javax.swing.JTextField();
        chalkJTF = new javax.swing.JTextField();
        kernelPictJL = new javax.swing.JLabel();
        chalkPictJL1 = new javax.swing.JLabel();
        originalPictJL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        percentJTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Kernel:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 353, -1, -1));

        jLabel2.setText("Chalk:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 356, -1, -1));

        kernelJTF.setEditable(false);
        kernelJTF.setText("jTextField1");
        getContentPane().add(kernelJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 350, 113, -1));

        chalkJTF.setEditable(false);
        chalkJTF.setText("jTextField1");
        chalkJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chalkJTFActionPerformed(evt);
            }
        });
        getContentPane().add(chalkJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 350, 221, -1));
        getContentPane().add(kernelPictJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 20, 256, 256));
        getContentPane().add(chalkPictJL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 20, 256, 256));
        getContentPane().add(originalPictJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 256, 256));

        jLabel3.setText("Chalk%");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 353, -1, -1));

        percentJTF.setEditable(false);
        percentJTF.setText("jTextField1");
        getContentPane().add(percentJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 350, 113, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chalkJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chalkJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chalkJTFActionPerformed

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
            java.util.logging.Logger.getLogger(SubImagePlusFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubImagePlusFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubImagePlusFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubImagePlusFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubImagePlusFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chalkJTF;
    private javax.swing.JLabel chalkPictJL1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField kernelJTF;
    private javax.swing.JLabel kernelPictJL;
    private javax.swing.JLabel originalPictJL;
    private javax.swing.JTextField percentJTF;
    // End of variables declaration//GEN-END:variables


//<editor-fold defaultstate="collapsed" desc="getters">
    
    public javax.swing.JTextField getChalkJTF() {
        return chalkJTF;
    }

    public javax.swing.JTextField getKernelJTF() {
        return kernelJTF;
    }
    
    public javax.swing.JTextField getPercentJTF() {
        return percentJTF;
    }
    
    public javax.swing.JLabel getChalkPictJL() {
        return chalkPictJL1;
    }

    public javax.swing.JLabel getKernelPitJL() {
        return kernelPictJL;
    }

    public javax.swing.JLabel getOriginalPitJL() {
        return originalPictJL;
    }
//</editor-fold>

}