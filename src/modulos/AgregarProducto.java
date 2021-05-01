/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import classes.Detalle;
import classes.ImgTabla;
import classes.Producto;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AgregarProducto extends javax.swing.JDialog {
    ArrayList<classes.Producto> productos = new ArrayList();
    ArrayList<classes.Detalle> temp;
    NuevaFactura newFactura;
    DefaultTableModel modelo;
    
    public AgregarProducto(java.awt.Frame parent, boolean modal, NuevaFactura newFactura, ArrayList<classes.Detalle> detalle) {
        super(parent, modal);
        initComponents();
        this.newFactura = newFactura;
        this.temp = detalle;
        setLocationRelativeTo(null);
        
        classes.Producto p = new Producto(12345, "Corn Flakes", 3.75);
        productos.add(p);
        classes.Producto p1 = new Producto(17878, "Sacapuntas", 8.4);
        productos.add(p1);
        
        mostrarProductos();
    }
    
    
    private void mostrarProductos() {
        tbProductos.setDefaultRenderer(Object.class, new ImgTabla());
        modelo = (DefaultTableModel)tbProductos.getModel();
        modelo.setRowCount(0); //Limpia la tabla
       
        DecimalFormatSymbols s = new DecimalFormatSymbols();
        s.setDecimalSeparator('.');
        DecimalFormat f = new DecimalFormat("0.00", s);
        
        for (classes.Producto x: productos) {
            ImageIcon img = new ImageIcon(getClass().getResource("/img/carrito.png"));
            ImageIcon img2 = new ImageIcon(img.getImage());
            JLabel lbImg = new JLabel(img2);
            
            modelo.addRow(new Object[]{x.getCodigo(), x.getDescripcion(), "$ " + f.format(x.getPrecio()), lbImg});
            tbProductos.setRowHeight(50);
        }
        tbProductos.setModel(modelo);       
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProductos = new rojerusan.RSTableMetro();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Agregar Productos");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(102, 102, 102));
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelar.setText("Cerrar");
        btnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setOpaque(true);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        tbProductos.setBackground(new java.awt.Color(255, 255, 255));
        tbProductos.setForeground(new java.awt.Color(36, 36, 36));
        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descripcion", "Precio", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProductos.setAltoHead(40);
        tbProductos.setColorBackgoundHead(new java.awt.Color(255, 255, 255));
        tbProductos.setColorBordeFilas(new java.awt.Color(232, 232, 232));
        tbProductos.setColorBordeHead(new java.awt.Color(232, 232, 232));
        tbProductos.setColorFilasBackgound2(new java.awt.Color(232, 232, 232));
        tbProductos.setColorFilasForeground1(new java.awt.Color(0, 0, 51));
        tbProductos.setColorFilasForeground2(new java.awt.Color(0, 0, 51));
        tbProductos.setColorForegroundHead(new java.awt.Color(51, 51, 51));
        tbProductos.setColorSelForeground(new java.awt.Color(51, 51, 51));
        tbProductos.setFuenteFilas(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        tbProductos.setFuenteFilasSelect(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbProductos.setFuenteHead(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tbProductos.setGridColor(new java.awt.Color(255, 255, 255));
        tbProductos.setGrosorBordeFilas(0);
        tbProductos.setRowHeight(25);
        tbProductos.getTableHeader().setResizingAllowed(false);
        tbProductos.getTableHeader().setReorderingAllowed(false);
        tbProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbProductos);
        if (tbProductos.getColumnModel().getColumnCount() > 0) {
            tbProductos.getColumnModel().getColumn(0).setResizable(false);
            tbProductos.getColumnModel().getColumn(1).setResizable(false);
            tbProductos.getColumnModel().getColumn(1).setPreferredWidth(500);
            tbProductos.getColumnModel().getColumn(2).setResizable(false);
            tbProductos.getColumnModel().getColumn(3).setPreferredWidth(5);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1040, 1040, 1040)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void tbProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductosMouseClicked
//        int fila = tbProductos.getSelectedRow();
//        int codigo = Integer.parseInt(tbProductos.getValueAt(fila, 0).toString());
//        
//        int r = JOptionPane.showConfirmDialog(this, "¿Desea agregar este producto?", "Agregar Producto", JOptionPane.WARNING_MESSAGE);
//       
//        if (r == 0) {
//            for (Producto x: productos) {
//                if(x.getCodigo() == codigo) {
//                    try {
//                        int cantidad = Integer.valueOf(JOptionPane.showInputDialog("Ingrese la cantidad a registrar de " + String.valueOf(x.getDescripcion() + ": ")));
//                        Detalle obj = new Detalle(x, cantidad);
//
//                        temp.add(obj);
//
//                        newFactura.mostrarProductosFactura();
//                        JOptionPane.showMessageDialog(this, "Producto agregado correctamente", "Agregar Producto", JOptionPane.INFORMATION_MESSAGE);
//                    }catch(NumberFormatException e) {
//                        
//                    }
//                    
//                }
//            }
//        }
        
        int columna = tbProductos.getSelectedColumn();
       
        if (columna == 3) {
            int fila = tbProductos.getSelectedRow();
            int codigo = Integer.parseInt(tbProductos.getValueAt(fila, 0).toString());
            
            try {
                for (classes.Producto x: productos) {
                    if(x.getCodigo() == codigo) {
                        int cantidad = Integer.valueOf(JOptionPane.showInputDialog("Ingrese la cantidad a registrar de " + String.valueOf(x.getDescripcion() + ": ")));
                        Detalle obj = new Detalle(x, cantidad);
                        temp.add(obj);

                        newFactura.mostrarProductosFactura();
                        JOptionPane.showMessageDialog(this,  String.valueOf(x.getDescripcion()) + " agregado correctamente", "Agregar Producto", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }catch(NumberFormatException e) {
                
            }
        }
    }//GEN-LAST:event_tbProductosMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(NuevaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NuevaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NuevaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NuevaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                NuevaFactura dialog = new NuevaFactura(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private rojerusan.RSTableMetro tbProductos;
    // End of variables declaration//GEN-END:variables
}
