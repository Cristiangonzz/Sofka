/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Naves.Funciones_de_las_naves;

/**
 *
 * @author laptopwin
 */
public class Funciones_Viajera extends javax.swing.JFrame {

    /**
     * Creates new form Funciones_Viajera
     */
    public Funciones_Viajera() {
        initComponents();
        setTitle("Nave Viajera");
        setLocationRelativeTo(null);
        btnfini.setVisible(false);
        Iniciar.setVisible(false);
        finalizarviaje.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnini = new javax.swing.JButton();
        btnfini = new javax.swing.JButton();
        Iniciar = new javax.swing.JLabel();
        finalizarviaje = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Despegar.png"))); // NOI18N
        btnini.setText("INICIAR VIAJE");
        btnini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniActionPerformed(evt);
            }
        });

        btnfini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Despegar.png"))); // NOI18N
        btnfini.setText("FINZALIZAR VIAJE");
        btnfini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfiniActionPerformed(evt);
            }
        });

        Iniciar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/viaje.png"))); // NOI18N
        Iniciar.setText("Ha comenzado el viaje...");
        Iniciar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Iniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Iniciar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        finalizarviaje.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        finalizarviaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/finaldelviaje.png"))); // NOI18N
        finalizarviaje.setText("Finzalizo el viaje");
        finalizarviaje.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        finalizarviaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        finalizarviaje.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jButton3.setText("Volver al Inventario");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(finalizarviaje, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnini)
                .addGap(152, 152, 152)
                .addComponent(jButton3)
                .addGap(127, 127, 127)
                .addComponent(btnfini)
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnini)
                    .addComponent(btnfini)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalizarviaje, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnfiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfiniActionPerformed
        finalizarviaje.setVisible(true);
       
       
    }//GEN-LAST:event_btnfiniActionPerformed

    private void btniniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniActionPerformed
        Iniciar.setVisible(true);
        btnfini.setVisible(true);
       
    }//GEN-LAST:event_btniniActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Funciones_Viajera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Funciones_Viajera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Funciones_Viajera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Funciones_Viajera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Funciones_Viajera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Iniciar;
    private javax.swing.JButton btnfini;
    private javax.swing.JButton btnini;
    private javax.swing.JLabel finalizarviaje;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
