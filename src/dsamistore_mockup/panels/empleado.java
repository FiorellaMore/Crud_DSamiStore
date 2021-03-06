/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsamistore_mockup.panels;

import dsamistore_mockup.empleado_agregar_modal;
import dsamistore_mockup.empleado_editar_modal;
import dsamistore_mockup.modals.empleado_eliminar_modal;

/**
 *
 * @author OSCAR
 */
public class empleado extends javax.swing.JPanel {

    /**
     * Creates new form empleado
     */
    public empleado() {
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

        jpEmpleados = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        btnEmpleadoAgregar = new javax.swing.JButton();
        txtEmpleadoBuscar = new javax.swing.JTextField();
        btnEpleadoBuscar = new javax.swing.JButton();
        jspEmpleado = new javax.swing.JScrollPane();
        tbEmpleado = new javax.swing.JTable();
        btnEmpleadoEliminar = new javax.swing.JButton();
        btnEmpleadoModificar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jpEmpleados.setBackground(new java.awt.Color(255, 255, 255));

        label3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        label3.setText("Empleado");

        btnEmpleadoAgregar.setBackground(new java.awt.Color(34, 197, 94));
        btnEmpleadoAgregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEmpleadoAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleadoAgregar.setText("AGREGAR");
        btnEmpleadoAgregar.setToolTipText("");
        btnEmpleadoAgregar.setAutoscrolls(true);
        btnEmpleadoAgregar.setBorder(null);
        btnEmpleadoAgregar.setBorderPainted(false);
        btnEmpleadoAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleadoAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoAgregarActionPerformed(evt);
            }
        });

        btnEpleadoBuscar.setBackground(new java.awt.Color(34, 197, 94));
        btnEpleadoBuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEpleadoBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnEpleadoBuscar.setText("BUSCAR");
        btnEpleadoBuscar.setToolTipText("");
        btnEpleadoBuscar.setAutoscrolls(true);
        btnEpleadoBuscar.setBorder(null);
        btnEpleadoBuscar.setBorderPainted(false);
        btnEpleadoBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tbEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellido P", "Apellido M", "Telefono", "Direccion"
            }
        ));
        jspEmpleado.setViewportView(tbEmpleado);

        btnEmpleadoEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEmpleadoEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEmpleadoEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleadoEliminar.setText("ELIMINAR");
        btnEmpleadoEliminar.setToolTipText("");
        btnEmpleadoEliminar.setAutoscrolls(true);
        btnEmpleadoEliminar.setBorder(null);
        btnEmpleadoEliminar.setBorderPainted(false);
        btnEmpleadoEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleadoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoEliminarActionPerformed(evt);
            }
        });

        btnEmpleadoModificar.setBackground(new java.awt.Color(34, 197, 94));
        btnEmpleadoModificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEmpleadoModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleadoModificar.setText("MODIFICAR");
        btnEmpleadoModificar.setBorder(null);
        btnEmpleadoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpEmpleadosLayout = new javax.swing.GroupLayout(jpEmpleados);
        jpEmpleados.setLayout(jpEmpleadosLayout);
        jpEmpleadosLayout.setHorizontalGroup(
            jpEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEmpleadosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jpEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEmpleadosLayout.createSequentialGroup()
                        .addGroup(jpEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jspEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpEmpleadosLayout.createSequentialGroup()
                                .addComponent(btnEmpleadoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                .addComponent(txtEmpleadoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEpleadoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))
                    .addGroup(jpEmpleadosLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(btnEmpleadoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(btnEmpleadoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(label3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpEmpleadosLayout.setVerticalGroup(
            jpEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEmpleadosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jpEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmpleadoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpleadoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEpleadoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEmpleadoEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btnEmpleadoModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpleadoAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoAgregarActionPerformed
        // TODO add your handling code here:
        empleado_agregar_modal modal= new empleado_agregar_modal();
        modal.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btnEmpleadoAgregarActionPerformed

    private void btnEmpleadoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoEliminarActionPerformed
        // TODO add your handling code here:
        empleado_eliminar_modal modal= new empleado_eliminar_modal();
        modal.setVisible(true);
    }//GEN-LAST:event_btnEmpleadoEliminarActionPerformed

    private void btnEmpleadoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoModificarActionPerformed
        // TODO add your handling code here:
        empleado_editar_modal modal= new empleado_editar_modal();
        modal.setVisible(true);
    }//GEN-LAST:event_btnEmpleadoModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpleadoAgregar;
    private javax.swing.JButton btnEmpleadoEliminar;
    private javax.swing.JButton btnEmpleadoModificar;
    private javax.swing.JButton btnEpleadoBuscar;
    private javax.swing.JPanel jpEmpleados;
    private javax.swing.JScrollPane jspEmpleado;
    private java.awt.Label label3;
    private javax.swing.JTable tbEmpleado;
    private javax.swing.JTextField txtEmpleadoBuscar;
    // End of variables declaration//GEN-END:variables
}
