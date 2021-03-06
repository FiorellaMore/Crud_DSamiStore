/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsamistore_mockup.panels;

import dsamistore_mockup.categoria_agregar_modal;
import dsamistore_mockup.categoria_editar_modal;
import dsamistore_mockup.modals.categoria_eliminar_modal;

/**
 *
 * @author OSCAR
 */
public class categoria extends javax.swing.JPanel {

    /**
     * Creates new form categoria
     */
    public categoria() {
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

        jpCategorias = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        btnCategoriaAgregar = new javax.swing.JButton();
        txtCategoriaBuscar = new javax.swing.JTextField();
        btnCategoriaBuscar = new javax.swing.JButton();
        jspCategoria = new javax.swing.JScrollPane();
        tbCategoria = new javax.swing.JTable();
        btnCategoriaModificar = new javax.swing.JButton();
        btnCategoriaEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jpCategorias.setBackground(new java.awt.Color(255, 255, 255));
        jpCategorias.setName("jpCategorias"); // NOI18N

        label2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        label2.setText("Categoria");

        btnCategoriaAgregar.setBackground(new java.awt.Color(34, 197, 94));
        btnCategoriaAgregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCategoriaAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnCategoriaAgregar.setText("AGREGAR");
        btnCategoriaAgregar.setToolTipText("");
        btnCategoriaAgregar.setAutoscrolls(true);
        btnCategoriaAgregar.setBorder(null);
        btnCategoriaAgregar.setBorderPainted(false);
        btnCategoriaAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCategoriaAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaAgregarActionPerformed(evt);
            }
        });

        btnCategoriaBuscar.setBackground(new java.awt.Color(34, 197, 94));
        btnCategoriaBuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCategoriaBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnCategoriaBuscar.setText("BUSCAR");
        btnCategoriaBuscar.setToolTipText("");
        btnCategoriaBuscar.setAutoscrolls(true);
        btnCategoriaBuscar.setBorder(null);
        btnCategoriaBuscar.setBorderPainted(false);
        btnCategoriaBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCategoriaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaBuscarActionPerformed(evt);
            }
        });

        tbCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Acciones"
            }
        ));
        jspCategoria.setViewportView(tbCategoria);

        btnCategoriaModificar.setBackground(new java.awt.Color(34, 197, 94));
        btnCategoriaModificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCategoriaModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnCategoriaModificar.setText("MODIFICAR");
        btnCategoriaModificar.setBorder(null);
        btnCategoriaModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaModificarActionPerformed(evt);
            }
        });

        btnCategoriaEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnCategoriaEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCategoriaEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnCategoriaEliminar.setText("ELIMINAR");
        btnCategoriaEliminar.setBorder(null);
        btnCategoriaEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCategoriasLayout = new javax.swing.GroupLayout(jpCategorias);
        jpCategorias.setLayout(jpCategoriasLayout);
        jpCategoriasLayout.setHorizontalGroup(
            jpCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCategoriasLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jpCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCategoriasLayout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpCategoriasLayout.createSequentialGroup()
                        .addGroup(jpCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jspCategoria)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpCategoriasLayout.createSequentialGroup()
                                .addComponent(btnCategoriaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                                .addComponent(txtCategoriaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCategoriaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))))
            .addGroup(jpCategoriasLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(btnCategoriaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCategoriaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        jpCategoriasLayout.setVerticalGroup(
            jpCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCategoriasLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jpCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCategoriaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategoriaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategoriaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jspCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCategoriaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategoriaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCategoriaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaAgregarActionPerformed
        // TODO add your handling code here:
        categoria_agregar_modal modal= new categoria_agregar_modal();
        modal.setVisible(true);
    }//GEN-LAST:event_btnCategoriaAgregarActionPerformed

    private void btnCategoriaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCategoriaBuscarActionPerformed

    private void btnCategoriaModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaModificarActionPerformed
        // TODO add your handling code here:
        categoria_editar_modal modal= new categoria_editar_modal();
        modal.setVisible(true);
    }//GEN-LAST:event_btnCategoriaModificarActionPerformed

    private void btnCategoriaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaEliminarActionPerformed
        // TODO add your handling code here:
        categoria_eliminar_modal modal= new categoria_eliminar_modal();
        modal.setVisible(true);
    }//GEN-LAST:event_btnCategoriaEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategoriaAgregar;
    private javax.swing.JButton btnCategoriaBuscar;
    private javax.swing.JButton btnCategoriaEliminar;
    private javax.swing.JButton btnCategoriaModificar;
    private javax.swing.JPanel jpCategorias;
    private javax.swing.JScrollPane jspCategoria;
    private java.awt.Label label2;
    private javax.swing.JTable tbCategoria;
    private javax.swing.JTextField txtCategoriaBuscar;
    // End of variables declaration//GEN-END:variables
}
