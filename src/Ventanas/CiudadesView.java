/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import santafe_servicios.dao.CiudadDao;
import santafe_servicios.vo.CiudadVo;

public class CiudadesView extends javax.swing.JFrame implements KeyListener{
    
    public CiudadesView() {
        initComponents();
        limpiar();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_idCiudad = new javax.swing.JTextField();
        txt_nombreCiudad = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_ant = new javax.swing.JButton();
        btn_sig = new javax.swing.JButton();
        btn_menu = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        comboCiudades = new javax.swing.JComboBox<>();
        llbl_titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ciudades");

        jLabel1.setText("ID CIUDAD: ");

        jLabel2.setText("NOMBRE CIUDAD: ");

        txt_nombreCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreCiudadActionPerformed(evt);
            }
        });
        txt_nombreCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreCiudadKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nombreCiudadKeyReleased(evt);
            }
        });

        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_ant.setText("ANTERIOR");
        btn_ant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_antActionPerformed(evt);
            }
        });

        btn_sig.setText("SIGUIENTE");
        btn_sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sigActionPerformed(evt);
            }
        });

        btn_menu.setText("MENU PRINCIPAL");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        btn_agregar.setText("AGREGAR");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_modificar.setText("MODIFICAR");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        llbl_titulo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        llbl_titulo.setText("Ciudades");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btn_ant)
                        .addGap(78, 78, 78)
                        .addComponent(btn_sig)
                        .addGap(188, 188, 188)
                        .addComponent(btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboCiudades, 0, 258, Short.MAX_VALUE)
                                    .addComponent(txt_idCiudad)
                                    .addComponent(txt_nombreCiudad)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(llbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_modificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(llbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_idCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_limpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar)
                        .addGap(18, 18, 18)))
                .addComponent(btn_agregar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombreCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar)
                    .addComponent(comboCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ant)
                    .addComponent(btn_sig)
                    .addComponent(btn_menu))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    CiudadDao ciuDao = new CiudadDao();
    List<CiudadVo> ciudades = new ArrayList<>();
    int index = 0;
    int tam = 0;

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        btn_eliminar.setEnabled(true);
        btn_modificar.setEnabled(true);
        try {
            ciudades = ciuDao.obtenerCiudades();
            tam = ciudades.size() - 1;
            txt_idCiudad.setText("" + ciudades.get(index).getId_ciudad());
            txt_nombreCiudad.setText(ciudades.get(index).getCiudad());
            
            for(CiudadVo nombreCiudad: ciudades){
                comboCiudades.addItem(nombreCiudad.getCiudad());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_antActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_antActionPerformed
        if (index > 0) {
            index = index - 1;
            txt_idCiudad.setText("" + ciudades.get(index).getId_ciudad());
            txt_nombreCiudad.setText(ciudades.get(index).getCiudad());
        } else {
            System.out.println("es el primero");
        }
    }//GEN-LAST:event_btn_antActionPerformed

    private void btn_sigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sigActionPerformed
        if (index < tam) {
            index = index + 1;
            txt_idCiudad.setText("" + ciudades.get(index).getId_ciudad());
            txt_nombreCiudad.setText(ciudades.get(index).getCiudad());
        } else {
            System.out.println("es el ultimo");
        }
    }//GEN-LAST:event_btn_sigActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_idCiudad.setText("");
        txt_nombreCiudad.setText("");
        btn_agregar.setEnabled(true);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        int id_ciudad = Integer.parseInt(txt_idCiudad.getText());
        String nombre = txt_nombreCiudad.getText();
        int resultado = ciuDao.agregarCiudad(id_ciudad,nombre);
        if(resultado==1){
            JOptionPane.showMessageDialog(this, "Se ha creado correctamente la ciudad");
        }else{
            JOptionPane.showMessageDialog(this, "No Se pudo agregar la nueva ciudad");
        }
        limpiar();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int id_ciudad = Integer.parseInt(txt_idCiudad.getText());
        int resultado = ciuDao.eliminarCiudad(id_ciudad);
        if(resultado==1){
            JOptionPane.showMessageDialog(this, "Se ha eliminado correctamente la ciudad");
        }else{
            JOptionPane.showMessageDialog(this, "No Se pudo eliminar la ciudad "+ txt_nombreCiudad.getText());
        }
        limpiar();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        int id_ciudad = Integer.parseInt(txt_idCiudad.getText());
        String nombre = txt_nombreCiudad.getText();
        int resultado = ciuDao.modificarCiudad(id_ciudad, nombre);
        if(resultado==1){
            JOptionPane.showMessageDialog(this, "Se ha modificado correctamente la ciudad");
        }else{
            JOptionPane.showMessageDialog(this, "No Se pudo modificar la ciudad");
        }
        limpiar();
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void txt_nombreCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreCiudadActionPerformed
        
    }//GEN-LAST:event_txt_nombreCiudadActionPerformed

    private void txt_nombreCiudadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreCiudadKeyPressed

    }//GEN-LAST:event_txt_nombreCiudadKeyPressed

    private void txt_nombreCiudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreCiudadKeyReleased
        try {
            System.out.println("letra -> "+evt.getKeyChar());
            comboCiudades.removeAllItems();
            ciudades.clear();
            ciudades = ciuDao.busquedaPorCiudad(txt_nombreCiudad.getText());
            for(CiudadVo ciud: ciudades){
                comboCiudades.addItem(ciud.getCiudad());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txt_nombreCiudadKeyReleased

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
            java.util.logging.Logger.getLogger(CiudadesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CiudadesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CiudadesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CiudadesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CiudadesView().setVisible(true);
            }
        });
    }

    public void limpiar(){
        txt_idCiudad.setText("");
        txt_nombreCiudad.setText("");
        btn_agregar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        btn_modificar.setEnabled(true);
        index=0;
        tam=0;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_ant;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_sig;
    private javax.swing.JComboBox<String> comboCiudades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel llbl_titulo;
    private javax.swing.JTextField txt_idCiudad;
    private javax.swing.JTextField txt_nombreCiudad;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
