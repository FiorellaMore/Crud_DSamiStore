/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsamistore_mockup.panels;

import dsamistore_mockup.modals.proveedor_eliminar_modal;
import dsamistore_mockup.proveedor_agregar_modal;
import dsamistore_mockup.proveedor_editar_modal;

/**
 *
 * @author OSCAR
 */
public class proveedor extends javax.swing.JPanel {

    /**
     * Creates new form proveedor
     */
    public proveedor() {
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

        jpProveedores = new javax.swing.JPanel();
        label6 = new java.awt.Label();
        btnProveedoresAgregar = new javax.swing.JButton();
        txtProveedoresBuscar = new javax.swing.JTextField();
        btnProveedoresBuscar = new javax.swing.JButton();
        jspProveedores = new javax.swing.JScrollPane();
        tbProveedores = new javax.swing.JTable();
        btnProveedorModificar = new javax.swing.JButton();
        btnProveedorEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jpProveedores.setBackground(new java.awt.Color(255, 255, 255));
        jpProveedores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpProveedores.setName("jp_productos"); // NOI18N

        label6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        label6.setText("Proveedores");

        btnProveedoresAgregar.setBackground(new java.awt.Color(34, 197, 94));
        btnProveedoresAgregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnProveedoresAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedoresAgregar.setText("AGREGAR");
        btnProveedoresAgregar.setToolTipText("");
        btnProveedoresAgregar.setAutoscrolls(true);
        btnProveedoresAgregar.setBorder(null);
        btnProveedoresAgregar.setBorderPainted(false);
        btnProveedoresAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedoresAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresAgregarActionPerformed(evt);
            }
        });

        btnProveedoresBuscar.setBackground(new java.awt.Color(34, 197, 94));
        btnProveedoresBuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnProveedoresBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedoresBuscar.setText("BUSCAR");
        btnProveedoresBuscar.setToolTipText("");
        btnProveedoresBuscar.setAutoscrolls(true);
        btnProveedoresBuscar.setBorder(null);
        btnProveedoresBuscar.setBorderPainted(false);
        btnProveedoresBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedoresBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresBuscarActionPerformed(evt);
            }
        });

        tbProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "RUC", "Raz??n social", "Telefono"
            }
        ));
        jspProveedores.setViewportView(tbProveedores);

        btnProveedorModificar.setBackground(new java.awt.Color(34, 197, 94));
        btnProveedorModificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnProveedorModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedorModificar.setText("MODIFICAR");
        btnProveedorModificar.setBorder(null);
        btnProveedorModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorModificarActionPerformed(evt);
            }
        });

        btnProveedorEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnProveedorEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnProveedorEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedorEliminar.setText("ELIMINAR");
        btnProveedorEliminar.setBorder(null);
        btnProveedorEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpProveedoresLayout = new javax.swing.GroupLayout(jpProveedores);
        jpProveedores.setLayout(jpProveedoresLayout);
        jpProveedoresLayout.setHorizontalGroup(
            jpProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProveedoresLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jpProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpProveedoresLayout.createSequentialGroup()
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProveedoresLayout.createSequentialGroup()
                        .addGroup(jpProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jspProveedores, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpProveedoresLayout.createSequentialGroup()
                                .addComponent(btnProveedoresAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(txtProveedoresBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProveedoresBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))))
            .addGroup(jpProveedoresLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(btnProveedorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(btnProveedorEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpProveedoresLayout.setVerticalGroup(
            jpProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProveedoresLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jpProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProveedoresAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProveedoresBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProveedoresBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jspProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProveedorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProveedorEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProveedoresAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresAgregarActionPerformed
        // TODO add your handling code here:
        proveedor_agregar_modal modal= new proveedor_agregar_modal();
        modal.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btnProveedoresAgregarActionPerformed

    private void btnProveedoresBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProveedoresBuscarActionPerformed

    private void btnProveedorModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorModificarActionPerformed
        // TODO add your handling code here:
        proveedor_editar_modal modal= new proveedor_editar_modal();
        modal.setVisible(true);
    }//GEN-LAST:event_btnProveedorModificarActionPerformed

    private void btnProveedorEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorEliminarActionPerformed
        // TODO add your handling code here:
        proveedor_eliminar_modal modal= new proveedor_eliminar_modal();
        modal.setVisible(true);
    }//GEN-LAST:event_btnProveedorEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProveedorEliminar;
    private javax.swing.JButton btnProveedorModificar;
    private javax.swing.JButton btnProveedoresAgregar;
    private javax.swing.JButton btnProveedoresBuscar;
    private javax.swing.JPanel jpProveedores;
    private javax.swing.JScrollPane jspProveedores;
    private java.awt.Label label6;
    private javax.swing.JTable tbProveedores;
    private javax.swing.JTextField txtProveedoresBuscar;
    // End of variables declaration//GEN-END:variables
}
