/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Naves;

import Fabrica.Fabrica;
import Interface.InterfaceEspacial;
import javax.swing.JOptionPane;

/**
 *
 * @author laptopwin
 */
public class Crear_Nave_Tripulada extends javax.swing.JFrame {

    private InterfaceEspacial IE ;
    public Crear_Nave_Tripulada() {
        initComponents();
        this.IE = Fabrica.getInstance().getIControladorEspacial();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        as = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnCancelar2 = new javax.swing.JButton();
        btnAceptar1 = new javax.swing.JButton();
        jLabeldestinoViajera = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();
        txtDestino = new javax.swing.JTextField();
        JLabelnombreViajera = new javax.swing.JLabel();
        txtPotencia = new javax.swing.JSpinner();
        JLabelnombreViajera1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        as.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        as.setText("Potencia:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Descripcion:");

        btnCancelar2.setText("Cancelar");
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
            }
        });

        btnAceptar1.setText("Aceptar");
        btnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar1ActionPerformed(evt);
            }
        });

        jLabeldestinoViajera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabeldestinoViajera.setText("Mision");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        Descripcion.setColumns(20);
        Descripcion.setRows(5);
        Descripcion.setPreferredSize(new java.awt.Dimension(110, 94));
        jScrollPane2.setViewportView(Descripcion);

        txtDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinoActionPerformed(evt);
            }
        });

        JLabelnombreViajera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLabelnombreViajera.setText("Nombre:");

        JLabelnombreViajera1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLabelnombreViajera1.setText("Creando Nave");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(JLabelnombreViajera)
                                .addComponent(jLabeldestinoViajera))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(as)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabelnombreViajera1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtnombre)
                                .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAceptar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar2))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(JLabelnombreViajera1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelnombreViajera)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeldestinoViajera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(as)
                    .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAceptar1)
                            .addComponent(btnCancelar2))
                        .addGap(10, 10, 10))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelar2ActionPerformed

    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
        String nombre = txtnombre.getText();
        String desc = Descripcion.getText();
        String mision = txtDestino.getText();
        int potencia = (int)txtPotencia.getValue();
       
        boolean continuar = true;
        if(nombre.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "El nombre es obligatorio.");
            continuar = false;
        }
        
        if(potencia <=0 && continuar)
        {
            JOptionPane.showMessageDialog(this, "La Potencia debe ser mayor a 0 .");
            continuar = false;
        }
       
        
        if(mision.isEmpty()&& continuar)
        {
            JOptionPane.showMessageDialog(this, "La mision es obligatorio.");
            continuar = false;
        }
       
        if(desc.isEmpty() && continuar)
        {
            JOptionPane.showMessageDialog(this, "La descripcion es obligatorio.");
            continuar = false;
        }   
       
        if(continuar) //Es que esta todo OK
        {
            String resultado = IE.CreandoNaveTripulada(nombre,desc,potencia,mision);//Tengo que hacer la funcion en el controlador
            if(resultado == "V")//Todo OK
            {
                JOptionPane.showMessageDialog(this, "Nave creada con exito.");
                dispose();
            }else{
                if(resultado == "I") //Ya existe ese nombre
                {
                    JOptionPane.showMessageDialog(this, "El nombre ya existe.");
                }else{
                    JOptionPane.showMessageDialog(this, "Erro a la hora de crear la nave  .");
                }
            }
        }
        
    }//GEN-LAST:event_btnAceptar1ActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinoActionPerformed

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
            java.util.logging.Logger.getLogger(Crear_Nave_Tripulada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_Nave_Tripulada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_Nave_Tripulada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_Nave_Tripulada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_Nave_Tripulada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Descripcion;
    private javax.swing.JLabel JLabelnombreViajera;
    private javax.swing.JLabel JLabelnombreViajera1;
    private javax.swing.JLabel as;
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabeldestinoViajera;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JSpinner txtPotencia;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
