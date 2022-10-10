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
public class Crear_NaveViajera extends javax.swing.JFrame {

    
    private InterfaceEspacial IE;
    /**
     * Creates new form Crear_Nave
     */
    public Crear_NaveViajera() {
        this.IE = Fabrica.getInstance().getIControladorEspacial();
        initComponents();
 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        sctArtista = new javax.swing.JComboBox<>();
        txtDuracion = new javax.swing.JSpinner();
        txtEspectadorMin = new javax.swing.JSpinner();
        txtEspectadorMax = new javax.swing.JSpinner();
        txtUrl = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        sctPlataformas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabeldestinoViajera = new javax.swing.JLabel();
        txtPasajeroMax1 = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        txtCostoPasajero = new javax.swing.JSpinner();
        JLabelnombreViajera = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnCancelar1 = new javax.swing.JButton();
        btnAceptar1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtnombre_viajera = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Descripcion_Viajera = new javax.swing.JTextArea();
        txtDestinoviajera = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        as = new javax.swing.JLabel();
        txtPotenciaviajea = new javax.swing.JSpinner();
        JLabelnombreViajera1 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Organizador:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Costo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Descripcion:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Duracion:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Espectadores minimo:");

        btnCancelar.setText("Cancelar");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("URL:");

        btnAceptar.setText("Aceptar");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Espectadores maximo:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Plataforma:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.setPreferredSize(new java.awt.Dimension(110, 94));
        jScrollPane1.setViewportView(txtDescripcion);

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabeldestinoViajera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabeldestinoViajera.setText("Destino:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Costo:");

        JLabelnombreViajera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLabelnombreViajera.setText("Nombre:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Descripcion:");

        btnCancelar1.setText("Cancelar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        btnAceptar1.setText("Aceptar");
        btnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Pasajeros maximo:");

        txtnombre_viajera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre_viajeraActionPerformed(evt);
            }
        });

        Descripcion_Viajera.setColumns(20);
        Descripcion_Viajera.setRows(5);
        Descripcion_Viajera.setPreferredSize(new java.awt.Dimension(110, 94));
        jScrollPane2.setViewportView(Descripcion_Viajera);

        txtDestinoviajera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinoviajeraActionPerformed(evt);
            }
        });

        as.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        as.setText("Potencia:");

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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JLabelnombreViajera)
                                    .addComponent(jLabeldestinoViajera))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPotenciaviajea, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtnombre_viajera, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                        .addComponent(txtDestinoviajera, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                                    .addComponent(JLabelnombreViajera1))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel18))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPasajeroMax1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCostoPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(as))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(btnAceptar1)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabelnombreViajera1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelnombreViajera)
                    .addComponent(txtnombre_viajera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDestinoviajera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeldestinoViajera))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(as)
                            .addComponent(txtPotenciaviajea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtPasajeroMax1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCostoPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar1)
                    .addComponent(btnAceptar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
        String nombre = txtnombre_viajera.getText();
        String desc = Descripcion_Viajera.getText();
        String destino = txtDestinoviajera.getText();
        int potencia = (int) txtPotenciaviajea.getValue();
        int max = (int)txtPasajeroMax1.getValue();
        int costo = (int) txtCostoPasajero.getValue();
        
       
        boolean continuar = true;
        if(nombre.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "El nombre es obligatorio.");
            continuar = false;
        }
        
        if(destino.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "El Destino es obligatorio.");
            continuar = false;
        }
        if(max <=0 && continuar)
        {
            JOptionPane.showMessageDialog(this, "La cantidad maxima de pasajeros tiene que ser mayor a 0 .");
            continuar = false;
        }
        
        if(desc.isEmpty() && continuar)
        {
            JOptionPane.showMessageDialog(this, "La descripcion es obligatorio.");
            continuar = false;
        }
            
        if(potencia <=0 && continuar)
        {
            JOptionPane.showMessageDialog(this, "La potencia tiene que ser mayor a 0.");
            continuar = false;
        }
        if(costo <=0 && continuar)
        {
            JOptionPane.showMessageDialog(this, "La costo tiene que ser mayor a 0.");
            continuar = false;
        }
        if(continuar) //Es que esta todo OK
        {
            String resultado = IE.CreandoNaveViajera(nombre,desc,potencia,max,destino,costo);//Tengo que hacer la funcion en el controlador
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

    private void txtDestinoviajeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinoviajeraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinoviajeraActionPerformed

    private void txtnombre_viajeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre_viajeraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre_viajeraActionPerformed

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
            java.util.logging.Logger.getLogger(Crear_NaveViajera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_NaveViajera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_NaveViajera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_NaveViajera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_NaveViajera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Descripcion_Viajera;
    private javax.swing.JLabel JLabelnombreViajera;
    private javax.swing.JLabel JLabelnombreViajera1;
    private javax.swing.JLabel as;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabeldestinoViajera;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> sctArtista;
    private javax.swing.JComboBox<String> sctPlataformas;
    private javax.swing.JSpinner txtCosto;
    private javax.swing.JSpinner txtCostoPasajero;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDestinoviajera;
    private javax.swing.JSpinner txtDuracion;
    private javax.swing.JSpinner txtEspectadorMax;
    private javax.swing.JSpinner txtEspectadorMin;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JSpinner txtPasajeroMax1;
    private javax.swing.JSpinner txtPotenciaviajea;
    private javax.swing.JTextField txtUrl;
    private javax.swing.JTextField txtnombre_viajera;
    // End of variables declaration//GEN-END:variables
}
