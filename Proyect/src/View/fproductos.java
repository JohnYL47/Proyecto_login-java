/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author SENA
 */
public class fproductos extends javax.swing.JFrame {

    /**
     * Creates new form fproductos
     */
    public fproductos() {
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

        jPanel1 = new javax.swing.JPanel();
        a = new javax.swing.JLabel();
        volver_Producto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_Products = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLNombre3 = new javax.swing.JLabel();
        jLid3 = new javax.swing.JLabel();
        jLApellido3 = new javax.swing.JLabel();
        JTProducts_ID = new javax.swing.JTextField();
        JTProducts_Nombre = new javax.swing.JTextField();
        JTProducts_precio = new javax.swing.JTextField();
        JBProducts_Guardar = new javax.swing.JButton();
        JBProducts_Mostrar = new javax.swing.JButton();
        JBProducts_Buscar = new javax.swing.JButton();
        jLApellido4 = new javax.swing.JLabel();
        jCBProducts_categoria = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setText("Formulario de Producto");
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        volver_Producto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        volver_Producto.setText("<");
        volver_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_ProductoActionPerformed(evt);
            }
        });
        jPanel1.add(volver_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 40, 30));

        JTable_Products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTable_Products);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 255))); // NOI18N

        jLNombre3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLNombre3.setText("Nombre");

        jLid3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLid3.setText("Id");

        jLApellido3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLApellido3.setText("precio");

        JTProducts_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTProducts_IDActionPerformed(evt);
            }
        });

        JTProducts_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTProducts_NombreActionPerformed(evt);
            }
        });

        JTProducts_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTProducts_precioActionPerformed(evt);
            }
        });

        JBProducts_Guardar.setText("Guardar");

        JBProducts_Mostrar.setText("Mostrar");

        JBProducts_Buscar.setText("Buscar");
        JBProducts_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBProducts_BuscarActionPerformed(evt);
            }
        });

        jLApellido4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLApellido4.setText("categoria");

        jCBProducts_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bebidas", "cereales", "frutas", "dulces", "lacteos", "carnes", " " }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(JBProducts_Guardar)
                        .addGap(29, 29, 29)
                        .addComponent(JBProducts_Mostrar)
                        .addGap(30, 30, 30)
                        .addComponent(JBProducts_Buscar))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLApellido3)
                            .addComponent(jLNombre3)
                            .addComponent(jLid3)
                            .addComponent(jLApellido4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTProducts_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(JTProducts_Nombre)
                            .addComponent(JTProducts_precio)
                            .addComponent(jCBProducts_categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTProducts_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLid3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTProducts_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombre3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLApellido3)
                    .addComponent(JTProducts_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLApellido4)
                    .addComponent(jCBProducts_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBProducts_Guardar)
                    .addComponent(JBProducts_Mostrar)
                    .addComponent(JBProducts_Buscar))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTProducts_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTProducts_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTProducts_IDActionPerformed

    private void JTProducts_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTProducts_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTProducts_NombreActionPerformed

    private void JTProducts_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTProducts_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTProducts_precioActionPerformed

    private void JBProducts_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBProducts_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBProducts_BuscarActionPerformed

    private void volver_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_ProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volver_ProductoActionPerformed

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
            java.util.logging.Logger.getLogger(fproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fproductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JBProducts_Buscar;
    public javax.swing.JButton JBProducts_Guardar;
    public javax.swing.JButton JBProducts_Mostrar;
    public javax.swing.JTextField JTProducts_ID;
    public javax.swing.JTextField JTProducts_Nombre;
    public javax.swing.JTextField JTProducts_precio;
    public javax.swing.JTable JTable_Products;
    private javax.swing.JLabel a;
    private javax.swing.JComboBox<String> jCBProducts_categoria;
    private javax.swing.JLabel jLApellido3;
    private javax.swing.JLabel jLApellido4;
    private javax.swing.JLabel jLNombre3;
    private javax.swing.JLabel jLid3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton volver_Producto;
    // End of variables declaration//GEN-END:variables
}
