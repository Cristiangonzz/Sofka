/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Naves;

import Clases.NaveEspacial;
import Fabrica.Fabrica;
import Interface.InterfaceEspacial;
import Presentacion.Naves.Funciones_de_las_naves.Funciones_Lanzadera;
import Presentacion.Naves.Funciones_de_las_naves.Funciones_Robotica;
import Presentacion.Naves.Funciones_de_las_naves.Funciones_Tripulada;
import Presentacion.Naves.Funciones_de_las_naves.Funciones_Viajera;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cristian González
 */
public class Principal extends javax.swing.JFrame {

    
    private final InterfaceEspacial IE;
    /**
     * Creates new form Principal
     */
    public Principal() {
        
        initComponents();
        this.IE = Fabrica.getInstance().getIControladorEspacial();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Estacion Espacial");
        setLocationRelativeTo(null);
        DatosNaves();
    }
    
    
     public void DatosNaves() {
        DefaultTableModel inventario = new DefaultTableModel();
        String[] inventarioNave = new String[2];
        inventario.addColumn("Nombre");
        inventario.addColumn("Descripcion");
        int i;
        ArrayList<NaveEspacial> naves;
        
        naves = this.IE.inventario();
        for (i = 0; i < naves.size(); i++) {
            
            inventarioNave[0] = naves.get(i).getNombre().toString();
            inventarioNave[1] = naves.get(i).getNombre().toString();
            
            inventario.addRow(inventarioNave);
        }
        jTable1.setModel(inventario);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JLabelnombreViajera = new javax.swing.JLabel();
        refrescar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Crear_Nave_Viajera_ = new javax.swing.JMenuItem();
        Crear_Nave_Lanzadera_ = new javax.swing.JMenuItem();
        Crear_Nave_Robotica_ = new javax.swing.JMenuItem();
        Crear_Nave_tripulada_ = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        JLabelnombreViajera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLabelnombreViajera.setText("INVENTARIO");

        refrescar.setText("REFRESCAR");
        refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refrescarActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccionar un nombre para comenzar con una nave ya creada ...");

        jMenu1.setText("Crear una Nave");

        Crear_Nave_Viajera_.setText("Nave Viajera");
        Crear_Nave_Viajera_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_Nave_Viajera_ActionPerformed(evt);
            }
        });
        jMenu1.add(Crear_Nave_Viajera_);

        Crear_Nave_Lanzadera_.setText("Nave Lanzadera");
        Crear_Nave_Lanzadera_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_Nave_Lanzadera_ActionPerformed(evt);
            }
        });
        jMenu1.add(Crear_Nave_Lanzadera_);

        Crear_Nave_Robotica_.setText("Nave Robotica");
        Crear_Nave_Robotica_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_Nave_Robotica_ActionPerformed(evt);
            }
        });
        jMenu1.add(Crear_Nave_Robotica_);

        Crear_Nave_tripulada_.setText("Nave Tripulada");
        Crear_Nave_tripulada_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_Nave_tripulada_ActionPerformed(evt);
            }
        });
        jMenu1.add(Crear_Nave_tripulada_);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(JLabelnombreViajera))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addComponent(refrescar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLabelnombreViajera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(refrescar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Crear_Nave_Lanzadera_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_Nave_Lanzadera_ActionPerformed
       Crear_Nave_Lanzadera newNave = new Crear_Nave_Lanzadera();
       newNave.setLocationRelativeTo(null);
       newNave.setVisible(true);
    }//GEN-LAST:event_Crear_Nave_Lanzadera_ActionPerformed

    private void Crear_Nave_Viajera_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_Nave_Viajera_ActionPerformed
       Crear_NaveViajera newNave = new Crear_NaveViajera();
       newNave.setLocationRelativeTo(null);
       newNave.setVisible(true);
    }//GEN-LAST:event_Crear_Nave_Viajera_ActionPerformed

    private void Crear_Nave_Robotica_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_Nave_Robotica_ActionPerformed
       Crear_Nave_Robotica newNave = new Crear_Nave_Robotica();
       newNave.setLocationRelativeTo(null);
       newNave.setVisible(true);
    }//GEN-LAST:event_Crear_Nave_Robotica_ActionPerformed

    private void Crear_Nave_tripulada_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_Nave_tripulada_ActionPerformed
       Crear_Nave_Tripulada newNave = new Crear_Nave_Tripulada();
       newNave.setLocationRelativeTo(null);
       newNave.setVisible(true);
    }//GEN-LAST:event_Crear_Nave_tripulada_ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      
      int fila = jTable1.getSelectedRow();
      String nombre = (String) jTable1.getValueAt(fila,0);//selecciono de la fila seleccionada la primera columna
    //1 Lanzadera 
    //2 robotica
    //3 tripulada
    //4 viajera
    
      if(IE.Encontrar_Nave(nombre) == 1){
          Funciones_Lanzadera lanzadera = new Funciones_Lanzadera();
          
          lanzadera.setLocationRelativeTo(null);
          lanzadera.show(true);
        
      }else if(IE.Encontrar_Nave(nombre) == 2){
          
          Funciones_Robotica robotica = new Funciones_Robotica();
          robotica.setLocationRelativeTo(null);
          robotica.show(true);
          
      }else if(IE.Encontrar_Nave(nombre) == 3){
          Funciones_Tripulada tripulada = new Funciones_Tripulada();
          tripulada.setLocationRelativeTo(null);
          tripulada.show(true);
      }else if(IE.Encontrar_Nave(nombre) == 4){
          Funciones_Viajera Viajera = new Funciones_Viajera();
          Viajera.setLocationRelativeTo(null);
          Viajera.show(true);
      
      }else if (IE.Encontrar_Nave(nombre) == 5){
          System.out.println("A ocurrido un error");
      }else{
          System.out.println("A ocurrido un error externo");

      }
    }//GEN-LAST:event_jTable1MouseClicked

    private void refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrescarActionPerformed
        DatosNaves();
    }//GEN-LAST:event_refrescarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Crear_Nave_Lanzadera_;
    private javax.swing.JMenuItem Crear_Nave_Robotica_;
    private javax.swing.JMenuItem Crear_Nave_Viajera_;
    private javax.swing.JMenuItem Crear_Nave_tripulada_;
    private javax.swing.JLabel JLabelnombreViajera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton refrescar;
    // End of variables declaration//GEN-END:variables
}
