
package modulos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Factura extends javax.swing.JPanel {

    DefaultTableModel modelo;
    ArrayList<classes.Factura> registro;
    ArrayList<classes.Producto> producto;
    
    public Factura(ArrayList<classes.Factura> registro) {
        initComponents();
        this.registro = registro;
        mostrarDatos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSYearDate1 = new rojeru_san.componentes.RSYearDate();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaFactura = new rojerusan.RSTableMetro();
        btnNuevaFactura = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 0, 0, new java.awt.Color(19, 22, 29)), javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(204, 204, 204))));

        tablaFactura.setBackground(new java.awt.Color(255, 255, 255));
        tablaFactura.setForeground(new java.awt.Color(255, 255, 255));
        tablaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. de Factura", "Fecha", "Cliente", "Vendedor", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaFactura.setAltoHead(40);
        tablaFactura.setColorBackgoundHead(new java.awt.Color(255, 255, 255));
        tablaFactura.setColorBordeFilas(new java.awt.Color(232, 232, 232));
        tablaFactura.setColorBordeHead(new java.awt.Color(232, 232, 232));
        tablaFactura.setColorFilasBackgound2(new java.awt.Color(232, 232, 232));
        tablaFactura.setColorFilasForeground1(new java.awt.Color(0, 0, 51));
        tablaFactura.setColorFilasForeground2(new java.awt.Color(0, 0, 51));
        tablaFactura.setColorForegroundHead(new java.awt.Color(51, 51, 51));
        tablaFactura.setColorSelForeground(new java.awt.Color(51, 51, 51));
        tablaFactura.setFuenteFilas(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tablaFactura.setFuenteFilasSelect(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaFactura.setFuenteHead(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tablaFactura.setGridColor(new java.awt.Color(255, 255, 255));
        tablaFactura.setGrosorBordeFilas(0);
        tablaFactura.setRowHeight(25);
        tablaFactura.getTableHeader().setResizingAllowed(false);
        tablaFactura.getTableHeader().setReorderingAllowed(false);
        tablaFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFacturaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaFactura);
        if (tablaFactura.getColumnModel().getColumnCount() > 0) {
            tablaFactura.getColumnModel().getColumn(0).setResizable(false);
            tablaFactura.getColumnModel().getColumn(0).setPreferredWidth(1);
            tablaFactura.getColumnModel().getColumn(1).setResizable(false);
            tablaFactura.getColumnModel().getColumn(1).setPreferredWidth(20);
            tablaFactura.getColumnModel().getColumn(2).setResizable(false);
            tablaFactura.getColumnModel().getColumn(2).setPreferredWidth(250);
            tablaFactura.getColumnModel().getColumn(3).setResizable(false);
            tablaFactura.getColumnModel().getColumn(3).setPreferredWidth(250);
            tablaFactura.getColumnModel().getColumn(4).setResizable(false);
            tablaFactura.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        btnNuevaFactura.setBackground(new java.awt.Color(8, 69, 159));
        btnNuevaFactura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNuevaFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNuevaFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_25px.png"))); // NOI18N
        btnNuevaFactura.setText("Nueva Factura");
        btnNuevaFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaFactura.setOpaque(true);
        btnNuevaFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevaFacturaMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list_view_20px.png"))); // NOI18N
        jLabel1.setText("Factura / Historial");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public String obtenerFechaFormateada(Date fecha) {
        SimpleDateFormat formatFecha = new SimpleDateFormat("dd/MM/yyyy"); //Formato de fecha
        return formatFecha.format(fecha); //retorna la fecha formateada
    }
    
    public void mostrarDatos(){
        modelo = (DefaultTableModel)tablaFactura.getModel();
        modelo.setRowCount(0); //Limpia la tabla

        for(classes.Factura x : registro){
            
            modelo.addRow(new Object[]{
                "000" + x.getNumero(), //Numero de Factura
                obtenerFechaFormateada(x.getFecha()), //Fecha
                x.getCliente().getNombre(), //Cliente
                x.getVendedor().getNombre(), //Vendedor
                "$ " + x.calcularTotal() //Total venta
            });
        }
        
        tablaFactura.setModel(modelo);
        
    }
    
    public static Date ParseFecha(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try{
            fechaDate = formato.parse(fecha);
        } 
        catch(ParseException ex){
            System.out.println(ex);
        }
        
        return fechaDate;
    }
    
    private void btnNuevaFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaFacturaMouseClicked
        NuevaFactura nueva = new NuevaFactura(new JFrame(), true, this);
        nueva.setVisible(true);
    }//GEN-LAST:event_btnNuevaFacturaMouseClicked

    private void tablaFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFacturaMouseClicked
        
        classes.Factura selected = null;
        int fila = tablaFactura.getSelectedRow();
        int nFactura = Integer.parseInt(tablaFactura.getValueAt(fila, 0).toString());
        
        for(classes.Factura f : registro){
            if(f.getNumero() == nFactura){
                selected = f;
            }
        }
        
        FacturaFinal obj = new FacturaFinal(new JFrame(), true, this, selected);
        obj.setVisible(true);
    }//GEN-LAST:event_tablaFacturaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnNuevaFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private rojeru_san.componentes.RSYearDate rSYearDate1;
    private rojerusan.RSTableMetro tablaFactura;
    // End of variables declaration//GEN-END:variables
}
