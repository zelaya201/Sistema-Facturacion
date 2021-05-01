/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import classes.ImgTabla;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
public class Producto extends javax.swing.JPanel {

    ArrayList<classes.Producto> productos;
    DefaultTableModel modelo;
    
    public Producto(ArrayList<classes.Producto> productos) {
        initComponents();
        this.productos = productos;
//        classes.Producto p1 = new classes.Producto(1, "Sacapuntas Facela Skin Avenguers", 1.50);
//        classes.Producto p2 = new classes.Producto(2, "Libro Scribe Matematicas - 500 pags", 4);
//        productos.add(p1);
//        productos.add(p1);
        
        mostrarProductos();
    }

    private void mostrarProductos() {
        DecimalFormatSymbols s = new DecimalFormatSymbols();
        s.setDecimalSeparator('.');
        DecimalFormat f = new DecimalFormat("0.00", s);
        
        modelo = (DefaultTableModel)tbProductos.getModel();
        modelo.setRowCount(0); //Limpia la tabla
        
        for(classes.Producto x: productos){                      
            modelo.addRow(new Object []{
                x.getCodigo(),
                x.getDescripcion(),
                "$ " + f.format(x.getPrecio()),
            });
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tbProductos = new rojerusan.RSTableMetro();
        btnNuevoProducto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 0, 0, new java.awt.Color(19, 22, 29)), javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(204, 204, 204))));

        tbProductos.setBackground(new java.awt.Color(255, 255, 255));
        tbProductos.setForeground(new java.awt.Color(255, 255, 255));
        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Descripción", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        tbProductos.setFuenteFilas(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tbProductos.setFuenteFilasSelect(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbProductos.setFuenteHead(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tbProductos.setGridColor(new java.awt.Color(255, 255, 255));
        tbProductos.setGrosorBordeFilas(0);
        tbProductos.setRowHeight(25);
        tbProductos.getTableHeader().setResizingAllowed(false);
        tbProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane12.setViewportView(tbProductos);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        btnNuevoProducto.setBackground(new java.awt.Color(8, 69, 159));
        btnNuevoProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNuevoProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_25px.png"))); // NOI18N
        btnNuevoProducto.setText("Nueva Producto");
        btnNuevoProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoProducto.setOpaque(true);
        btnNuevoProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoProductoMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list_view_20px.png"))); // NOI18N
        jLabel1.setText("Productos / Inventario");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoProductoMouseClicked
        NuevoProducto nuevoP = new NuevoProducto(new JFrame(), true, this, productos);
        nuevoP.setVisible(true);
    }//GEN-LAST:event_btnNuevoProductoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnNuevoProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JScrollPane jScrollPane12;
    private rojerusan.RSTableMetro tbProductos;
    // End of variables declaration//GEN-END:variables

}
