/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsamistore_mockup.panels;

import dsamistore_mockup.modals.usuario_editar_modal;
import dsamistore_mockup.modals.usuario_eliminar_modal;
import dsamistore_mockup.usuario_agregar_modal;

/**
 *
 * @author OSCAR
 */
public class usuario extends javax.swing.JPanel {

    /**
     * Creates new form usuario
     */
    public usuario() {
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

        jpUsuarios = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jPanel4 = new javax.swing.JPanel();
        btnUsuarioAgregar = new javax.swing.JButton();
        txtUsuarioBuscar = new javax.swing.JTextField();
        btnUsuarioBuscar = new javax.swing.JButton();
        jspUsuarios = new javax.swing.JScrollPane();
        tbUsuario = new javax.swing.JTable();
        btnUsuarioModificar = new javax.swing.JButton();
        btnUsuarioEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jpUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        label1.setText("Usuario");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnUsuarioAgregar.setBackground(new java.awt.Color(34, 197, 94));
        btnUsuarioAgregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUsuarioAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarioAgregar.setText("AGREGAR");
        btnUsuarioAgregar.setToolTipText("");
        btnUsuarioAgregar.setAutoscrolls(true);
        btnUsuarioAgregar.setBorder(null);
        btnUsuarioAgregar.setBorderPainted(false);
        btnUsuarioAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarioAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioAgregarActionPerformed(evt);
            }
        });

        btnUsuarioBuscar.setBackground(new java.awt.Color(34, 197, 94));
        btnUsuarioBuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUsuarioBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarioBuscar.setText("BUSCAR");
        btnUsuarioBuscar.setToolTipText("");
        btnUsuarioBuscar.setAutoscrolls(true);
        btnUsuarioBuscar.setBorder(null);
        btnUsuarioBuscar.setBorderPainted(false);
        btnUsuarioBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarioBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioBuscarActionPerformed(evt);
            }
        });

        tbUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Usuario", "Email", "Rol"
            }
        ));
        jspUsuarios.setViewportView(tbUsuario);

        btnUsuarioModificar.setBackground(new java.awt.Color(34, 197, 94));
        btnUsuarioModificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUsuarioModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarioModificar.setText("MODIFICAR");
        btnUsuarioModificar.setBorder(null);
        btnUsuarioModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioModificarActionPerformed(evt);
            }
        });

        btnUsuarioEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnUsuarioEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUsuarioEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarioEliminar.setText("ELIMINAR");
        btnUsuarioEliminar.setBorder(null);
        btnUsuarioEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jspUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnUsuarioAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsuarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUsuarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnUsuarioModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(btnUsuarioEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUsuarioAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jspUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUsuarioModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnUsuarioEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jpUsuariosLayout = new javax.swing.GroupLayout(jpUsuarios);
        jpUsuarios.setLayout(jpUsuariosLayout);
        jpUsuariosLayout.setHorizontalGroup(
            jpUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpUsuariosLayout.setVerticalGroup(
            jpUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsuariosLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioAgregarActionPerformed
        // TODO add your handling code here:
        usuario_agregar_modal modal= new usuario_agregar_modal();
        modal.setVisible(true);
        // this.dispose();
    }//GEN-LAST:event_btnUsuarioAgregarActionPerformed

    private void btnUsuarioBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuarioBuscarActionPerformed

    private void btnUsuarioModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioModificarActionPerformed
        // TODO add your handling code here:
        usuario_editar_modal modal= new usuario_editar_modal();
        modal.setVisible(true);
    }//GEN-LAST:event_btnUsuarioModificarActionPerformed

    private void btnUsuarioEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioEliminarActionPerformed
        // TODO add your handling code here:
        usuario_eliminar_modal modal= new usuario_eliminar_modal();
        modal.setVisible(true);
    }//GEN-LAST:event_btnUsuarioEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuarioAgregar;
    private javax.swing.JButton btnUsuarioBuscar;
    private javax.swing.JButton btnUsuarioEliminar;
    private javax.swing.JButton btnUsuarioModificar;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jpUsuarios;
    private javax.swing.JScrollPane jspUsuarios;
    private java.awt.Label label1;
    private javax.swing.JTable tbUsuario;
    private javax.swing.JTextField txtUsuarioBuscar;
    // End of variables declaration//GEN-END:variables
}
